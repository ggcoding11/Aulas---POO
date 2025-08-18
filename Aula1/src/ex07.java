import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        float valor;

        System.out.println("Digite o valor em reais: ");
        Scanner leitor = new Scanner(System.in);

        valor = leitor.nextFloat();

        System.out.printf("Valor em dólares: %.2f", (valor)/5.45);
    }
}
