import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int matematik, fizik, türkçe, kimya, müzik, ortalama = 0;

        System.out.printf("Matematik ders notunu girin:");
        matematik = input.nextInt();
        if(matematik>=0&&matematik<=100)
            ortalama+=matematik;

        System.out.printf("Fizik ders notunu girin:");
        fizik = input.nextInt();
        if(fizik>=0&&fizik<=100)
            ortalama+=fizik;

        System.out.printf("Turkce ders notunu girin:");
        türkçe = input.nextInt();
        if(türkçe>=0&&türkçe<=100)
            ortalama+=türkçe;

            System.out.printf("Kimya ders notunu girin:");
        kimya = input.nextInt();
        if(kimya>=0&&kimya<=100)
            ortalama+=kimya;

            System.out.printf("Muzik ders notunu girin:");
        müzik = input.nextInt();
        if(kimya>=0&&kimya<=100)
            ortalama+=müzik;

        System.out.println("Ortalamazniz:"+ortalama/5);

        if((ortalama/5)<55){
            System.out.printf("Kaldiniz..");
        }
        else {
            System.out.printf("Gectiniz..");
        }



    }
}
