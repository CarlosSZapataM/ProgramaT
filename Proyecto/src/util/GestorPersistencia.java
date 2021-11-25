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
 * @author CArlos Z
 */
public class GestorPersistencia {
    private final String NOMBREAP = "canales.txt";
     
    public boolean guardarArchivo(ArrayList<Canal> contactos){
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
    
    public ArrayList<Canal> abrirArchivo(){
        ArrayList contactosArchivo = new ArrayList<>(); //Auui lista vacia 
        FileInputStream fo = null;
        try{
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
