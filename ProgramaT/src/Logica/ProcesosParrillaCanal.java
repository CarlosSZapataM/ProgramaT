/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.ParrillaCanal;
import Util.PersistenciaTXTParrilla;
import java.util.ArrayList;

/**
 *
 * @author Carlos Z
 */
public class ProcesosParrillaCanal {
    private ArrayList<ParrillaCanal> parrillas;
 
    public ArrayList<ParrillaCanal> getParrillaCanales() {
        return parrillas;
    }

    public void setParrillaCanales(ArrayList<ParrillaCanal> parrillas) {
        this.parrillas = parrillas;
    }
    
    public boolean adicionarParrilla(ParrillaCanal parrillaCanal){
        if(parrillaCanal == null){
            return false;
        }
        this.parrillas.add(parrillaCanal);
        PersistenciaTXTParrilla gestor = new PersistenciaTXTParrilla();
        boolean rta = gestor.guardarArchivo(parrillas);
        return rta;
    }
    
    public boolean editarCanal(ParrillaCanal parrillaCanal){
        if(parrillaCanal == null){
            return false;
        }
        for(ParrillaCanal laparrilla : parrillas){
//            if(elcanal.getIdentificador() == canal.getIdentificador()){
                laparrilla.setFechaTransmision(parrillaCanal.getFechaTransmision());
//                laparrilla.getNombrePrograma(parrillaCanal.getNombrePrograma());
//                laparrilla.getHoraInicio(parrillaCanal.getHoraInicio());
//                laparrilla.getHoraFinal(parrillaCanal.getHoraFinal());
//            }
        }
        return false;
    }
    
    public boolean borrarContacto(ParrillaCanal parrillaCanal){
        if(parrillaCanal == null){
            return false;
        }
        return this.parrillas.remove(parrillaCanal);
    }
    
    public boolean actualizaPersistencia(){
        PersistenciaTXTParrilla gestor = new PersistenciaTXTParrilla();
        return gestor.guardarArchivo(parrillas);
    }
}
