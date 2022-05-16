import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        int[] list={15,6,7,12,7,9,3};
        double result=0;

        for(double i=1;i<= list.length;i++){

            result+=(1/i);
        }
        System.out.printf("Harmonik ortalama:"+result);








    }
}
