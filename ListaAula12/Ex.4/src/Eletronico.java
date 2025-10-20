public class Eletronico extends Produto{
    private int voltagem;
    private int garantiaEmMeses;

    public Eletronico(int id, String nome, double preco, int voltagem, int garantiaEmMeses){
        super(id, nome, preco);

        this.voltagem = voltagem;
        this.garantiaEmMeses = garantiaEmMeses;
    };







}
