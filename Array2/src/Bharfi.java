public class Bharfi {
    public static void main(String[] args) {

        String[][] dizi = new String[7][4];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (i == 0 || j == 0 || i == 3 || i == 6 || j == 3) {
                    dizi[i][j] = "*";
                } else {
                    dizi[i][j] = " ";
                }
                dizi[0][3] = " ";
                dizi[3][3] = " ";
                dizi[6][3] = " ";


                System.out.println();
            }

        }
        for (String[] row : dizi) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


}

