package datos;

import java.io.Serializable;
/**
 *
 * @author Carlos Z
 */
public class Canal implements Serializable{

    private Long id;
    private String nombreCanal;
    private String numeroCanal;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public String getNumeroCanal() {
        return numeroCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public void setNumeroCanal(String numeroCanal) {
        this.numeroCanal = numeroCanal;
    }
     
}