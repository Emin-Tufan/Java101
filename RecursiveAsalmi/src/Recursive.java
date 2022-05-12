import java.util.Scanner;

public class Recursive {

    static int asalMi(int a, int b) {

        int baslangic = a;
        int bitir = b;
        if (durum(baslangic))
            System.out.printf("Asaldir:" + a);
        else
            System.out.printf("Asal degildir:" + a);

        return 1;
    }

    static public boolean durum(int sayi) {
        boolean durum = true;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0 && i != 1) {
                durum = false;

            }
        }
        return durum;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Deger girin:");
        int n1 = input.nextInt();

        asalMi(n1, n1 - 1);


    }
}
