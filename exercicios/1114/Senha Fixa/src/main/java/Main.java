import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            String tentativa = leitor();
            if (verifica(tentativa)){
                break;
            }
        } while (true);
        sc.close();
    }

    private static String leitor() {
        return sc.nextLine();
    }

    private static boolean verifica(String tentativa) {
        String senhaCorreta = "2002";
        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso Permitido");
            return true;
        }
        System.out.println("Senha Invalida");
        return false;
    }
}
