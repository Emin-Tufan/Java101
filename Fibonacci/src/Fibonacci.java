import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n1;
        Scanner input = new Scanner(System.in);
        System.out.printf("Eleman adedini girin:");
        n1 = input.nextInt();

        int n2 = 0, n3 = 1, n4;
        System.out.printf(n2 + " " + n3 + " ");
        for (int i = 2; i < n1; i++) {

            n4 = n2 + n3;
            n2 = n3;
            n3 = n4;

            System.out.printf(n3 + " ");
        }


    }
}

