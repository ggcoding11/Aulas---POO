public class Usuario {
    private String email;

    public Usuario(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (ValidacaoUtil.isEmailValido(email) == true) {
            this.email = email;
        } else {
            System.out.println("Email inválido!");
        }
    }
}
