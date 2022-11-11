import java.util.ArrayList;
public class Telefono {
    // ATRIBUTOS
    private ArrayList<Contacto> contactos;

    // CONSTRUCTOR SIN PAREÁMETROS
    public Telefono() {
        contactos = new ArrayList<>();
    }

    // CONSTRUCTOR CON PARÁMETROS
    public Telefono(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    // MÉTODOS
    
    /** 
     * @return ArrayList<Contacto>
     */
    public ArrayList<Contacto> getContactos() {
        return this.contactos;
    }

    
    /** 
     * @param contactos
     */
    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    
    /** 
     * @param contactos
     * @return Telefono
     */
    public Telefono contactos(ArrayList<Contacto> contactos) {
        setContactos(contactos);
        return this;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " contactos='" + getContactos() + "'" +
            "}";
    }
}