import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
     /*
                    //HİPOTENÜS BULMA
        int a, b;
        double c;

        System.out.printf("A'Kenarini girin:");
        a =input.nextInt();
        System.out.printf("B'Kenarini girini:");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.printf("Hipotenus:"+c);
      */
                    //ALAN BULMA
        double triangleArea,trianglePerimeter,first,second,third,u;

        System.out.print("Birinci kenari girin: ");
        first=input.nextDouble();
        System.out.print("iknci kenari girin: ");
        second=input.nextDouble();
        System.out.print("Ucuncu kenari girin : ");
        third=input.nextDouble();

        trianglePerimeter=first+second+third;
        u=trianglePerimeter/2;
        triangleArea=Math.sqrt(u*(u-first)*(u-second)*(u-third));

        System.out.println("Ucgenin alani : "+triangleArea );




    }
}
