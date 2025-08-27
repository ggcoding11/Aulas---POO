public class Professor {
    String nome;
    int idade;

    Disciplina[] disciplinas;

    Professor(String nome, int idade, int qntdDisciplinas){
        this.nome = nome;
        this.idade = idade;
        this.disciplinas = new Disciplina[qntdDisciplinas];
    }

    void adicionarDisciplina(Disciplina disciplina){
        int i = 0;

        while (i < disciplinas.length && disciplinas[i] != null){
            i++;
        }

        if (i < disciplinas.length){
            disciplinas[i] = disciplina;
        } else {
            System.out.println("Sem espaço para novas disciplinas");
        }
    }

    void mostrarDisciplinas(){
        int i = 0;

        while (i < disciplinas.length && disciplinas[i] != null){
            System.out.println(disciplinas[i].descricao);

            i++;
        }
    }
}
