public class Casa {
    String endereco;

    Comodo[] comodos;

    Casa(String endereco, String nomeComodo, int tamanho){
        this.endereco = endereco;

        this.comodos = new Comodo[tamanho];
        comodos[0] = new Comodo(nomeComodo);
    }

    void adicionarComodo(String nome){
        int i = 0;

        while (i < comodos.length && comodos[i] != null){
            i++;
        }

        if (i == comodos.length){
            System.out.println("Sem espaço para comodos!");
        } else {
            comodos[i] = new Comodo(nome);
        }
    }

    void mostrarComodos(){
        int i = 0;

        while (i < comodos.length && comodos[i] != null){
            System.out.println("Comodo" + (i+1) + ": " + comodos[i].nome);

            i++;
        }
    }
}