import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double  Kdv = 0,Tutar,KdvTutari;

        System.out.printf("Bir tutar girin:");
        Tutar = input.nextInt();

        double Control = (Tutar < 1000 && Tutar > 0) ? (Kdv=0.18):(Kdv=0.8);
        KdvTutari = (Kdv * Tutar);
        System.out.println("Kdv Tutari: "+ KdvTutari);
    }
}
