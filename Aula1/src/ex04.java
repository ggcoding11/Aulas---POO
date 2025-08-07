import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro número: ");

        Scanner leitor = new Scanner(System.in);

        float num1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");

        float num2 = leitor.nextInt();

        System.out.println("Digite o terceiro número: ");

        float num3 = leitor.nextInt();

        float media = (num1 + num2 + num3)/3;

        System.out.println("Média: " + media);
    }
}
