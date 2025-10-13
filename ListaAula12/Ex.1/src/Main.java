public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Ford", "Ka", 1992, 2);
        Moto m1 = new Moto("Honda", "Freeway", 1996, 150);

        System.out.println("CARRO: ");
        System.out.println("Marca = " + c1.getMarca());
        System.out.println("Modelo = " + c1.getModelo());
        System.out.println("Ano = " + c1.getAno());
        System.out.println("Número de portas = " + c1.getNumeroDePortas());

        System.out.println();
        System.out.println();

        System.out.println("MOTO: ");
        System.out.println("Marca = " + m1.getModelo());
        System.out.println("Modelo = " + m1.getMarca());
        System.out.println("Ano = " + m1.getAno());
        System.out.println("Cilindradas = " + m1.getCilindradas());
    }
}

