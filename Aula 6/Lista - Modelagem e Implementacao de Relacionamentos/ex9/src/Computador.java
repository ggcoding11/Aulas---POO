public class Computador {
    float preco;

    Processador processador;
    MemoriaRAM[] memorias;
    Periferico[] perifericos;

    Computador(float preco, String marcaProcessador, int qntdNucleos, int qntdRAM, String marcaRAM, int qntdMemorias, int qntdPerifericos){
        this.preco = preco;

        processador = new Processador(marcaProcessador, qntdNucleos);
        memorias = new MemoriaRAM[qntdMemorias];

        memorias[0] = new MemoriaRAM(qntdRAM, marcaRAM);

        perifericos = new Periferico[qntdPerifericos];
    }

    void adicionarRAM(int qntdRAM, String marcaRAM){
        int i = 0;

        while (i < memorias.length && memorias[i] != null){
            i++;
        }

        if (i < memorias.length){
            memorias[i] = new MemoriaRAM(qntdRAM, marcaRAM);
        } else {
            System.out.println("Sem espaço para mais memória!");
        }
    }

    void adicionarPeriferico(Periferico periferico){
        int i = 0;

        while (i < perifericos.length && perifericos[i] != null){
            i++;
        }

        if (i < perifericos.length){
            perifericos[i] = periferico;
        } else {
            System.out.println("Sem espaço para mais perifericos!");
        }
    }
}
