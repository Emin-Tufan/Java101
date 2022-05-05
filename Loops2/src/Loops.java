import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1,result=1,result2=1;


        System.out.printf("Bir sayi girin:");
        n1 = input.nextInt();

        System.out.printf("4'dun kuevetleri:");
        for (int i = 1; i <= n1; i++) {
            result*=4;

            if(result<n1) {

                System.out.print(result + " ");
            }
            else if(result>n1)
                break;
        }
        System.out.println();

        System.out.printf("5'in kuvetleri:");
        for (int i = 1; i <= n1; i++) {

            result2*=5;
            if(result2<n1)
                System.out.print(result2+" ");

            else if (result>n1)
                break;


        }
    }
}
