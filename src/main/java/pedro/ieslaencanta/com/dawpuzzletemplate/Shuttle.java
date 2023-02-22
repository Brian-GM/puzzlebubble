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
    private static final float max_angle = 180.0f;
    private static final float min_angle = 0.0f;
    private Point2D center;
    private Bubble actual,next;
    private boolean debug;
    private float incremento=180.0f/128f;
    /*
    private next_bubble = new Bubble();
    private actual_bubble = new Bubble();
*/
    
    
    
    
    
    public Shuttle(Point2D center){
    this.center = center;
    this.angle = 0.0f;
    
    
    this.actual = this.actual;
    this.next = this.next;
    
    
}
    public void paint(GraphicsContext gc) {
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
//si se esta depurando
            
}
    private Bubble createBubble(){
        Bubble tempo;
        tempo = new Bubble();
        
    }
    public void moveLeft(){
        angle += incremento;
    if (angle < Shuttle.min_angle){
        this.angle = Shuttle.min_angle;
    }        
}
    public void moveRight(){
        angle -= incremento;
        if (angle >Shuttle.max_angle){
            this.angle = Shuttle.max_angle;
        }
    }
    

}
