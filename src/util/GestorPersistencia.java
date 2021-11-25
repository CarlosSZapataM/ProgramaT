package util;

import datos.Canal;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Carlos Z
 */
public class GestorPersistencia {

    private final String NOMBREAP = "canales.txt";

    public boolean guardarArchivo(ArrayList<Canal> contactos) {
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream(NOMBREAP);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(contactos);
            oo.close();
            return true;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fo.close();
            } catch (IOException ex) {

            }
        }
        return false;
    }

    public ArrayList<Canal> abrirArchivo() {
        ArrayList<Canal> contactosArchivo = null;
        FileInputStream fo = null;
        try {
//            FileOutputStream file = new FileOutputStream("canales.txt");
//            ArrayList<Canal> array = new ArrayList<Canal>();
//            Canal canal = new Canal(1L, "Prueba1", "Prueba2");
//            array.add(canal);
//            ObjectOutputStream output = new ObjectOutputStream(file);
//            output.writeObject(array);
//            output.close();
            
            fo = new FileInputStream(NOMBREAP);
            ObjectInputStream oo = new ObjectInputStream(fo);
            contactosArchivo = (ArrayList<Canal>) oo.readObject();
            oo.close();
            fo.close();
            return contactosArchivo;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {

        }
        return null;
    }
}
