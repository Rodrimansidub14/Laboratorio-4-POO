import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Carro implements InterfaceB{
    // ATRIBUTOS
    private File archivo;
    private Radio radio;
    private Telefono telefono;
    private Reproduccion reproduccion;

    // CONSTRUCTOR
    Random random = new Random();
    public Carro() {
        radio = new Radio();
        telefono = new Telefono();
        reproduccion = new Reproduccion();
    }
    
    // MÉTODOS
    
    /** 
     * @param modo
     * @return String
     NO SE LE DARA USO
     */
    @Override
    public String cambiarModo(int modo) {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * @return String
     NO SE LE DARA USO
     */
    @Override
    public String encenderApagar(){
        // TODO Auto-generated method stub
        return null;
    }

    /** 
     * @param opcion
     * @return String
     */
    @Override
    public String cambiarVolumen(int opcion) {
        // TODO Auto-generated method stub
        int volumen = random.nextInt(10)+1;
        switch(opcion){
            case 1:{
                volumen = volumen +1;
            }
            case 2:{
                volumen = volumen -1;
            }
        }
        return "Se ha cambiado el volumen exitosamente.";
    }

    
    /** 
     * @return String
     */
    @Override
    public String cambiarRadio(int opcion) {
        // TODO Auto-generated method stub
        String radio = " ";
        switch(opcion){
            case 1:{
                radio = "AM";
            }
            case 2:{
                radio = "FM";
            }
        }
        return "La señal se ha cambiado a "+radio;
    }

    
    /** 
     * @param opcion
     * @return String
     */
    @Override
    public String cambiarEmisoras(int opcion) {
        // TODO Auto-generated method stub
        float emisora = random.nextFloat()+88.0f;
        switch(opcion){
            case 1:{
                emisora = emisora + 0.5f;
            }
            case 2:{
                emisora = emisora + 0.5f;
            }
        }
        return "Se ha cambiado la emisora con éxito. ";
    }

    @Override
    public void guardarEmisora() {
        // TODO Auto-generated method stub
        
    }

    
    /** 
     * @param tipo
     * @return String
     */
    @Override
    public String cargarEmisora(int tipo) {
        // TODO Auto-generated method stub
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    
    /** 
     * @return String
     */
    @Override
    public String desplegarEmisoras() {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @return String
     */
    @Override
    public String desplegarListas(String nombreArchivo) {
        // TODO Auto-generated method stub

        return null;
    }

    
    /** 
     * @param tipo
     * @return String
     */
    @Override
    public String seleccionarListas(int tipo) {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @param cancion
     * @return String
     */
    @Override
    public String cambiarCancion(int cancion) {
        // TODO Auto-generated method stub
        
        
        return null;
    }

    
    /** 
     * @param telefono
     * @return String
     */
    @Override
    public String conectar(int telefono) {
        // TODO Auto-generated method stub
        ArrayList<String> contacto = new ArrayList<>();
        ArrayList<String> playlist = new ArrayList<>();
        ArrayList<String> tarjeta = new ArrayList<>();
        Scanner archivoo;
        ArrayList<String> lineas = new ArrayList<>();
        try {
            archivoo = new Scanner(archivo);        
            while (archivoo.hasNextLine()){
                lineas.add(archivoo.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int i = 0; i < lineas.size(); i++){
            contacto.add(lineas.get(i));
        }
        return "Teéfono conectado exitosamente. ";
    }

    
    /** 
     * @return String
     */
    @Override
    public String desconectar() {
        // TODO Auto-generated method stub
        telefono.setContactos(null);
        return null;
    }

    
    /** 
     * @return String
     */
    @Override
    public String desplegarContactos(String nombreArchivo) {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @param opcion
     * @param contacto
     * @return String
     */
    @Override
    public String llamarColgar(int opcion, int contacto) {
        // TODO Auto-generated method stub
        
        return null;
    }

    
    /** 
     * @return String
     */
    @Override
    public String desplegarTarjetas() {
        // TODO Auto-generated method stub
        
        return null;
    }

    /**
     * @return boolean
     * NO SE LE DARA USO 
     */
    @Override
    public boolean verificar(int numero) {
        // TODO Auto-generated method stub
        return false;
    }
}