public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;

    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo, double precoPorNoite){
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
        this.hospedeAtual = null;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public Hospede getHospedeAtual() {
        return hospedeAtual;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    public void setHospedeAtual(Hospede hospede){
        this.hospedeAtual = hospedeAtual;
    }


}
