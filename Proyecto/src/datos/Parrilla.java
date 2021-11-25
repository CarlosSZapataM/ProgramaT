package datos;

import java.io.Serializable;

/**
 *
 * @author Carlos Z
 */
public class Parrilla implements Serializable{
    
    private Long id;
    private Long idCanal;
    private String fechaTransmision;
    private String nombrePrograma;
    private String horaInicio;
    private String horaFinal;

    public Long getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(Long idCanal) {
        this.idCanal = idCanal;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setFechaTransmision(String fechaTransmision) {
        this.fechaTransmision = fechaTransmision;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getFechaTransmision() {
        return fechaTransmision;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }
  
}
