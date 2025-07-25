import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = leitura();
        int n2 = leitura();
        somaNaoMultiplo(n1, n2);
        sc.close();
    }

    private static int leitura() {
        return sc.nextInt();
    }

    private static void somaNaoMultiplo(int n1, int n2) {
        if (n1 > n2) {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }
        int soma = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }
        imprimeSoma(soma);
    }

    private static void imprimeSoma(int soma) {
        System.out.println(soma);
    }
}
