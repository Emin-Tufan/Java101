import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi girin: ");
        int n1 = input.nextInt();
        double result = 0.0;

        for (int i=1; i<=n1; i++){
            result += (1.0/i);
        }
        System.out.println("Harmonik serisi: " + result);
    }
}
