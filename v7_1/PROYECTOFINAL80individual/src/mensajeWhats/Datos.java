/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeWhats;

import cola.ColaD;
import java.io.Serializable;
import pila.PilaD;

/**
 *
 * @author David Vergara
 */
public class Datos implements Serializable
{
    private static final long SerialVersionUID = 1L;
    
    private PilaD pila1 = new PilaD();
    private PilaD pila2 = new PilaD();
    private ColaD cola = new ColaD();

    /**
     * @return the pila1
     */
    public PilaD getPila1()
    {
        return pila1;
    }

    /**
     * @param pila1 the pila1 to set
     */
    public void setPila1(PilaD pila1)
    {
        this.pila1 = pila1;
    }

    /**
     * @return the pila2
     */
    public PilaD getPila2()
    {
        return pila2;
    }

    /**
     * @param pila2 the pila2 to set
     */
    public void setPila2(PilaD pila2)
    {
        this.pila2 = pila2;
    }

    /**
     * @return the cola
     */
    public ColaD getCola()
    {
        return cola;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(ColaD cola)
    {
        this.cola = cola;
    }


   
}
