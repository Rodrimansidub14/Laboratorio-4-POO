public class Carro implements InterfaceB{
    // ATRIBUTOS
    private Archivo archivo;
    private Radio radio;
    private Telefono telefono;
    private Reproduccion reproduccion;

    // CONSTRUCTOR
    public Carro() {
        archivo = new Archivo();
        radio = new Radio();
        telefono = new Telefono();
        reproduccion = new Reproduccion();
    }
    
    // MÉTODOS
    
    /** 
     * @param modo
     * @return String
     */
    @Override
    public String cambiarModo(int modo) {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @return String
     */
    @Override
    public String encenderApagar() {
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
        return null;
    }

    
    /** 
     * @return String
     */
    @Override
    public String cambiarRadio() {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @param opcion
     * @return String
     */
    @Override
    public String cambiarEmisoras(int opcion) {
        // TODO Auto-generated method stub
        return null;
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
    public String desplegarListas() {
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
        return null;
    }

    
    /** 
     * @return String
     */
    @Override
    public String desconectar() {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @return String
     */
    @Override
    public String desplegarContactos() {
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
}