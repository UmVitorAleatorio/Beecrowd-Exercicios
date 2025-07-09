import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMes;

        numMes = sc.nextInt();
        Month mes = Month.of(numMes);
        String mesStr = mes.toString();
        mesStr = primeiraLetraUpperCase(mesStr);
        System.out.println(mesStr);
    }

    public static String primeiraLetraUpperCase(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}