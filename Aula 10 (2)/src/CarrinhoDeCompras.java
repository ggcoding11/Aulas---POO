import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Livro> itens;

    public CarrinhoDeCompras(){
        itens = new ArrayList<>();
    }

    public void adicionarItens(Livro livro){
        itens.add(livro);
    }

    public void removerItem(Livro livro){
        itens.remove(livro);
    }

    public void listarItens(){
        for (Livro livro: itens){
            System.out.println("Livro " + itens.indexOf(livro) + ": " + "Preço = " + livro.getPreco() + "/ Autor: " +
                    livro.getAutor() + "/ Nome: " + livro.getNome());
        }
    }

    public double calcularTotal(){
        double total = 0;

        for (Livro livro: itens){
            total += livro.getPreco();
        }

        return total;
    }
}
