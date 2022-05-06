import java.util.Scanner;

public class UsluSayı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, result = 1;

        System.out.printf("Sayi girin:");
        n1 = input.nextInt();
        System.out.printf("Sayinin ussunu girin:");
        n2 = input.nextInt();

        for (int i = 0; i < n2; i++) {
            result *= n1;
        }
        System.out.printf("Sonuc:"+result);

    }
}
