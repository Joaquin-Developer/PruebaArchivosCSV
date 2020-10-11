package logica;

import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author joaquin
 */
public class Main {
    
    public static void main(String[] args) {
        
        Reader reader = new Reader();
        ArrayList<Person> persons = new ArrayList<Person>();
        try {
            String ruta = JOptionPane.showInputDialog(null, "Ingresar ruta:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        
            ArrayList<String> textoArchivo = reader.readFile(ruta);
            
            // recorrer contenido, cortar texto y llenar arrayList con objetos person:
            
            for (String linea : textoArchivo) {
                Person person = new Person();
                String campos[] = linea.split(":");
                person.setNombre(campos[0]);
                person.setApellido(campos[1]);
                person.setEdad(Integer.valueOf(campos[2]));
                persons.add(person);
            }
            
            String listaPersonas = "";
            for (Person person : persons) {
                listaPersonas += (person.toString() + "\n");
            }
            
            JOptionPane.showMessageDialog(null, listaPersonas, "Contenido del archivo:", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        
    }
    
}
