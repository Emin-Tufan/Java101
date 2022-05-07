public class Asal {
    public static void main(String[] args) {

        System.out.printf("1 ile 100 arasindaki Asal sayilar:");

        for (int i = 2; i < 101; i++) {
            int control = 1;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    control=0;
                    break;
                }
            }
            if (control ==1) {
                System.out.print(" " + i);
            }
        }


    }
}
