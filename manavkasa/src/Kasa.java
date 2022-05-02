import java.util.Scanner;

public class Kasa {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00,kilo,tutar=0;

        System.out.printf("Alinan Armut kilogrami:");
        armut=input.nextDouble()*2.14;
        tutar+=armut;

        System.out.printf("Alinan Elma kilogrami:");
        elma=input.nextDouble()*3.67;
        tutar+=elma;

        System.out.printf("Alinan Domates kilogrami:");
        muz=input.nextDouble()*1.11;
        tutar+=domates;

        System.out.printf("Alinan Muz kilogrami:");
        muz=input.nextDouble()*0.95;
        tutar+=muz;

        System.out.printf("Alinan Patlican kilogrami:");
        patlıcan=input.nextDouble()*5.00;
        tutar+=patlıcan;

        System.out.printf("Toplam tutar:"+tutar);





    }
}
