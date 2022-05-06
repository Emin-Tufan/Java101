import java.util.Scanner;
public class Toplam {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n,result=0,control=0;

        System.out.printf("Bir sayi girin:");
        n=input.nextInt();
        int temp=n;

    while(temp!=0){
        temp/=10;
        control++;
        }
        for(int j=1;j<=control;j++){

            result+=n%10;
            n/=10;


        }
        System.out.printf("Girilen sayinin basamak degerleri toplami:"+result);
    }
}
