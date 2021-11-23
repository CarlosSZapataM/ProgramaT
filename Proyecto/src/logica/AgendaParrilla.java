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
    
    private ArrayList<Parrilla> productos;
    
    public AgendaParrilla(){
        this.buscarProductos();
        if (this.productos == null) {
            this.productos = new ArrayList<>();
        }
    }

    public ArrayList<Parrilla> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Parrilla> productos) {
        this.productos = productos;
    }
    
    public boolean adicionarProducto(Parrilla producto) {
          if (producto == null) {
            return false;
        }
        producto.setId( this.consecutivo());
        if (this.productos.add(producto)) {
            return this.actualizarPersistencia();
        }
        return false;
    }

    public boolean borrarProducto(Parrilla producto) {
        if (producto == null) {
            return false;
        }
        if (this.productos.remove(producto)) {
            return this.actualizarPersistencia();
        }
        return false;
    }

    public boolean editarProducto(Parrilla producto) {
        if (producto == null) {
            return false;
        }
        for (Parrilla elContacto : productos) {
            if (elContacto.getId()== producto.getId()) {
                elContacto.setNombrePrograma(producto.getNombrePrograma());
                elContacto.setFechaTransmision(producto.getFechaTransmision());
                elContacto.setFechaTransmision(producto.getHoraInicio());
                elContacto.setFechaTransmision(producto.getHoraFinal());
                return this.actualizarPersistencia();
            }
        }
        return false;
    }

    public void buscarProductos() {
        GestorPersistenciaParrilla gestor = new GestorPersistenciaParrilla();
        this.productos = gestor.abrirArchivo();
    }


    public Parrilla buscarProductos(Long identif) {
        if (identif == null) {
            return null;
        }
        for (Parrilla elProducto : productos) {
            if (elProducto.getId()== identif) {
                return elProducto;
            }
        }
        return null;
    }

    private boolean actualizarPersistencia() {
        GestorPersistenciaParrilla gestor = new GestorPersistenciaParrilla();
        return gestor.guardarArchivo(productos);
    }
    
    private Long consecutivo(){
       if(this.productos.isEmpty()){
           return 1L;
       }
        return this.productos.get(this.productos.size()-1).getId() +1;
    }
}
