import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número: ");

        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");

        int num2 = leitor.nextInt();

        int soma = num1 + num2;

        System.out.println("Soma: " + soma);
    }
}
