/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author RssX64
 */
public class Archivos
{
    public static void guarda(Object [] o , String s)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            try
            {
                try (ObjectOutputStream arch = new ObjectOutputStream(fos)) {
                    arch.writeObject(o);
                }
            } catch (IOException ex)
            {
                System.out.println("Error..."+ex.toString());
            }
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Error... archivo no encontrado");
        }catch (Exception ex)
        {
            System.out.println("Error..."+ex.toString());
        }
    }
    
    public static Object [] carga( String s)
    {
        Object [] o = null;
        try
        {
            FileInputStream fos = new FileInputStream(s);
            try
            {
                try (ObjectInputStream arch = new ObjectInputStream(fos)) {
                    o= (Object[]) arch.readObject();
                }
            } catch (IOException | ClassNotFoundException ex)
            {
                System.out.println("Error..."+ex.toString());
            }
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("Error... archivo no encontrado");
        }catch (Exception ex)
        {
            System.out.println("Error..."+ex.toString());
        }
        return o;
    }
}