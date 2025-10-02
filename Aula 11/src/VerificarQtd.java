public class VerificarQtd {
    private VerificarQtd(){

    }

    public static void isBoa(int qntdAluno){
        if (qntdAluno > 2){
            System.out.println("Quantidade top");
        } else {
            System.out.println("Quantidade ruim");
        }
    }
}
