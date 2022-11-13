import java.util.ArrayList;
public class Radio implements Acciones{
    private String marca;
    private String modelo;
    private boolean estado;
    private String modo;
    private String frecuencia;
    private double emisora;
    private boolean conectado;
    private int volumen;
    ArrayList<Contacto> contactos=new ArrayList<Contacto>();
    ArrayList<Double> emisoras=new ArrayList<Double>();
    ArrayList<Cancion> listas=new ArrayList<Cancion>();
    public Radio(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        this.estado=false;
        this.modo="radio";
        this.frecuencia="fm";
        this.emisora=106.5;
        this.conectado=false;
        this.volumen=50;
        
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public ArrayList<Contacto> getContactos() {
        return this.contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public boolean isConectado() {
        return this.conectado;
    }

    public boolean getConectado() {
        return this.conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public ArrayList<Double> getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(ArrayList<Double> emisoras) {
        this.emisoras = emisoras;
    }

    public ArrayList<Cancion> getListas() {
        return this.listas;
    }

    public void setListas(ArrayList<Cancion> listas) {
        this.listas = listas;
    }

    public double getEmisora() {
        return this.emisora;
    }

    public void setEmisora(double emisora) {
        this.emisora = emisora;
    }


    public String getModo(){
        return this.modo;
    }
    public void setModo(String modo){
        this.modo=modo;
    }
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFrecuencia() {
        return this.frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String cambiarFmAm(){
        if(this.frecuencia.equalsIgnoreCase("fm")){
            this.frecuencia="am";
        }else if(this.frecuencia.equalsIgnoreCase("am")){
            this.frecuencia="fm";
        }
        return getFrecuencia();
    }
    @Override
    public double cambiarEmisora(String operador){
        if(operador.equalsIgnoreCase("+")){
            this.emisora+=0.5;
        }else if(operador.equalsIgnoreCase("-")){
            this.emisora-=0.5;
        }
        return getEmisora();
    }
    @Override
    public String guardarEmisora(Double emisora){
        emisoras.add(emisora);
        return "Emisora guardada";
    }
    @Override
    public Double cargarEmisora(int posicion){
        if(emisoras.size()==0){
            return 106.5;
        }else{

            return emisoras.get(posicion);
        }
    }
    @Override
    public Cancion seleccionarLista(int posicion){
        return listas.get(posicion);
    }
    @Override
    public Cancion cambiarCancion(int posicion){
        return listas.get(posicion);
    }
    @Override
    public String escucharCancion(Cancion cancion){
        return cancion.toString();
    }
    @Override
    public boolean conectarDesconectar(){
        if(getConectado()==false){
            setConectado(true);
        }else if(getConectado()==true){
            setConectado(false);
        }
        return getConectado();
    }
    @Override
    public String contactos(){
        String cadena="";
        for(int i=0;i<contactos.size();i++){
            cadena+=contactos.get(i);
        }
        return cadena;
    }

    @Override
    public String llamar(int contacto) {
        // TODO Auto-generated method stub
        return contactos.get(contacto).llamar();
    }
    
    @Override
    public String finalizarLlamada() {
        // TODO Auto-generated method stub
        Contacto c1=new Contacto(null, null);
        return c1.finalizar();
    }

    @Override
    public String llamarUltimoContacto(Contacto contacto) {
        // TODO Auto-generated method stub
        return contacto.llamar();
    }

    @Override
    public String verTarjetasPresentacion() {
        // TODO Auto-generated method stub
        return null;
    }
    


    

}
