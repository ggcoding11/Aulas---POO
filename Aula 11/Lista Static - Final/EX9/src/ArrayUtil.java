import java.util.Arrays;

public class ArrayUtil {
    public static int encontrarMaiorNumero(int[] numeros){
        Arrays.sort(numeros);

        return numeros[numeros.length - 1];
    }

    private ArrayUtil(){

    }
}
