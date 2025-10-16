import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < 50; i++){
            Desenvolvedor novoDev = new Desenvolvedor("GeeG" + i, "000.000.000-00", 2500.34, "C");
            funcionarios.add(novoDev);
        }

        for (int i = 0; i < 10; i++){
            Gerente novoGerente = new Gerente("Pedrin" + i, "000.000.000-00", 2500.34, "Marketing");
            funcionarios.add(novoGerente);
        }

        for (Funcionario f: funcionarios){
            System.out.println(f);
            System.out.printf("%.2f", f.getBonus());

            System.out.println();
        }

        Calculadora.somar(1,2);
        Calculadora.somar(1,2);
    }

}
