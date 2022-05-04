import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month, day;

        System.out.printf("Dogdugunuz ayi girin:");
        month = input.nextInt();

        System.out.printf("Dogdugunuz gunu girin:");
        day = input.nextInt();

        if ((month == 12 && day <= 22) || (month == 1 && day <= 21)) {
            System.out.printf("Burcunuz:OGALAK");
        } else if ((month == 1 && day <= 22) || (month == 2 && day <= 19))
            System.out.printf("Burcunuz:KOVA");

        else if ((month == 2 && day <= 20) || (month == 3 && day <= 20))
            System.out.printf("Burcunuz:BALIK");

         else if ((month == 3 && day <= 21) || (month == 4 && day <= 20))
            System.out.printf("Burcunuz: KOC");

        else if ((month == 4 && day <= 21) || (month == 5 && day <= 21))
            System.out.printf("Burcunuz:BOGA");

        else if ((month == 5 && day <= 22) || (month == 6 && day <= 22))
            System.out.printf("Burcunuz:IKIZLER");

        else if ((month == 6 && day <= 23) || (month == 7 && day <= 22))
            System.out.printf("Burcunuz:YENGEC");

        else if ((month == 7 && day <= 23) || (month == 8 && day <= 22))
            System.out.printf("Burcunuz:ASLAN");

        else if ((month == 8 && day <= 23) || (month == 9 && day <= 22))
            System.out.printf("Burcunuz:BASAK");

        else if ((month == 9 && day <= 23) || (month == 10 && day <= 22))
            System.out.printf("Burcunuz:TERAZI");

        else if ((month == 10 && day <= 23) || (month == 11 && day <= 21))
            System.out.printf("Burcunuz:AKREP");

        else
            System.out.printf("Burcunuz:YAY");


    }
}
