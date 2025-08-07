import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");

        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();

        System.out.println("Numero: " + num);
    }
}
