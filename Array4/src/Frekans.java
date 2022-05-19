import java.util.Arrays;
import java.util.Scanner;
public class Frekans {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int []Array=new int[]{12,43,54,23,12,43,3,54,12};


        while (true) {
            int n1,control=0;
            System.out.printf("Dizide aradiginiz sayiyi girin:");
            n1=input.nextInt();

            for (int i = 0; i < Array.length; i++) {
                if (Array[i] == n1) {
                    control++;
                }
            }
            System.out.printf(n1 + " Sayiysi " + control + " kere tekrar edildi..\n");
        }
    }
}
