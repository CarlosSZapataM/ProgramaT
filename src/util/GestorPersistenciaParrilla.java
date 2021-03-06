package util;

import datos.Parrilla;
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
public class GestorPersistenciaParrilla {
    private final String NOMBREAP = "parrilla.txt";
     
    public boolean guardarArchivo(ArrayList<Parrilla> contactos){
        FileOutputStream fo = null;
        try{
            fo = new FileOutputStream(NOMBREAP);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(contactos);
            oo.close();
            return true;
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try{
                fo.close();
            }catch(IOException ex){
                
            }
        }
        return false;
    }
    
    public ArrayList<Parrilla> abrirArchivo(){
        ArrayList contactosArchivo = null;
        FileInputStream fo = null;
        try{
//            FileOutputStream file = new FileOutputStream("parrilla.txt");
//            ArrayList<Parrilla> array = new ArrayList<Parrilla>();
//            Parrilla parrilla = new Parrilla(1L, 1L, "25/11/2021", "Brawhalla", "20:00", "21:00");
//            array.add(parrilla);
//            ObjectOutputStream output = new ObjectOutputStream(file);
//            output.writeObject(array);
//            output.close();
            
            fo = new FileInputStream(NOMBREAP);
            ObjectInputStream oo = new ObjectInputStream(fo);
            contactosArchivo = (ArrayList)oo.readObject();
            oo.close();
            fo.close();
            return contactosArchivo;
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }finally{     
        }
        return null;
    }
}
