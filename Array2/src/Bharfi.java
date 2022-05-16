public class Bharfi {
    public static void main(String[] args) {

        String[][] dizi = new String[13][7];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (i == 0 || j == 0 || i == 12 || i == 6 || j == 6) {
                    dizi[i][j] = "*";
                } else {
                    dizi[i][j] = " ";
                }

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

