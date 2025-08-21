public class Carro {
    String marca;
    String modelo;

    Motor motor;

    void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia do motor: " + motor.potencia);
    }

    Carro(String marca, String modelo, int potenciaCarro, String combustivelCarro){
        this.marca = marca;
        this.modelo = modelo;

        motor = new Motor(potenciaCarro, combustivelCarro);
    }
}
