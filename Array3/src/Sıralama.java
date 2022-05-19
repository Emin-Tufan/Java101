import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.spi.AbstractResourceBundleProvider;

public class Sıralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.printf("Dizinin boyutunu girin:");
        n1 = input.nextInt();

        int[] Array = new int[n1];

        for (int i = 0; i < Array.length; i++) {
            System.out.printf(i + 1 + ". Elemani girin:");
            Array[i] = input.nextInt();
        }

        for (int i = 0; i < Array.length; i++) {

            for (int j = i + 1; j < Array.length; j++) {

                if (Array[i] > Array[j]) {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.printf("Dizinin kucukten buyuge siralamasi: ");
        for (int item : Array) {
            System.out.printf(item + " ");
        }


    }
}
