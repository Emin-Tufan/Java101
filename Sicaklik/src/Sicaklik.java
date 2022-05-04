import java.util.Scanner;
public class Sicaklik {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int heat;

        System.out.printf("Sicaklik degerini girin:");
        heat= input.nextInt();

        if(heat<=5)
            System.out.printf("Kayak yapabilirsiniz..");

        else if (heat<=15)
            System.out.printf("Sinemaya gidebilirsiniz..");

        else if (heat<=25)
            System.out.printf("Pinkige gidebilirsiniz..");
        else {
            System.out.printf("Yuzmeye gidebilirsiniz..");
        }



    }
}
