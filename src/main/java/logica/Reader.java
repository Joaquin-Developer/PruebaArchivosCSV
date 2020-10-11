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
    
    public ArrayList<Person> toPersonArrayObject(String ruta) throws FileNotFoundException, 
            IOException, NullPointerException {
        
        ArrayList<Person> persons = new ArrayList<Person>();
        FileReader file = new FileReader(ruta);
        BufferedReader buffered = new BufferedReader(file);
        String linea;
        
        // recorrer contenido, cortar texto y llenar arrayList con objetos person:
        while((linea = buffered.readLine()) != null) {
            Person person = new Person();
            String campos[] = linea.split(":");
            if (campos.length < 3) {
                throw new NullPointerException("La línea '" + linea + "' no se cargará. Hay datos incompletos.");
            } else {
                person.setNombre(campos[0]);
                person.setApellido(campos[1]);
                person.setEdad(Integer.valueOf(campos[2]));
                persons.add(person);
            }
        }
        
        return persons;
        
    }
    
    
}
