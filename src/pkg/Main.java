package pkg;

public class Main {
    public static void main (String args[]) {
        System.out.println(divideLBYL(0,0));
        System.out.println(divideEAFP(0,0));
    }

    private static int divideLBYL(int x, int y) {
        // Sempre verifica primeiro
        if (y != 0)
            return x / y; // Executa depois
        return 0;
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y; // Executa primeiro
        } catch (ArithmeticException exception) { // Trata a possível exceção depois
            return 0;
        }
    }

}
