public class Circulo {
    double raio;

    double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    Circulo(double raio){
        this.raio = raio;
    }
}
