package logica;

import datos.Canal;
import java.io.Serializable;
import java.util.ArrayList;
import util.GestorPersistencia;
/**
 *
 * @author Carlos Z
 */
public class Agenda  implements Serializable{
    
    private ArrayList<Canal> productos;
    
    public Agenda(){
        this.buscarProductos();
        if (this.productos == null) {
            this.productos = new ArrayList<>();
        }
    }

    public ArrayList<Canal> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Canal> productos) {
        this.productos = productos;
    }
    
    public boolean adicionarProducto(Canal producto) {
          if (producto == null) {
            return false;
        }
        producto.setId( this.consecutivo());
        if (this.productos.add(producto)) {
            return this.actualizarPersistencia();
        }
        return false;
    }

    public boolean borrarProducto(Canal producto) {
        if (producto == null) {
            return false;
        }
        if (this.productos.remove(producto)) {
            return this.actualizarPersistencia();
        }
        return false;
    }

    public boolean editarProducto(Canal producto) {
        if (producto == null) {
            return false;
        }
        for (Canal elContacto : productos) {
            if (elContacto.getId()== producto.getId()) {
                elContacto.setNombreCanal(producto.getNombreCanal());
                elContacto.setNumeroCanal(producto.getNumeroCanal());
                return this.actualizarPersistencia();
            }
        }
        return false;
    }

    public void buscarProductos() {
        GestorPersistencia gestor = new GestorPersistencia();
        this.productos = gestor.abrirArchivo();
    }


    public Canal buscarProductos(Long identif) {
        if (identif == null) {
            return null;
        }
        for (Canal elProducto : productos) {
            if (elProducto.getId()== identif) {
                return elProducto;
            }
        }
        return null;
    }

    private boolean actualizarPersistencia() {
        GestorPersistencia gestor = new GestorPersistencia();
        return gestor.guardarArchivo(productos);
    }
    
    private Long consecutivo(){
       if(this.productos.isEmpty()){
           return 1L;
       }
        return this.productos.get(this.productos.size()-1).getId() +1;
    }
}
