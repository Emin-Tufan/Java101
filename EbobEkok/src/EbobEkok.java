import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1, n2, ebob=0,ekok;
        Scanner input = new Scanner(System.in);

        System.out.printf("1.Sayiyi girin:");
        n1 = input.nextInt();
        System.out.printf("2.Sayiyi girin:");
        n2 = input.nextInt();

        int i = 0;
        while (i < n1 && i < n2) {
            ++i;
            ebob  = (n1 % i == 0 && n2 % i == 0) ? (ebob = i) : (ebob = ebob);

        }
        ekok=(n1*n2)/ebob;
        System.out  .printf("Ebob:"+ebob+"\n");
        System.out.printf("Ekok:"+ekok);
    }
}
