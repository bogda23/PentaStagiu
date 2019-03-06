/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileworker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Bogdan
 */
public class FileRead extends FileNotFoundException{
    
   private String path ;
   private File f ;
    
    
    // Constructors 
    FileRead(File f , String path){
        this.path=path;
        this.f=f=new File(path);
        
    }
    FileRead(File f){
        this.f=f;
    }
    
    // Methods 
    
    public String ReadF(File f ){
        
            String text ="";

        try{
            Scanner sc = new Scanner(f);        
            while(sc.hasNextLine())
            {
                text+=sc.nextLine()+'\n';
            }
        }catch(IOException ex){
            System.err.print("The file is not created !\n"+ex);
        }

        return text;
    }
    
}
