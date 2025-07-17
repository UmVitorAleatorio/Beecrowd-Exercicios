import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            int n1 = leitor();
            int n2 = leitor();

            if (n1 == n2) {
                break;
            }

            verifica(n1, n2);
        } while (true);
        sc.close();
    }

    private static int leitor() {
        return sc.nextInt();
    }

    private static void verifica(int n1, int n2) {
        if (n1 < n2) {
            System.out.println("Crescente");
        }else {
            System.out.println("Decrescente");
        }
    }
}
