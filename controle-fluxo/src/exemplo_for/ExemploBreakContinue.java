package exemplo_for;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        //Para
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                //break;
                continue;
            System.out.println(numero);
        }
    }
}