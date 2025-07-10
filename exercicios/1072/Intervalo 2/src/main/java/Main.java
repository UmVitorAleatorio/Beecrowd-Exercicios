import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade = leitura();
        int[] numeros = new int[quantidade];
        injetor(quantidade, numeros);

        System.out.println(dentro(numeros) + " in");
        System.out.println(fora(numeros) + " out");
    }

    static Scanner sc = new Scanner(System.in);

    public static int leitura() {
        return sc.nextInt();
    }

    public static void injetor(int quantidade, int[] numeros) {
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = leitura();
        }
    }

    public static int dentro(int[] numeros) {
        return Arrays.stream(numeros).filter(n -> n >= 10 && n <= 20).toArray().length;
    }

    public static int fora(int[] numeros) {
        return Arrays.stream(numeros).filter(n -> n < 10 || n > 20).toArray().length;
    }
}
