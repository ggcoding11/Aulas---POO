public class Cachorro implements Animal {
    private String raca;

    public Cachorro(String raca){
        this.raca = raca;
    }

    @Override
    public void falar() {
        System.out.println("Au Au!!");
    }
}
