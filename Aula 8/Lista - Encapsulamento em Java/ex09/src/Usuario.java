import java.sql.SQLOutput;

public class Usuario {
    private String nome;
    private String senha;

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
        } else {
            System.out.println("Senha inválida!");
        }
    }
}
