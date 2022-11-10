import java.io.BufferedReader;
import java.io.FileReader;

public class Archivo {
    // ATRIBUTOS
    private BufferedReader lector; //Encargado de leer el archivo
    private String linea;
    private String partes[];

    // CONSTRUCTOR SIN PARÁMETROS
    public Archivo(){
        lector = null;
        linea = "";
        partes = null;
    }

    // MÉTODOS
    /** 
     * @param nombreArchivo
     * Método que se encarga de leer el archivo csv existente.
     */
    public void leerArchivo(String nombreArchivo){
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while((linea = lector.readLine()) != null){
                partes = linea.split(",");
            }
            lector.close();
            linea = null;
            partes = null;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    
    /** 
     * @return String
     * Imprimir los contenidos del archivo csv
     */
    public String imprimirContenido(){
        for(int i = 0; i < partes.length; i++){
            return partes[i]+" | ";
        }
        return "";
    }
}