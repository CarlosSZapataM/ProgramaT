package logica;

import datos.Parrilla;
import java.io.Serializable;
import java.util.ArrayList;
import util.GestorPersistenciaParrilla;
/**
 *
 * @author Carlos Z
 */
public class AgendaParrilla  implements Serializable{
    
    public ArrayList<Parrilla> parrillas;
    
    public AgendaParrilla(){
        this.parrillas = this.buscarParrilla();
        if (this.parrillas == null) {
            this.parrillas = new ArrayList<>();
        }
    }
    
    public AgendaParrilla(ArrayList<Parrilla> parrillas){
        this.parrillas = parrillas;
        if (this.parrillas == null) {
            this.parrillas = new ArrayList<>();
        }
    }

    public ArrayList<Parrilla> getParrilla() {
        return parrillas;
    }

    public void setParrilla(ArrayList<Parrilla> parrillas) {
        this.parrillas = parrillas;
    }
    
    public boolean adicionarParrilla(Parrilla parrilla) {
          if (parrilla == null) {
            return false;
        }
        parrilla.setId( this.consecutivo());
        if (this.parrillas.add(parrilla)) {
            return this.actualizarPersistencia();
        }
        return false;
    }

    public boolean borrarParrilla(Parrilla parrilla) {
        if (parrilla == null) {
            return false;
        }
        if (this.parrillas.remove(parrilla)) {
            return this.actualizarPersistencia();
        }
        return false;
    }

    public boolean editarParrilla(Parrilla parrilla) {
        if (parrilla == null) {
            return false;
        }
        for (Parrilla elContacto : parrillas) {
            if (elContacto.getId()== parrilla.getId()) {
                elContacto.setNombrePrograma(parrilla.getNombrePrograma());
                elContacto.setFechaTransmision(parrilla.getFechaTransmision());
                elContacto.setHoraInicio(parrilla.getHoraInicio());
                elContacto.setHoraFinal(parrilla.getHoraFinal());
                return this.actualizarPersistencia();
            }
        }
        return false;
    }

    public ArrayList<Parrilla> buscarParrilla() {
        GestorPersistenciaParrilla gestor = new GestorPersistenciaParrilla();
        return gestor.abrirArchivo();
    }


    public Parrilla buscarParrilla(Long identif) {
        if (identif == null) {
            return null;
        }
        for (Parrilla elProducto : parrillas) {
            if (elProducto.getId()== identif) {
                return elProducto;
            }
        }
        return null;
    }

    private boolean actualizarPersistencia() {
        GestorPersistenciaParrilla gestor = new GestorPersistenciaParrilla();
        return gestor.guardarArchivo(parrillas);
    }
    
    private Long consecutivo(){
       if(this.parrillas.isEmpty()){
           return 1L;
       }
        return this.parrillas.get(this.parrillas.size()-1).getId() +1;
    }
}
