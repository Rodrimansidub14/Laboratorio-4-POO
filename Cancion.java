public class Cancion {
    private String nombre;
    private String artista;
    private String genero;
    private int year;
    private String duracion;


    public Cancion(String nombre, String artista, String genero, int year, String duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.year = year;
        this.duracion=duracion;
    }



    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", artista='" + getArtista() + "'" +
            ", genero='" + getGenero() + "'" +
            ", year='" + getYear() + "'" +
            ", duracion='" + getDuracion() + "'" +
            "}";
    }


}
