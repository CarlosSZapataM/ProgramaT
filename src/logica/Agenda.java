package logica;

import datos.Canal;
import datos.Parrilla;
import java.io.Serializable;
import java.util.ArrayList;
import util.GestorPersistencia;
/**
 *
 * @author Carlos Z
 */
public class Agenda  implements Serializable{
    
    private ArrayList<Canal> canales;
    
    public Agenda(){
        this.buscarCanal();
        this.listaCanalParrilla();
        if (this.canales == null) {
            this.canales = new ArrayList<>();
        }
    }

    public ArrayList<Canal> getCanal() {
        return canales;
    }

    public void setCanal(ArrayList<Canal> canales) {
        this.canales = canales;
    }
    
    public boolean adicionarCanal(Canal canal) {
          if (canal == null) {
            return false;
        }
        canal.setId( this.consecutivo());
        if (this.canales.add(canal)) {
            return this.actualizarPersistencia();
        }
        return false;
    }

    public boolean borrarCanal(Canal canal) {
        if (canal == null) {
            return false;
        }
        if (this.canales.remove(canal)) {
            return this.actualizarPersistencia();
        }
        return false;
    }

    public boolean editarProducto(Canal canal) {
        if (canal == null) {
            return false;
        }
        for (Canal elContacto : canales) {
            if (elContacto.getId()== canal.getId()) {
                elContacto.setNombreCanal(canal.getNombreCanal());
                elContacto.setNumeroCanal(canal.getNumeroCanal());
                return this.actualizarPersistencia();
            }
        }
        return false;
    }

    public void buscarCanal() {
        GestorPersistencia gestor = new GestorPersistencia();
        this.canales = gestor.abrirArchivo();
    }


    public Canal buscarCanal(Long identif) {
        if (identif == null) {
            return null;
        }
        for (Canal elProducto : canales) {
            if (elProducto.getId()== identif) {
                return elProducto;
            }
        }
        return null;
    }
    
    private boolean actualizarPersistencia() {
        GestorPersistencia gestor = new GestorPersistencia();
        return gestor.guardarArchivo(canales);
    }
    
    private Long consecutivo(){
       if(this.canales.isEmpty()){
           return 1L;
       }
        return this.canales.get(this.canales.size()-1).getId() +1;
    }
    
    private void listaCanalParrilla(){
        
        for (Canal elCanal : canales) {
            ArrayList<Parrilla> parrillas = new ArrayList<Parrilla>();
            AgendaParrilla ag = new AgendaParrilla();
            for(Parrilla laParrilla : ag.buscarParrilla()){
                if (elCanal.getId().equals(laParrilla.getIdCanal())) {
                    parrillas.add(laParrilla);
                }
            }
            elCanal .parrillas = parrillas;
        }
    }
}



