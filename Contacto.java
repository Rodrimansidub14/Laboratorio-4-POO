public class Contacto {
   // ATRIBUTOS
    private String nombre;
    private String numero;

    // CONSTRUCTOR SIN PARÁMETROS
    public Contacto() {
        nombre = " ";
        numero = " ";
    }

    // CONSTRUCTOR CON PARÁMETROS
    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // MÉTODOS
    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getNumero() {
        return this.numero;
    }

    
    /** 
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    /** 
     * @param nombre
     * @return Contacto
     */
    public Contacto nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    
    /** 
     * @param numero
     * @return Contacto
     */
    public Contacto numero(String numero) {
        setNumero(numero);
        return this;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }
}