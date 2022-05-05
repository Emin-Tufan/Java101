import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, control=0,result=0;

        System.out.printf("Bir sayi girin:");
        n1 = input.nextInt();

        for (int i = 1; i < n1; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                result+=i;
               control++;
            }
        }
        System.out.printf("3'e ve 4'de tam bolunen sayilarin ortalamasi:"+(result/control));

    }
}
