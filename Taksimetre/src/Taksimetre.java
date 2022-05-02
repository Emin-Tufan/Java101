import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Tutar, gidilenKm;

        System.out.printf("Gidilen Km girin:");
        gidilenKm = input.nextDouble();

        Tutar = (gidilenKm * 2.20) + 10;
        Tutar = (Tutar >= 20.0) ? Tutar = Tutar : (Tutar = 20.0);

        System.out.printf("Tutar:" + Tutar);


    }
}
