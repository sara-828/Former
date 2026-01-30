/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package former;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author sarmo01
 */
public class FileManager {
    public void saveToFile(ArrayList<Form> formList){
        // kod från press, glöm inte try catch blocket
         //sterilization
        try{
            FileOutputStream fileOut = new FileOutputStream("savedKontaktLista.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(formList);
            out.flush();
            out.close();
            fileOut.close();
        }catch(IOException ex){
            System.out.println("IOException is caught");
        }
        
    }
    
    public static ArrayList<Form> readFromFile(){
        ArrayList<Form> formList = null;
        // kod från press, glöm inte try catch blocket
        // Deserialization

        try{
            FileInputStream fileIn = new FileInputStream("savedKontaktLista.ser");
            
            ObjectInputStream oin = new ObjectInputStream(fileIn);
            formList = (ArrayList<Form>)oin.readObject();
            oin.close();
            fileIn.close();
        }catch(IOException ex){
            System.out.println("IOException is caught");
        }catch(ClassNotFoundException ex){
            System.out.println("ClassNotFoundException is caught");
        }
        return formList;
    }
    
    
}
