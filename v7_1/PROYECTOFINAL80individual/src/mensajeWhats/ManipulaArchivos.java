/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeWhats;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author David Vergara
 */
public class ManipulaArchivos
{

    public static void guarda(Object obj, String ruta)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(ruta);//intruccion 1

            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos); // intruccion 2

                try
                {
                    //Escribir arreglo
                    arch.writeObject(obj);//intruccion 3
                    System.out.println("Archivo guardado con éxito :D");
                    arch.close(); // intruccion 4
                } catch (IOException ex)
                {
                    System.out.println("Error... No se pudo abrir el archivo. :c");

                }

            } catch (IOException ex)
            {
                System.out.println("Error... No se pudo abrir el archivo. :c");
                System.out.println("Verifica que esten los implements Serializable\n"
                        + "{\n"
                        + "    private static final long SerialVersionUID = 1L;");

            }

        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo... :c");
            System.out.println("Generando uno nuevo...");
        } catch (Exception ex)
        {
            System.out.println("Error... :o" + ex.toString());
        }
    }

    public static Object carga(String ruta)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream(ruta);//intruccion 1

            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis); // intruccion 2

                try
                {
                    //Leer arreglo
                    obj = (Object) arch.readObject();//intruccion 3
                    System.out.println("Archivo cargador con éxito :D");
                    arch.close(); // intruccion 4
                } catch (IOException | ClassNotFoundException ex)
                {
                    System.out.println("Error... No se pudo abrir el archivo. :c");
                }

            } catch (IOException ex)
            {
                System.out.println("Error... No se pudo abrir el archivo. :c");

            }

        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo... :c");
            System.out.println("Generando uno nuevo...");
        } catch (Exception ex)
        {
            System.out.println("Error... :o" + ex.toString());
        }
        return obj;
    }
}
