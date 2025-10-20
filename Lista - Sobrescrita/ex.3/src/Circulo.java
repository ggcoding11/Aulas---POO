public class Circulo extends FormaGeometrica{
    private int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI * raio * raio);
    }
}
