import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, n3;

        System.out.printf("1. Sayiyi girin:");
        n1 = input.nextInt();

        System.out.printf("2. Sayiyi girin:");
        n2 = input.nextInt();

        System.out.printf("3. Sayiyi girin:");
        n3 = input.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3)
                System.out.printf("a > b > c");
            else{
                System.out.printf("a > c > b");
            }
        }
        else if (n2>n1&&n2>n3){
            if(n1>n3)
                System.out.printf("b > a > c");
            else {
                System.out.printf("b > c > a ");
            }

        }
        else {
            if(n1>n2)
            System.out.printf("c > a > b");

            else {
                System.out.printf("c > b > a");
            }
        }


    }
}
