import javax.crypto.spec.PSource;
import java.util.Scanner;
public class MukSayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n1,toplam=0;
        System.out.printf("Sayiyi girin:");
        n1=input.nextInt();

        for(int i=1;i<n1;i++){
            if(n1%i==0){
                toplam+=i;
            }

        }
       if(toplam==n1){
           System.out.printf(n1+" Mukemmel sayidir..");
       }
       else {
           System.out.printf(n1+" Mukemmel sayi degildir..");
       }

    }
}
