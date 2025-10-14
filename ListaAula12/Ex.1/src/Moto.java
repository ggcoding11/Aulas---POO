public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void mostrarDetalhes(){
        System.out.println("MOTO: ");
        System.out.println("Marca = " + super.getModelo());
        System.out.println("Modelo = " + super.getMarca());
        System.out.println("Ano = " + super.getAno());
        System.out.println("Cilindradas = " + this.getCilindradas());
    }
}
