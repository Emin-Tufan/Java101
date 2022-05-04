import java.util.Scanner;
public class Zodyak {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int year;

        System.out.printf("Lutfen dogum yilinizi girin:");
        year=input.nextInt();
        if(year%12==0)
            System.out.printf("Burcunuz:MAYMUN");
        else if (year%12==1)
            System.out.printf("Burcunuz:HOROZ");
        else if (year%12==2)
            System.out.printf("Burcunuz:KOPEK");
        else if (year%12==3)
            System.out.printf("Burcunuz:DOMUZ");
        else if (year%12==4)
            System.out.printf("Burcunuz:FARE");
        else if (year%12==5)
            System.out.printf("Burcunuz:OKUZ");
        else if (year%12==6)
            System.out.printf("Burcunuz:KAPLAN");
        else if (year%12==7)
            System.out.printf("Burcunuz:TAVSAN");
        else if (year%12==8)
            System.out.printf("Burcunuz:EJDERHA");
        else if (year%12==9)
            System.out.printf("Burcunuz:YILAN");
        else if (year%12==10)
            System.out.printf("Burcunuz:AT");
        else if (year%12==11)
            System.out.printf("Burcunuz:KOYUN");


    }
}
