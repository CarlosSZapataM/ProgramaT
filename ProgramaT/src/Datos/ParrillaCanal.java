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
public class ParrillaCanal {
    private String fechaTransmision;
    private String nombrePrograma;
    private int horaInicio;
    private int horaFinal;

    public void setFechaTransmision(String fechaTransmision) {
        this.fechaTransmision = fechaTransmision;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getFechaTransmision() {
        return fechaTransmision;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public ParrillaCanal(String fechaTransmision, String nombrePrograma, int horaInicio, int horaFinal) {
        this.fechaTransmision = fechaTransmision;
        this.nombrePrograma = nombrePrograma;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }
            
}
