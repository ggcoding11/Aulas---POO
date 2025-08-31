import com.sun.security.jgss.GSSUtil;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    Carro(String marca, String modelo, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int incremento) {
        if ((velocidadeAtual + incremento) <= 180) {
            velocidadeAtual += incremento;
        } else {
            System.out.println("Velocidade máxima excedida!");
        }
    }

    public void frear (int decremento) {
        if ((velocidadeAtual - decremento) >= 0) {
            velocidadeAtual -= decremento;
        } else {
            System.out.println("Frenagem inválida");
        }
    }
}
