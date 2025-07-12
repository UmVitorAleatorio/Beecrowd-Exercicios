import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int divisor = leitor();
        resto(divisor);
    }

    private static int leitor() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void resto(int divisor) {
        if (divisor == 0) {
            return;
        }
        for (int i = 1; i <= 10000; i++) {
            if (i % divisor == 2) {
                System.out.println(i);
            }
        }
    }
}
