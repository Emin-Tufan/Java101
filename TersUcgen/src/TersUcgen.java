import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        int n1;
        Scanner input = new Scanner(System.in);
        System.out.printf("Ucgenin basamak sayisini girin:");
        n1 = input.nextInt();

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
