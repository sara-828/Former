/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author sarmo01
 */
public class Rektangel extends Form {
    private int bas;
    private int höjd;
    private int startX;
    private int startY;
    private boolean fylld;

    
    
    public Rektangel(int x, int y, int b, int h, boolean f){
        super(x, y);
        this.bas = b;
        this.höjd = h;
        fylld = f;
        color  = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    }
    
    public double getArea(){
        return bas*höjd;
    }
    // ritar ut form
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(xPos, yPos, bas, höjd);
    }
    public String whatAmI(){
        return "Rektangel";
    }
    
    
}
