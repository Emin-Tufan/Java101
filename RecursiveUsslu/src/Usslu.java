import java.util.Scanner;

public class Usslu {

    static int Usslu(int a, int b) {
        if (b > 1)
            return a = a * Usslu(a, b - 1);
        return a;
    }

    public static void main(String[] args) {

        int n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.printf("Sayiyi girin:");
        n1 = input.nextInt();

        System.out.printf("Usunu girin:");
        n2 = input.nextInt();

        System.out.printf("Sonuc:" + Usslu(n1, n2));


    }
}
