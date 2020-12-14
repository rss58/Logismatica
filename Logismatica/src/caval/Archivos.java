/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caval;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rss58
 */
public class Archivos
{
    public static void guarda(Object []arr)
    {
        try
        {
            FileOutputStream fos=new FileOutputStream ("Productos.dat");
            
            try
            {
                ObjectOutputStream arch=new ObjectOutputStream(fos);
                arch.writeObject(fos);
            } catch (IOException ex)
            {
                System.out.println("No se puede abrir el archivo...");
            }
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se puede abrir el archivo...");
        }
    }
    
    public static Object[] carga()    
    {
        Object arr[]=null;
        try
        {
            FileInputStream fis=new FileInputStream ("Productos.dat");
            
            try
            {
                ObjectInputStream arch=new ObjectInputStream(fis);
                try
                {
                    arr=(Object[]) arch.readObject();
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede abrir el archivo...");
            }
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se pude abrir el archivo...");
        }
        return arr;
    }
}
