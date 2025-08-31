public class Termostato {
    private double temperaturaAtual;
    private double temperaturaDesejada;

    Termostato(double temperaturaAtual, double temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public double getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        if (temperaturaAtual >= 15 && temperaturaAtual <= 30) {
            this.temperaturaAtual = temperaturaAtual;
        } else {
            System.out.println("Temperatura inválida!");
        }
    }

    public void setTemperaturaDesejada(double temperaturaDesejada) {
        if (temperaturaDesejada >= 15 && temperaturaDesejada <= 30) {
            this.temperaturaDesejada = temperaturaDesejada;
        } else {
            System.out.println("Temperatura inválida!");
        }
    }
}
