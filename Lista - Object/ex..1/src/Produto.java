public class Produto {
    private String sku;
    private String nome;
    private double preco;

    public Produto(String sku, String nome, double preco){
        this.sku = sku;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return ("SKU: " + sku + "\nNome: " + nome + "\nPreço: " + preco);
    }
}
