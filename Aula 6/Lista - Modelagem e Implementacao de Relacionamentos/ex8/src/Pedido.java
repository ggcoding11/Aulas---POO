public class Pedido {
    Cliente cliente;
    Produto[] produtos;

    Pedido(Cliente cliente, Produto produto){
        this.cliente = cliente;
        produtos = new Produto[20]; //Defini uma quantidade máxima de produtos;
        produtos[0] = produto;
    }

    void adicionarProduto(Produto produto){
        int i = 0;

        while (i < produtos.length && produtos[i] != null){
            i++;
        }

        if (i < produtos.length){
            produtos[i] = produto;
        } else {
            System.out.println("Sem espaço para mais produtos!");
        }
    }

    void mostrarDetalhes(){
        System.out.println("Nome do cliente: " + cliente.nome);

        int i = 0;

        while (i < produtos.length && produtos[i] != null){
            System.out.println("Produto " + (i+1)+ ": " + produtos[i].nome + " (" + produtos[i].preco + ")");

            i++;
        }
    }
}
