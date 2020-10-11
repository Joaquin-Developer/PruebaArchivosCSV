package logica;

/**
 *
 * @author joaquin
 */
public class Person {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Person() {}
    
    public Person(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+ this.nombre + ", Apellido: " + this.apellido + ", Edad: " + this.edad;
    }
    
}
