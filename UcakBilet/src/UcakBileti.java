import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double age, type, km, paidKm = 0.10, totalPaid = 0.0;


        System.out.printf("Yasinizi girin:");
        age = input.nextInt();

        if (age < 0)
            System.out.printf("Lutfen gecerli yas girin");

        System.out.printf("Tek gidisse 1'e basin gidis donus ise 2'ye basin lutfen:");
        type = input.nextInt();

        if (type == 1 || type == 2) {
        } else
            System.out.printf("Lutfen gecerli yolculuk tipi secin..");

        System.out.printf("Mesafeyi girin:");
        km = input.nextDouble();

        if (km <= 0)
            System.out.printf("Lutfen gecerli mesafe girin..");

        if (age < 12 && type == 2)
            totalPaid += ((km * paidKm) * 0.3)*2;

        else if (age < 12 && type == 1)
            totalPaid += (km * paidKm) * 0.5;

        else if (age < 24 && type == 2)
            totalPaid += ((km * paidKm) * 0.7)*2;

        else if (age < 24 && type == 1)
            totalPaid += (km * paidKm) * 0.9;

        else if (age > 65 && type == 2)
            totalPaid += ((km * paidKm) * 0.5)*2;

        else if (age > 65 && type == 1)
            totalPaid += (km * paidKm) * 0.6;

        else if (age>24&&type==2)
            totalPaid+=((km*paidKm)*0.8)*2;

        else
            totalPaid+=(km*paidKm);


        System.out.printf("Toplam ucret:" + totalPaid);


    }

}

