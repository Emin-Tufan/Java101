import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, r, result = 1, result1 = 1, result2 = 1, lastResult;

        System.out.printf("Birinci degeri girin:");
        n = input.nextInt();

        System.out.printf("Ikinci degeri girin:");
        r = input.nextInt();

        for (int i = 1; i < n; i++) {
            result += i * result;
        }
        for (int i = 1; i < r; i++) {
            result1 += i * result1;
        }

        for (int i = 1; i < n - r; i++) {

           result2+=result2*i;
        }
        lastResult = (result / (result1 * result2));
        System.out.printf("Girilen sayinin kombinasyonu:" + lastResult);
    }
}
