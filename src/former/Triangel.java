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
public class Triangel extends Form {
    private int bas;
    private int höjd;
    private boolean fylld;
    private int startX;
    private int startY;
    //private int area;
    
    @Override
    public double getArea(){
        return (bas*höjd)/2;
    }
    public void draw(){
        
    }
    public Triangel(int x, int y, int b, int h, boolean f){
        super(x, y);
        this.bas = b;
        this.höjd = h;
        fylld = f;
        color  = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
    }
    public void draw(Graphics g){
        g.setColor(color);
        int [] xPoint = {xPos, xPos + bas/2, xPos + bas};
        int [] yPoint = {yPos, yPos-höjd, yPos};
        g.fillPolygon(xPoint, yPoint, 3);
    }
    public String whatAmI(){
        return "Triangel";
    }
    
}
