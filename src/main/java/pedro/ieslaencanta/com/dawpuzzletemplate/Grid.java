/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.ieslaencanta.com.dawpuzzletemplate;

/**
 *
 * @author DAWTarde
 */
public class Grid {

    private boolean colision = false;
    private int startx = 0;
    private int starty = 0;
    private static int WIDTH = 8, HEIGHT = 12;
    private Bubble grid[][];

    public Grid() {
        this.grid = new Bubble[HEIGHT][WIDTH];

    }

    public Grid(int startx, int starty) {
        this.grid = new Bubble[HEIGHT][WIDTH];
        this.startx = startx;
        this.starty = starty;

    }

    public Grid(BubbleType bubbles[][], int startx, int starty) {

    }

    /**
     * @return the startx
     */
    public int getStartx() {
        return startx;
    }

    /**
     * @param startx the startx to set
     */
    public void setStartx(int startx) {
        this.startx = startx;
    }

    /**
     * @return the starty
     */
    public int getStarty() {
        return starty;
    }

    /**
     * @param starty the starty to set
     */
    public void setStarty(int starty) {
        this.starty = starty;
    }

    public boolean collision(Bubble b) {
        if (b.getPosicion().getY() - (Bubble.WIDTH / 2) <= this.starty) {
            b.stop();
            return true;
        } else {
            return false;
        }
    }

}

