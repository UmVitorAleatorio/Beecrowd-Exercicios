import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int multiplicador = leitor();
        imprime(multiplicador);
    }

    private static int leitor() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void imprime(int multiplicador) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x " + multiplicador + " = " + (multiplicador * i));
        }
    }
}
