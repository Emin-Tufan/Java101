import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double yarCap,pi=3.14,alfa,area;
        /*
        System.out.printf("Dairenin yari capini girin:");
        yarCap=input.nextDouble();

        System.out.println("Dairenin alani:"+(yarCap*yarCap*pi));
        System.out.printf("Dairenin cevresi:"+(2*pi*yarCap));

         */

        System.out.printf("Dairinein yari capini girin:");
        yarCap=input.nextDouble();

        System.out.printf("Dairenin acisini girin:");
        alfa=input.nextDouble();

        area=(pi*(yarCap*yarCap)*alfa)/360;
        System.out.printf("Daire diliminin alani:"+area);





    }
}
