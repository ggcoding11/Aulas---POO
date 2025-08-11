import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        System.out.println("Digite o número: ");
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        System.out.println("Dobro: " + (n*2));
        System.out.println("Triplo: " + (n*3));
        System.out.println("Raiz quadrada: " + Math.sqrt(n));
    }
}
