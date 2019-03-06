/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileworker;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;



/**
 *
 * @author Bogdan
 */
public class FileWrite extends FileNotFoundException{
    
   private String path;
   private File f ;
   
   //Constructors 
   FileWrite(File f, String path){
       this.path=path;
       this.f=f=new File(path);
   }
   FileWrite(File f){
       this.f=f;
   }
   
   //Methods 
   public void writeTheOutput( File f,String text) throws IOException{
            
       try{
          FileOutputStream outStream =new FileOutputStream(f);
          OutputStreamWriter outWriter = new OutputStreamWriter(outStream);
          Writer out = new BufferedWriter(outWriter);
          out.write(text);
          out.close();
           
       }catch(IOException ex){
          System.err.print("The output file is not written !"+ex);
       }
       
   
   }

    
}
