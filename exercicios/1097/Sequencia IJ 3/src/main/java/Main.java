public class Main {
    public static void main(String[] args) {
        int aux = 7;
        for (int i = 1; i <= 9; i += 2) {
            for (int j = aux; j != aux-3; j--){
                System.out.println("I="+i+" J="+j);
            }
            aux += 2;
        }
    }
}