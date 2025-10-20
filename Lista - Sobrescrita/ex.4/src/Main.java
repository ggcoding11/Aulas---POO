public class Main {
    public static void main(String[] args) {
        Colaborador c1 = new Colaborador();
        Gerente g1 = new Gerente();

        System.out.println(c1.calcularFerias());
        System.out.println(g1.calcularFerias());
    }
}
