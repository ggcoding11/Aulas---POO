import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        boolean senhaCorreta = false;

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Digite a sua senha: ");
            String senha = leitor.next();

            if (senha.length() >= 8){
                System.out.println("A senha está válida!");
                senhaCorreta = true;
            } else {
                System.out.println("A senha está inválida!");
            }
        } while (!senhaCorreta);
    }
}
