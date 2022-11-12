public class Radio {
    // ATRIBUTOS
    private String banda;
    private float frecuencia;
    private float[] emisoras;

    // CONSTRUCTOR SIN PARÁMETROS
    public Radio() {
        banda = "";
        frecuencia = 0;
        emisoras = new float[50];
    }

    // CONSTRUCTOR CON PARÁMETROS
    public Radio(String banda, float frecuencia, float[] emisoras) {
        this.banda = banda;
        this.frecuencia = frecuencia;
        this.emisoras = emisoras;
    }

    // MÉTODOS
    
    /** 
     * @return String
     */
    public String getBanda() {
        return this.banda;
    }

    
    /** 
     * @param banda
     */
    public void setBanda(String banda) {
        this.banda = banda;
    }

    
    /** 
     * @return float
     */
    public float getFrecuencia() {
        return this.frecuencia;
    }

    
    /** 
     * @param frecuencia
     */
    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    
    /** 
     * @return float[]
     */
    public float[] getEmisoras() {
        return this.emisoras;
    }

    
    /** 
     * @param emisoras[]
     */
    public void setEmisoras(float emisoras[]) {
        this.emisoras = emisoras;
    }

    
    /** 
     * @param banda
     * @return Radio
     */
    public Radio banda(String banda) {
        setBanda(banda);
        return this;
    }

    
    /** 
     * @param frecuencia
     * @return Radio
     */
    public Radio frecuencia(float frecuencia) {
        setFrecuencia(frecuencia);
        return this;
    }

    
    /** 
     * @param emisoras
     * @return Radio
     */
    public Radio emisoras(float[] emisoras) {
        setEmisoras(emisoras);
        return this;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " banda='" + getBanda() + "'" +
            ", frecuencia='" + getFrecuencia() + "'" +
            ", emisoras[]='" + getEmisoras() + "'" +
            "}";
    }
}