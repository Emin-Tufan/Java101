import java.util.Scanner;

public class HesapMakinesi {

    static void plus() {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.printf("1. Sayiyi girin:");
        a = input.nextInt();
        System.out.printf("2.Sayiyi girin:");
        b = input.nextInt();
        int result = a + b;
        System.out.printf("Sonuc:" + result + "\n");


    }

    static void minus() {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.printf("1. Sayiyi girin:");
        a = input.nextInt();
        System.out.printf("2.Sayiyi girin:");
        b = input.nextInt();
        int result = a - b;
        System.out.printf("Sonuc:" + result + "\n");


    }

    static void times() {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.printf("1. Sayiyi girin:");
        a = input.nextInt();
        System.out.printf("2.Sayiyi girin:");
        b = input.nextInt();
        int result = a * b;
        System.out.printf("Sonuc:" + result + "\n");


    }

    static void divided() {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.printf("1. Sayiyi girin:");
        a = input.nextInt();
        System.out.printf("2.Sayiyi girin:");
        b = input.nextInt();
        int result = a / b;
        System.out.printf("Sonuc:" + result + "\n");


    }

    static void power() {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.printf("Sayiyi girin:");
        a = input.nextInt();
        System.out.printf("Ussunu girin:");
        b = input.nextInt();
        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        System.out.printf("Sonuc:" + result + "\n");

    }

    static void factorial() {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayiyi girin:");
        a = input.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.printf("Sonuc:" + result + "\n");


    }

    static void mod() {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayiyi girin:");
        a = input.nextInt();
        System.out.printf("Bolen sayiyi girin:");
        b = input.nextInt();
        int result = a % b;
        System.out.printf("Sonuc:" + result + "\n");


    }

    static void dikdortgenCevre() {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.printf("Dikdortgen uzun kenar:");
        a = input.nextInt();
        System.out.printf("Diktdortgen kisa kenar:");
        b=input.nextInt();

        int result = (a+b)*2;
        System.out.printf("Sonuc:" + result + "\n");

    }
    static void dikdortgenAlan() {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.printf("Dikdortgen uzun kenar:");
        a = input.nextInt();
        System.out.printf("Diktdortgen kisa kenar:");
        b=input.nextInt();

        int result = a*b;
        System.out.printf("Sonuc:" + result + "\n");

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama Islemi\n" + "2- Cikarma Islemi\n" + "3- Carpma Islemi\n" + "4- Bolme Islemi\n" + "5- Uslu Sayi Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n" + "8- Dikdortgen Alan ve Cevre Hesabi\n" + "0- Cikis Yap\n";

        while (true) {

            System.out.print(menu);

            System.out.printf("Islem seciniz:");
            select = input.nextInt();

            if (select == 0) {
                break;
            }
            switch (select) {
                case 1:
                    plus();
                    break;

                case 2:
                    minus();
                    break;

                case 3:
                    times();
                    break;

                case 4:
                    divided();
                    break;

                case 5:
                    power();
                    break;

                case 6:
                    factorial();
                    break;

                case 7:
                    mod();
                    break;


                case 8:
                    dikdortgenCevre();
                    break;
                case 9:
                    dikdortgenAlan();
                    break;

                default:
                    System.out.printf("Hatili secim yaptiniz");


            }


        }
        System.out.printf("Gule Gule");


    }
}
