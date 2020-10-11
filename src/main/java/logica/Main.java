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
        
        try {
            String ruta = JOptionPane.showInputDialog(null, "Ingresar ruta:", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        
            ArrayList<Person> personsList = reader.toPersonArrayObject(ruta);
            
            String lista = "";
            for (Person person : personsList) {
                lista += (person.toString() + "\n");
            }
            
            JOptionPane.showMessageDialog(null, lista, "Contenido del archivo:", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (NullPointerException npEx) {
            npEx.printStackTrace();
            JOptionPane.showMessageDialog(null, npEx.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Se produjo un error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
