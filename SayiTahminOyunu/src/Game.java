import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rand = (int) (Math.random() * 100);

        int n1, right = 0;
        int[] tahmin = new int[5];


        while (right < 5) {
            System.out.printf(right + 1 + ". Tahmini girin: ");
            n1 = input.nextInt();
            tahmin[right] = n1;
            if (n1 > 100 || n1 < 0) {
                System.out.println("0 ile 100 arasinda sayi girin..");
                continue;
            }
            if (n1 == rand) {
                System.out.println("Tebrikler tahmininiz dogru..");
                break;

            } else if (n1 < rand) {
                System.out.println("Hatali sayi girdiniz girdiginiz sayi gizli sayidan kucuktur..");
                right++;
                System.out.println("Kalan hakkiniz:" + (5 - right));

            } else if (n1 > rand) {
                System.out.println("Hatali sayi girdiniz girdiginiz sayi gizli sayidan buyuktur..");
                right++;
                System.out.println("Kalan hakkiniz:" + (5 - right));

            } else {
                right++;
                System.out.println("Kalan hakkiniz:" + (5 - right));
            }
            if (right == 5) {
                System.out.println("Kaybettiniz kalan hakkiniz: " + 0);

                System.out.println("Gizli sayi:" + rand);
                System.out.print("Girdiginiz sayilar: ");

                for (int item : tahmin) {
                    System.out.print(item + " ");
                }
            }
        }


    }
}
