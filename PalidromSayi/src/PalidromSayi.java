import java.util.Scanner;

public class PalidromSayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number;
        System.out.printf("Bir sayi giriniz:");
        number=input.nextInt();

        if (isPalindrom(number)) {
            System.out.println("Girdiginiz sayi palidrom sayidir.");
        } else {
            System.out.println("Girdiginiz sayi palidrom sayi degildir");
        }
    }
    static boolean isPalindrom ( int number){
        int lastNumber, reverseNumber = 0, tempNumber;
        tempNumber = number;
        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber /= 10;

        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }
}
