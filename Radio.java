public class Radio {
    private String Banda;
    private float Frecuencia;
    double [] emisoras = new double[] {};


    public Radio() {
    }


    public Radio(String Banda, float Frecuencia, double[] emisoras) {
        this.Banda = Banda;
        this.Frecuencia = Frecuencia;
        this.emisoras = emisoras;
    }

    public String getBanda() {
        return this.Banda;
    }

    public void setBanda(String Banda) {
        this.Banda = Banda;
    }

    public float getFrecuencia() {
        return this.Frecuencia;
    }

    public void setFrecuencia(float Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public double[] getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(double[] emisoras) {
        this.emisoras = emisoras;
    }

    @Override
    public String toString() {
        return "{" +
            " Banda='" + getBanda() + "'" +
            ", Frecuencia='" + getFrecuencia() + "'" +
            ", emisoras='" + getEmisoras() + "'" +
            "}";
    }
  
}
