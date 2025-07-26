import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int entrada = leitura();
        int saida = leitura();
        imprimeResto(entrada, saida);
        sc.close();
    }

    private static int leitura() {
        return sc.nextInt();
    }

    private static void imprimeResto(int entrada, int saida) {
        int menor = Math.min(entrada, saida);
        int maior = Math.max(entrada, saida);

        for (int i = menor+1; i < maior; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}
