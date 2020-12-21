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
 */
public class Nodo implements Serializable
{

    private static final long SerialVersionUID = 1L;
    private Object obj;
    private String etq;
    private Nodo sig = null, ant = null, abj = null, arriba=null;

    public Nodo()
    {

    }

    public Nodo(Object obj)
    {
        this.obj = obj;
    }

    public Nodo(Object obj, String etq)
    {
        this.obj = obj;
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
     * @return the sig
     */
    public Nodo getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo sig)
    {
        this.sig = sig;
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
     * @return the ant
     */
    public Nodo getAnt()
    {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Nodo ant)
    {
        this.ant = ant;
    }

    /**
     * @return the abj
     */
    public Nodo getAbj()
    {
        return abj;
    }

    /**
     * @param abj the abj to set
     */
    public void setAbj(Nodo abj)
    {
        this.abj = abj;
    }

    /**
     * @return the arriba
     */
    public Nodo getArriba()
    {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(Nodo arriba)
    {
        this.arriba = arriba;
    }

}
