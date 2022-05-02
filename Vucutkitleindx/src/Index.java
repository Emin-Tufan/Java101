import java.util.Scanner;

public class Index {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
         double boy,kilo,kiteIndex;

        System.out.printf("Boyunuzu metre cinsinden girin:");
        boy=input.nextDouble();

        System.out.printf("Kilonuzu girin:");
        kilo=input.nextDouble();
        kiteIndex=kilo/(boy*boy);

        System.out.printf("Vucut kitle indexiniz:"+kiteIndex);



    }
}
