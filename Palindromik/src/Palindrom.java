import java.util.Scanner;
import java.util.Arrays;

public class Palindrom {

    static void palidrom(String word) {
        boolean isPalidrom=false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {

                System.out.println("Girilen metin Palidrom degildir..");
                break;
            }
            else {
                isPalidrom=true;
                break;
            }
        }
        if(isPalidrom){
            System.out.println("Girilen metin Palidromdur...");

        }
    }

    public static void main(String[] args) {
        String word;
        Scanner input=new Scanner(System.in);

        System.out.printf("Bir kelime girin:");
        word=input.nextLine();

        palidrom(word);


    }
}
