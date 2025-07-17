import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            int n1 = leitor();

            if (n1 <= 0) {
                break;
            }

            int n2 = leitor();
            if (n2 <= 0) {
                break;
            } else {
                imprime(n1, n2);
            }
        } while (true);
    }

    private static void imprime(int n1, int n2) {
        int inicio = Math.min(n1, n2);
        int fim = Math.max(n1, n2);
        List<Integer> numeros = new ArrayList<>();

        for (int i = inicio; i <= fim; i++) {
            numeros.add(i);
        }
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("Sum=" + numeros.stream().mapToInt(Integer::intValue).sum());
    }

    private static int leitor() {
        return sc.nextInt();
    }
}
