import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        boolean control =false;
        int n1,result=0;

        while (!control){
            System.out.printf("Bir sayi giriniz:");
            n1=input.nextInt();
            if(n1%2==0&&n1%4==0){
                result+=n1;
            }
           else if(n1%2==1){
               control=true;
            }
        }
        System.out.printf("Girelen degerlerin toplami:"+result);

    }
}
