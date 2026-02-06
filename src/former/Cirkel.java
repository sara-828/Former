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
public class Cirkel extends Form {
    private int radie;
    private boolean fylld;
    private int startX;
    private int startY;
    //private int area;
    
    public double getArea(){
        return radie*radie*Math.PI;
    }
    public void draw(){
        
    }
    public int getRadie(){
        return radie;
    }
    public Cirkel(int x, int y, int r, boolean f){
        super(x, y);
        this.radie = r;
        this.fylld = f;
        this.startX = x;
        this.startY = y;
        color  = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        //this.area = a;
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(startX, startY, radie, radie);
        
        
    }
    public String whatAmI(){
        return "Cirkel";
    }
}
