import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Transpoz {
    public static void main(String[] args) {

        int[][] Array = new int[2][3];
        int[][] newArray = new int[3][2];
        int sayi = 1;

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = (sayi);
                sayi++;
            }
        }
        for(int i=0;i<newArray[i].length;i++){
            for(int j=0;j<newArray.length;j++){
                newArray[j][i]=Array[i][j];
            }
        }
        for(int item[]:Array){
            for(int col:item){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("TRANZSPOZU");

        for(int item[]:newArray){
            for(int col:item){
                System.out.print(col);
            }
            System.out.println();
        }


        //   2    3    4  00 01 02 00 10 20
        //  5    6    4
        // Transpoze :
        //  2    5
        //  3    6
        // 4    4

    }
}
