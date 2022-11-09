import java.util.ArrayList;

public class Reproduccion {
public ArrayList<Cancion> Playlist;


    public Reproduccion() {
    }


    public Reproduccion(ArrayList<Cancion> Playlist) {
        this.Playlist = Playlist;
    }



    public ArrayList<Cancion> getPlaylist() {
        return this.Playlist;
    }

    public void setPlaylist(ArrayList<Cancion> Playlist) {
        this.Playlist = Playlist;
    }

    @Override
    public String toString() {
        return "{" +
            " Playlist='" + getPlaylist() + "'" +
            "}";
    }

}
