/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Canal;
import Util.PersistenciaTXTCanal;
import java.util.ArrayList;

/**
 *
 * @author Carlos Z
 */
public class ProcesosCanal {
    private ArrayList<Canal> canales;
 
    public ArrayList<Canal> getCanales() {
        return canales;
    }

    public void setCanales(ArrayList<Canal> canales) {
        this.canales = canales;
    }
    
    public boolean adicionarCanal(Canal canal){
        if(canal == null){
            return false;
        }
        this.canales.add(canal);
        PersistenciaTXTCanal gestor = new PersistenciaTXTCanal();
        boolean rta = gestor.guardarArchivo(canales);
        return rta;
    }
    
    public boolean editarCanal(Canal canal){
        if(canal == null){
            return false;
        }
        for(Canal elcanal : canales){
//            if(elcanal.getIdentificador() == canal.getIdentificador()){
                elcanal.setNombreCanal(canal.getNombreCanal());
                elcanal.setNumeroCanal(canal.getNumeroCanal());
//            }
        }
        return false;
    }
    
    public boolean borrarContacto(Canal canal){
        if(canal == null){
            return false;
        }
        return this.canales.remove(canal);
    }
    
    public boolean actualizaPersistencia(){
        PersistenciaTXTCanal gestor = new PersistenciaTXTCanal();
        return gestor.guardarArchivo(canales);
    }
    
}
