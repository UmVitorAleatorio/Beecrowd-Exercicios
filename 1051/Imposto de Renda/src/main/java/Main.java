import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario, imposto = 0, aux;
        boolean continuar = false;

        salario = sc.nextDouble();
        aux = salario;

        if (salario > 4500) {
            imposto += (salario - 4500) * 0.28;
            aux -= 4500;
            salario -= aux;
            aux = salario;
            continuar = true;
        }

        if (salario > 3000 && salario <= 4500) {
            imposto += (salario - 3000) * 0.18;
            aux -= 3000;
            salario -= aux;
            aux = salario;
            continuar = true;
        }

        if (salario > 2000 && salario <= 3000) {
            imposto += (salario - 2000) * 0.08;
            aux -= 2000;
            salario -= aux;
            continuar = true;
        }

        if (salario >= 0 && salario <= 2000 && !continuar) {
            System.out.println("Isento");
        }else {
            System.out.println("R$ "+df.format(imposto));
        }
    }
}