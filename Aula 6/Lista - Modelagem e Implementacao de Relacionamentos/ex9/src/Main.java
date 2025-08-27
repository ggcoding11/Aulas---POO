public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(4000, "Intel", 4, 32, "Asus", 3, 20);

        System.out.println("Preço: " + pc.preco);
        System.out.println("Processador: " + pc.processador.marca + "/ " + pc.processador.qntdNucleos + " núcleos");

        pc.adicionarRAM(16, "HyperX");

        Periferico mouse = new Periferico("Mouse");

        pc.adicionarPeriferico(mouse);

        System.out.println("Periferico: " + pc.perifericos[0].nome);
        System.out.println("Memoria 2: " + pc.memorias[1].marca);
    }

}
