import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int n1;

        System.out.printf("Bir sayi girin: ");
        n1 = input.nextInt();

        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            if (list[i] > n1) {

                System.out.println("Girilen sayiya yakin en buyuk sayi:" + list[i]);
                System.out.printf("Girilen sayiya yakin en kucuk sayi:" + list[i - 1]);
                break;
            }
        }


    }
}

