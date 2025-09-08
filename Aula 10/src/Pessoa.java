public class Pessoa {
    private String nome;
    private String cpf;
    private String[] telefones;

    private int ultimaPosicaoDisponivel;

    public Pessoa(String nome, String cpf, int qntdTelefones){
        this.nome = nome;
        this.cpf = cpf;
        this.telefones = new String[qntdTelefones];
        this.ultimaPosicaoDisponivel = 0;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return nome;
    }

    public void addTelefone(String telefone){
        if (ultimaPosicaoDisponivel < telefones.length) {
            this.telefones[ultimaPosicaoDisponivel] = telefone;
            ultimaPosicaoDisponivel++;
        }
    }

    public void viewTelefone(){
        for (int i = 0; i < this.ultimaPosicaoDisponivel; i++){
            System.out.println("Telefone " + i + ": " + telefones[i]);
        }
    }

    public void removeTelefone(String telefone){
        for (int i = 0; i <= this.ultimaPosicaoDisponivel; i++){
            if (telefones[i].equals(telefone)){
                telefones[i] = null;
            }
        }
    }
}
