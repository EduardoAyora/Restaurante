package ec.edu.ups.clases;

/**
 *
 * @author DELL
 */
public class Mesero extends Persona {

    private String contrasena;

    public Mesero(String contrasena, String cedula, String nombre, String direccion, String telefono) {
        super(cedula, nombre, direccion, telefono);
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
