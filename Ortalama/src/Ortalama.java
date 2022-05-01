import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik, Toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Ogrencinin Fizik sinavi notu: ");
        Fizik = input.nextInt();

        System.out.print("Ogrencinin Matematik sinavi notu: ");
        Matematik = input.nextInt();

        System.out.print("Ogrencinin Tarih sinavi notu: ");
        Tarih = input.nextInt();

        System.out.print("Ogrencinin Muzik sinavi notu: ");
        Muzik = input.nextInt();

        System.out.print("Ogrencinin Kimya sinavi notu: ");
        Kimya = input.nextInt();

        System.out.print("Ogrencinin Turkce sinavi notu: ");
        Turkce = input.nextInt();

        Toplam = (Matematik + Fizik + Kimya + Muzik + Tarih + Turkce);
        Double Ort = Toplam / 6.0;
        String Control = Ort < 60 ? "Kaldiniz:" : "Gectiniz:";
        System.out.println("Ortalamanız :" + Ort + "\n" + Control);
    }


}


