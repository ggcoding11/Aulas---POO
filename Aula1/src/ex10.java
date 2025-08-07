import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int soma = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i + 1) + "° número: ");
            soma += leitor.nextInt();
        }

        System.out.println("Soma total: " + soma);
    }


}
