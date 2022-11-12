import java.util.ArrayList;

public class Reproduccion {
    // ATRIBUTOS
    private ArrayList<Cancion> playlist;

    // CONSTRUCTOR SIN PARAMETROS
    public Reproduccion() {
        playlist = new ArrayList<>();
    }

    // CONSTRUCTOR CON PARAMETROS
    public Reproduccion(ArrayList<Cancion> playlist) {
        this.playlist = playlist;
    }

    // MÉTODOS

    /** 
     * @return ArrayList<Cancion>
     */
    public ArrayList<Cancion> getPlaylist() {
        return this.playlist;
    }

    
    /** 
     * @param playlist
     */
    public void setPlaylist(ArrayList<Cancion> playlist) {
        this.playlist = playlist;
    }

    
    /** 
     * @param playlist
     * @return Reproduccion
     */
    public Reproduccion playlist(ArrayList<Cancion> playlist) {
        setPlaylist(playlist);
        return this;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " playlist='" + getPlaylist() + "'" +
            "}";
    }
}