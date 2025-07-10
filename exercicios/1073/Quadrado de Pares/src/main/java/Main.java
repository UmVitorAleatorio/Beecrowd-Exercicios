import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade = leitura();
        raizPares(quantidade);
    }

    public static int leitura() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void raizPares(int quantidade) {
        for (int i = 2; i <= quantidade; i += 2) {
            System.out.println(i+"^"+2+" = "+(int)Math.pow(i, 2));
        }
    }
}