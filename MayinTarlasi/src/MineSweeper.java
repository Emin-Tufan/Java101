import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class MineSweeper {
    int n1;
    int n2;

    MineSweeper(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        String bomb[][] = new String[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                bomb[i][j] = "- ";
            }
        }

        int bomba = (n1 * n2) / 4;
        int sınır = n1 * n2;
        for (int i = 0; i < bomba; ) {
            int random = (int) (Math.random() * n1);
            int random1 = (int) (Math.random() * n2);

            if (bomb[random][random1] == "- ") {
                bomb[random][random1] = "* ";
            } else {
                continue;
            }
            i++;
        }

        System.out.println("==================");

        Scanner input = new Scanner(System.in);
        String kordinat[][] = new String[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                kordinat[i][j] = "- ";
            }
        }
        for(String item[]:kordinat){
            for(String col:item){
                System.out.print(col);
            }
            System.out.println();
        }


        boolean isBomb = false;
        int satir, sutun;

        sınır -= bomba;
        for(String item []:bomb){
            for(String col:item)
                System.out.print(col);
            System.out.println();
        }

        while (!isBomb) {

            System.out.print("Satir girin:");
            satir = input.nextInt();

            System.out.printf("Sutun girin:");
            sutun = input.nextInt();
            if (satir < 0 || satir >= n1 || sutun < 0 || sutun >= n2) {
                System.out.println("LUTFEN GECERLI KORDINAT GIRIN!!");
            } else {
                if (bomb[satir][sutun].equals("* ")) {
                    kordinat[satir][sutun] = "* ";

                    isBomb = true;
                    for (String[] item : kordinat) {
                        for (String col : item) {
                            System.out.print(col);
                        }
                        System.out.println();
                    }
                    System.out.println("MAYINA BASTINIZ!!\n OYUN BITTI");
                    System.out.println("===============");
                    for (String[] item : bomb) {
                        for (String col : item) {
                            System.out.print(col);
                        }
                        System.out.println();
                    }

                } else {
                    int sayac = 0;

                    if (satir == n1 - 1) {

                        for (int i = satir - 1; i <= satir; i++) {

                            if (sutun == 0) {
                                for (int j = sutun; j <= sutun + 1; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;

                                }
                            } else if (sutun == n2 - 1) {
                                for (int j = sutun - 1; j <= sutun; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;

                                }

                            } else {
                                for (int j = sutun - 1; j <= sutun + 1; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;

                                }
                            }
                        }
                    }
                    else if(satir==0){
                        for (int i = satir ; i <= satir+1; i++) {

                            if (sutun == 0) {
                                for (int j = sutun; j <= sutun + 1; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;
                                }
                            } else if (sutun == n2 - 1) {
                                for (int j = sutun - 1; j <= sutun; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;
                                }

                            } else {
                                for (int j = sutun - 1; j <= sutun + 1; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;
                                }
                            }
                        }
                    }
                    else {
                        for (int i = satir-1; i <= satir + 1; i++) {

                            if (sutun == 0) {
                                for (int j = sutun; j <= sutun + 1; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;
                                }
                            } else if (sutun == n2 - 1) {
                                for (int j = sutun - 1; j <= sutun; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;
                                }

                            } else {
                                for (int j = sutun - 1; j <= sutun + 1; j++) {
                                    if (bomb[i][j].equals("* "))
                                        ++sayac;
                                }
                            }
                        }

                    }
                    kordinat[satir][sutun] = String.valueOf(sayac + " ");
                    for (String[] item : kordinat) {
                        for (String col : item) {
                            System.out.print(col);
                        }
                        System.out.println();
                    }

                }
                sınır--;
                if (sınır == 0) {
                    System.out.println("Tebrikler Kazandiniz..");
                    isBomb = true;

                    for (String[] item : bomb) {
                        for (String col : item) {
                            System.out.print(col);
                        }
                        System.out.println();
                    }
                }
            }

        }


    }

}
