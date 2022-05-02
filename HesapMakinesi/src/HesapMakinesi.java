import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, selct, result=0;

        System.out.println("Islemler");
        System.out.println("------------");
        System.out.println("1.Islem toplama");
        System.out.println("2.Islem cikarma");
        System.out.println("3.Islem carpma");
        System.out.println("4.Islem bolme");
        System.out.println("");

        System.out.printf("Yukaridan bir islem secin:");
        selct = input.nextInt();

        System.out.printf("1. Sayiyi girin:");
        n1 = input.nextInt();

        System.out.printf("2. Sayiyi girin: ");
        n2 = input.nextInt();


        switch (selct) {

            case 1: result=n1+n2;break;
            case 2:result=n1-n2;break;
            case 3:result=n1*n2;break;
            case 4:result=n1/2;break;
            default:

        }
        System.out.printf("Result:"+result);


    }
}
