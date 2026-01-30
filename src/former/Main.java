/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package former;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sarmo01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Cirkel c = new Cirkel (12,34, 7,1);
        System.out.println(c.getArea());
        
        System.out.println(c.getXpos()+ " " + c.getYpos());
        
        Triangel t = new Triangel (1,1, 4,4, 1);
        System.out.println(t.getArea());
        
        Rektangel r = new Rektangel (1,1,4,4,1);
        System.out.println(r.getArea());
        */
       // ArrayList<Form> f = new ArrayList<>();
       Scanner input = new Scanner (System.in);
       int val;
       ArrayList <Form> formList = new ArrayList <>();
       
       do{
       System.out.println("Meny");
       System.out.println("1. Skriv ut listan");
       System.out.println("2. Rektangel");
       System.out.println("3. Triangel");
       System.out.println("4. Cirkel");
       System.out.println("0. Avsluta");
       val = input.nextInt();
       
       switch(val){
               case 1:
                   skrivUt(formList);
                   break;
               case 2:
                   System.out.print("\nAnge x-koordinat: ");
                   int x = input.nextInt();
                   System.out.print("Ange y-koordinat: ");
                   int y = input.nextInt();
                   System.out.print("Ange basen: ");
                   int bas = input.nextInt();
                   System.out.print("Ange höjden: ");
                   int höjd = input.nextInt();
                   System.out.println();
                   Form r = new Rektangel(x, y, bas, höjd, true);
                   formList.add(r); 
                   
                   break;
               case 3:
                   System.out.print("\nAnge x-koordinat: ");
                   int xT = input.nextInt();
                   System.out.print("Ange y-koordinat: ");
                   int yT = input.nextInt();
                   System.out.print("Ange basen: ");
                   int basT = input.nextInt();
                   System.out.print("Ange höjden: ");
                   int höjdT = input.nextInt();
                   System.out.println();
                   Form t = new Triangel(xT, yT, basT, höjdT, true);
                   formList.add(t);
                   
                   break;
               case 4:
                   System.out.print("\nAnge x-koordinat: ");
                   int xC = input.nextInt();
                   System.out.print("Ange y-koordinat: ");
                   int yC = input.nextInt();
                   System.out.print("Ange radie: ");
                   int radie = input.nextInt();
                   System.out.println();
                   Form c = new Cirkel(xC, yC, radie, true);
                   formList.add(c);
                   
                   break;
               case 0:
                   break;
       }
       
    }while(val!=0);
       }
    public static void skrivUt(ArrayList <Form> formList){
        if(formList.isEmpty()){
            System.out.println("Listan är tom.");
            System.out.println("");
        }else
         for(int i = 0; i < formList.size(); i++){
            System.out.println(formList.get(i).whatAmI() + " area: " + formList.get(i).getArea());
            
        }
    }
    
}
