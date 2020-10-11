package logica;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author joaquin
 */
public class Reader {
    
    public Reader() { }
    
    public ArrayList<String> readFile(String ruta) throws FileNotFoundException, IOException {
        
        ArrayList<String> texto = new ArrayList<String>(); 
        FileReader file = new FileReader(ruta);
        BufferedReader buffered = new BufferedReader(file);
        String linea;
        
        while((linea = buffered.readLine()) != null) 
            texto.add(linea);
        
        return texto;
        
    }
    
    
}
