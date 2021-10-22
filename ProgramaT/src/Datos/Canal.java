/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Carlos Z
 */
public class Canal {
    private String nombreCanal;
    private int numeroCanal;

    public String getNombreCanal() {
        return nombreCanal;
    }

    public int getNumeroCanal() {
        return numeroCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public void setNumeroCanal(int numeroCanal) {
        this.numeroCanal = numeroCanal;
    }

    public Canal(String nombreCanal, int numeroCanal) {
        this.nombreCanal = nombreCanal;
        this.numeroCanal = numeroCanal;
    }
       
}
