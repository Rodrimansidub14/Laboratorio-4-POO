public interface InterfaceB {
    public String cambiarModo(int modo);
    public String encenderApagar();
    public String cambiarVolumen(int opcion);
    public String cambiarRadio();
    public String cambiarEmisoras(int opcion);
    public void guardarEmisora();
    public String cargarEmisora(int tipo);
    public String desplegarEmisoras();
    public String desplegarListas();
    public String seleccionarListas(int tipo);
    public String cambiarCancion(int cancion);
    public String conectar(int telefono);
    public String desconectar();
    public String desplegarContactos();
    public String llamarColgar(int opcion, int contacto);
    public String desplegarTarjetas();
    public String toString();
}