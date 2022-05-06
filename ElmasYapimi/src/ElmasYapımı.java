import java.util.Scanner;

public class ElmasYapımı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        System.out.printf("Bir deger girin:");
        n1 = input.nextInt();

        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n1 - i; j++) {

                System.out.printf(" ");
            }
            for (int d = 0; d < (i * 2) + 1; d++) {

                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.printf(" ");
            }
            for (int d = 0; d < (n1 - i) * 2 - 1; d++) {
                System.out.printf("*");

            }
            System.out.println();
        }


    }
}
