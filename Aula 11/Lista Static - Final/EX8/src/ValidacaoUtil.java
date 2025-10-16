public class ValidacaoUtil {
    public static boolean isEmailValido(String email){
        if(email.indexOf("@") != -1){
            return true;
        }

        return false;
    }

    private ValidacaoUtil(){

    }
}
