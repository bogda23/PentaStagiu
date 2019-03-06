/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileworker;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Ivașcu Bogdan
 */
public class FileWorker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        File f = new File("input.txt");
        File fOut =new File("output.txt");
        
        //Read from input.txt line by line 
        FileRead read = new FileRead(f);
        System.out.print(read.ReadF(f));
        
        //Write to output.txt
        FileWrite write = new FileWrite(fOut);
        write.writeTheOutput(fOut, read.ReadF(f));
        
    }
    
}
