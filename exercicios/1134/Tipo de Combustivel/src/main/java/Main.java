import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int alcool = 0, gasolina = 0, disel = 0;
        boolean continuar = true;

        while (continuar) {
            int valorSwitch = leitura();
            switch (valorSwitch) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    disel++;
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO\n" +
                "Alcool: "+alcool+"\n" +
                "Gasolina: "+gasolina+"\n" +
                "Diesel: "+disel);
        sc.close();
    }

    private static int leitura() {
        return sc.nextInt();
    }
}