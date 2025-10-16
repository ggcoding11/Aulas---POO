public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("gustavo@gmail.com");

        u1.setEmail("gustavo.com");
        u1.setEmail("gustavo123@gmail.com");

        System.out.println(u1.getEmail());
    }
}
