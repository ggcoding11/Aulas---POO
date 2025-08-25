public class Motor {
    public int potencia;
    private String tipoCombustivel;

    Motor(int potencia, String tipoCombustivel){
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void exibirDetalhes(){
        System.out.println("Motor");
        System.out.printf("Potencia: %s\n", this.potencia);
        System.out.printf("Tipo de combustivel: %s\n", this.tipoCombustivel);
    }
}
