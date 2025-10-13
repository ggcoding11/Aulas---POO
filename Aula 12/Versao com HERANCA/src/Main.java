public class Main {
    public static void main(String[] args) {
        Gerente gustavo = new Gerente("Gustavo", "000.000.000-00", 1500.55, "Embarcados");
        Desenvolvedor gabriel = new Desenvolvedor("Gabriel", "000.000.000-00", 1200.65, "Plataforma");

        System.out.println(gustavo.getSetorResponsavel());
        System.out.println(gustavo.getNome());
    }
}
