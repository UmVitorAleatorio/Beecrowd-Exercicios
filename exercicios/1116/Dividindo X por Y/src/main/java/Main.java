import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        int aux = leitura();
        for (int i = 0; i < aux; i++) {
            int x = leitura();
            int y = leitura();
            divisaoXY(x,y);
        }
        sc.close();
    }

    private static int leitura() {
        return sc.nextInt();
    }

    private static void divisaoXY(int x, double y) {
        if (y == 0) {
            System.out.println("divisao impossivel");
            return;
        }
        System.out.println(df.format(x/y));
    }
}