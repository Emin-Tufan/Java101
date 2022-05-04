import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int year;

        System.out.printf("Lutfen yil girin:");
        year=input.nextInt();

        if(year%100==0&&year%400==0)
            System.out.printf(year+" Bir Artik Yildir..");

        else if (year%4==0)
            System.out.printf(year+" Bir Artik Yildir..");

        else
            System.out.printf(year+" Bir Artik Yil Degildir..");

    }
}
