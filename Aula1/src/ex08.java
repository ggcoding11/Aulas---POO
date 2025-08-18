import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        int n;

        System.out.println("Digite um numero: ");

        Scanner leitor = new Scanner(System.in);
        n = leitor.nextInt();

        System.out.println(Math.pow(n, 2));
        System.out.println(Math.pow(n, 3));
    }
}
