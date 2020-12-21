/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.io.Serializable;

/**
 *
 * @author David Vergara
 *
 */
public class NodoArbol implements Serializable
{
    private static long SerialVersionUID = 1L;

    private String etq;
    private Object obj;
    private NodoArbol izq = null;
    private NodoArbol der = null;
    private Nodo hilo = null;
    
    
    public NodoArbol(String etq, Object obj,Nodo hilo)
    {
        this.etq=etq;   
        this.obj=obj;
        this.hilo=hilo;
    }

    /**
     * @return the etq
     */
    public String getEtq()
    {
        return etq;
    }

    /**
     * @param etq the etq to set
     */
    public void setEtq(String etq)
    {
        this.etq = etq;
    }

    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the izq
     */
    public NodoArbol getIzq()
    {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(NodoArbol izq)
    {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public NodoArbol getDer()
    {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(NodoArbol der)
    {
        this.der = der;
    }

    /**
     * @return the hilo
     */
    public Nodo getHilo()
    {
        return hilo;
    }

    /**
     * @param hilo the hilo to set
     */
    public void setHilo(Nodo hilo)
    {
        this.hilo = hilo;
    }
    
    
    
}
