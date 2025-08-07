import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");

        Scanner leitor = new Scanner(System.in);

        String nome = leitor.next();

        System.out.println("Bem-vindo, " + nome);
    }
}
