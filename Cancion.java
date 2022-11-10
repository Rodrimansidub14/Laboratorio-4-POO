public class Cancion {
    // ATRIBUTOS
    private String nombre;
    private String autor;
    private String duracion;
    private String genero;

    // CONSTRUCTOR SIN PARÁMETROS
    public Cancion() {
        nombre = "";
        autor = "";
        duracion = "";
        genero = "";
    }

    // CONSTRUCTOR CON PARAMETROS
    public Cancion(String nombre, String autor, String duracion, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.genero = genero;
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
    public String getAutor() {
        return this.autor;
    }

    
    /** 
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    /** 
     * @return String
     */
    public String getDuracion() {
        return this.duracion;
    }

    
    /** 
     * @param duracion
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    
    /** 
     * @return String
     */
    public String getGenero() {
        return this.genero;
    }

    
    /** 
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    /** 
     * @param nombre
     * @return Cancion
     */
    public Cancion nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    
    /** 
     * @param autor
     * @return Cancion
     */
    public Cancion autor(String autor) {
        setAutor(autor);
        return this;
    }

    
    /** 
     * @param duracion
     * @return Cancion
     */
    public Cancion duracion(String duracion) {
        setDuracion(duracion);
        return this;
    }

    
    /** 
     * @param genero
     * @return Cancion
     */
    public Cancion genero(String genero) {
        setGenero(genero);
        return this;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", autor='" + getAutor() + "'" +
            ", duracion='" + getDuracion() + "'" +
            ", genero='" + getGenero() + "'" +
            "}";
    }
}
