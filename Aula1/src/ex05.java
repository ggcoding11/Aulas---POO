import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        System.out.println("Sucessor: " + (n + 1));
        System.out.println("Antecessor: " + (n - 1));
    }
}


