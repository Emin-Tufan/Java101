import java.util.Scanner;

public class SayıSerisi {

    public static void seri(int a) {
        double temp = a;
        temp /= 5;
        for (int i = 0; i < temp; i++) {
            System.out.print(a + " ");
            a -= 5;

            if (a <= 0) {
                System.out.printf(a + " ");
                for (int d = 0; d < temp; d++) {
                    a += 5;
                    System.out.print(a + " ");
                }

            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1;
        System.out.printf("Sayiyi girin:");
        n1 = input.nextInt();

        seri(n1);


    }
}
