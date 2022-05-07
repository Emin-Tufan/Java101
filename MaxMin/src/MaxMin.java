import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        int n1, n2 = 0, max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Gireceginiz sayi adedini girin:");
        n1 = input.nextInt();


        for (int i = 0; i < n1; i++) {

            System.out.printf(i + 1 + ". sayiyi girin:");
            n2 = input.nextInt();

            if (i == 0) {
                max = n2;
                min = n2;
            } else {
                if (max < n2) {
                    max = n2;
                }
                if (min > n2) {
                    min = n2;
                }
            }
        }
        System.out.printf("En buyuk:" + max+"\n");
        System.out.printf("En kuck deger:" + min+"\n");

    }
}
