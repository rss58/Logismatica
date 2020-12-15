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
public class Productos implements Serializable {

    public static final long serialVersionUID = 1L;
    private static int cons = 0;
    private int folio;
    private String nom;
    private int existencias;
    private int serie;
    private double precio;

    public Productos() {
        this.folio = ++cons;
        this.nom = "Sin nombre";
        this.existencias = 0;
        this.serie = 0;
        this.precio = 0;
    }

    public Productos(String nom, int existencias, int serie, double precio) {
        this.folio = ++cons;
        this.nom = nom;
        this.existencias = existencias;
        this.serie = serie;
        this.precio = precio;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the existencias
     */
    public int getExistencias() {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    /**
     * @return the serie
     */
    public int getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(int serie) {
        this.serie = serie;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String desp() {
        return folio + "\n"
                + nom + "\n"
                + existencias + "\n"
                + serie + "\n"
                + precio + "\n";
    }
}
