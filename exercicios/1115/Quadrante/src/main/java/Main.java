import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            int x = leitura();
            int y = leitura();
            if (x == 0 || y == 0) {
                break;
            }
            verificaQuadrante(x,y);
        }while (true);
        sc.close();
    }

    private static int leitura() {
        return sc.nextInt();
    }

    private static void verificaQuadrante(int x, int y) {
        if (x > 0 && y > 0){
            System.out.println("primeiro");
        }else if (x < 0 && y > 0){
            System.out.println("segundo");
        }else if (x < 0 && y < 0){
            System.out.println("terceiro");
        }else {
            System.out.println("quarto");
        }
    }
}
