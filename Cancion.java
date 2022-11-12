public class Cancion {
    private String Nombre;
    private String Autor;
    private String Duracion;
    private String genero;



    public Cancion() {
    }

    public Cancion(String Nombre, String Autor, String Duracion, String genero) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Duracion = Duracion;
        this.genero = genero;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAutor() {
        return this.Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getDuracion() {
        return this.Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Autor='" + getAutor() + "'" +
            ", Duracion='" + getDuracion() + "'" +
            ", genero='" + getGenero() + "'" +
            "}";
    }

   
}
