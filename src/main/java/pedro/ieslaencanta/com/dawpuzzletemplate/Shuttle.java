/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.ieslaencanta.com.dawpuzzletemplate;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static pedro.ieslaencanta.com.dawpuzzletemplate.Bubble.HEIGHT;
import static pedro.ieslaencanta.com.dawpuzzletemplate.Bubble.WIDTH;

/**
 *
 * @author DAWTarde
 */
public class Shuttle {
    private float angle;
    private static float max_angle = 180.0f;
    private static float min_angle = 0.0f;
    private Point2D center;
    private Bubble actual,next;
    private boolean debug;
    private float incremento=1.40625f;
    
    /*
    private next_bubble = new Bubble();
    private actual_bubble = new Bubble();
*/
    
    
    // calcular filas numero de imagen entre 16
    // calcular columnas numero de imagen modulo 16
    
    
    //crear metodo getArrowPoint2D que devuelve un Point2D con la fila y columnas
    //pinter la flecha con gc.drawImage(todos, inicioX + width * Columna, inicioY + height * Columna, width, height) 
    
    //para sacar la imagen (90-angulo)/incremento 
        
    
    
    public Shuttle(Point2D center){
    this.center = center;
    this.angle = 0.0f;
    for (float i = 90f; i > 0; i -= this.incremento){
        System.out.println("Angulo: "+i+" imagen: "+(90-i)/this.incremento+ " columna: "+((90-i)/this.incremento)/16+" fila: "+((90-i)/this.incremento)%16);
    }

    
    this.actual = this.actual;
    this.next = this.next;
        
}
    private Point2D getArrowSplitter(){
        Point2D p=null;
        int imagen,f,c;
        if(this.getAngle()<=90){
            imagen=(int)((90-this.getAngle())/this.incremento);
            f=imagen/16;
            c=imagen %16;
            p= new Point2D(c,f);
        }else{
            imagen=(int)((90+this.getAngle())/this.incremento);
            f=imagen/16;
            c=imagen %16;
            p= new Point2D(c,f);

        }
        
        return p;
    }
    
    
    public void paint(GraphicsContext gc) {
        Point2D arrow;
        arrow=this.getArrowSplitter();
            Resources r = Resources.getInstance();
            gc.drawImage(r.getImage("spriters"),
                    //inicio de la posicion
                    1,
                    1805,
                    
                    61,
                    41,
                    //dibujar en el lienzo
                    (this.center.getX() - 65 / 2) * Game.SCALE,
                    (this.center.getY() - 45 / 2) * Game.SCALE,
                    61 * Game.SCALE,
                    41 * Game.SCALE);
        if(arrow!=null){
            gc.drawImage(r.getImage("spriters"),
                    //inicio de la posicion
                    arrow.getX()*65,
                    1545+ arrow.getY()*65,
                    
                    64,
                    64,
                    //dibujar en el lienzo
                    (this.center.getX() - 64 / 2) * Game.SCALE,
                    (this.center.getY() - 64 / 2) * Game.SCALE,
                    64 * Game.SCALE,
                    64 * Game.SCALE);
        }    
        if(this.isDebug())  {
            gc.setStroke(Color.RED);
            gc.strokeText(this.angle+" º", this.center.getX()*Game.SCALE-5, this.center.getY()+100*Game.SCALE-5);
        }
            
//si se esta depurando
            
}
    //private Bubble createBubble(){
       // Bubble tempo;
        //tempo = new Bubble();
        
    //}
    public void moveLeft(){
        this.setAngle(this.getAngle() + this.incremento);
        if (getAngle()>=Shuttle.max_angle){
            this.setAngle(Shuttle.getMax_angle());
        }
}
    public void moveRight(){
        this.setAngle(this.getAngle() - this.incremento);
    if (getAngle() <= Shuttle.min_angle){
        this.setAngle(Shuttle.getMin_angle());
    }        
            }

    /**
     * @return the angle
     */
    public float getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(float angle) {
        this.angle = angle;
    }

    /**
     * @return the max_angle
     */
    public static float getMax_angle() {
        return max_angle;
    }

    /**
     * @param aMax_angle the max_angle to set
     */
    public static void setMax_angle(float aMax_angle) {
        max_angle = aMax_angle;
    }

    /**
     * @return the min_angle
     */
    public static float getMin_angle() {
        return min_angle;
    }

    /**
     * @param aMin_angle the min_angle to set
     */
    public static void setMin_angle(float aMin_angle) {
        min_angle = aMin_angle;
    }

    /**
     * @return the debug
     */
    public boolean isDebug() {
        return debug;
    }

    /**
     * @param debug the debug to set
     */
    public void setDebug(boolean debug) {
        this.debug = debug;
    }
    

}
