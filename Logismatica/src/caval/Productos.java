/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caval;

import java.io.Serializable;

/**
 *
 * @author RssX64
 */

public class Productos implements Serializable
{
    public static final long serialVersionUID=1L;
    private static int cons=0;
    private int folio;
    private String nom;
    private int existencias;

    public Productos()
    {
        this.folio = ++cons;
        this.nom = "Sin nombre";
        this.existencias = 0;
    }

    public Productos( String nom, int existeencias)
    {
        this.folio = ++cons;
        this.nom = nom;
        this.existencias = existeencias;
    }

    /**
     * @return the folio
     */
    public int getFolio()
    {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio)
    {
        this.folio = folio;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @return the existencias
     */
    public int getExistencias()
    {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias)
    {
        this.existencias = existencias;
    }
    
    public String desp()
    {
        return
                "FOLIO = " + folio + "\n"+
                "NOMBRE = " + nom + "\n"+
                "EXISTENCIA = " + existencias + "\n";
    }
}