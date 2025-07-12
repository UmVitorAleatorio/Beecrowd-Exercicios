import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] maior = new int[2];
        int aux;

        for (int i = 0; i < 100; i++) {
            aux = leitura();
            if (aux > maior[0]) {
                maior[0] = aux;
                maior[1] = i+1;
            }
        }

        System.out.println(maior[0] +"\n"+ maior[1]);
    }

    private static int leitura() {
        return sc.nextInt();
    }
}
