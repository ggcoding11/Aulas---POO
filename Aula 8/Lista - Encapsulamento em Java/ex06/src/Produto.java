public class Produto {
    private String nome;
    private float preco;

    Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preco inválido!");
        }
    }
}
