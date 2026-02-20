/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author sarmo01
 */
public abstract class Form implements Serializable{
    protected int xPos;
    protected int yPos;
    protected boolean running;
    protected boolean positivRiktning;
    protected Color color;
    
    public Form(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }

    public int getXpos() {
        return this.xPos;
    }

    public int getYpos() {
        return this.yPos;
    }
    public void setRunning(boolean running){
        
    }
    public void move(int x, int y){
    this.xPos = x++;
        
    }
    public void skrivUt(){
        System.out.println();
    }
    public abstract String whatAmI();
    
    public abstract double getArea();
    
    public abstract void draw(Graphics g);

}
