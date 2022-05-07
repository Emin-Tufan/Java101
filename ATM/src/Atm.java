import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select, balance = 1500, price, right = 3;
        String username, password;


        while (right >= 3) {

            System.out.printf("Kullanici adinizi girin:");
            username = input.nextLine();
            System.out.printf("Parolayi girin:");
            password = input.nextLine();


            if (username.equals("Patika") && password.equals("dev123")) {

                do {
                    System.out.printf("Patika bankasina hosgeldiniz..\n");


                    System.out.printf("1.Para cekme.\n" + "2.Para yatirma.\n" + "3.Bakiye ogren.\n" + "4.Cikis yap.\n" + "---------\n" + "Yukaridan bir silem secin:");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.printf("Cekilecek miktar:");
                            price = input.nextInt();
                            balance -= price;
                            break;
                        case 2:
                            System.out.printf("Yatirilacak miktar:");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 3:
                            System.out.printf("Mevcut bakiyeniz:" + balance + "\n");
                            break;
                        case 4:
                            System.out.printf("Tekrar gorusmek uzere...\n");
                            break;
                        default:
                            System.out.println("Gecersiz bir secim yaptiniz lutfen tekrar deneyiniz.");
                            break;

                    }
                }
                while (select != 4);
                break;
            }
                else if (right != 0) {
                    --right;
                    System.out.printf("Kullanici adi veya parola yanlis..\n" + "Kalan dogru giris hakkiniz:" + right + "\n");
                } else {
                    System.out.printf("Hesabiniz bloke oldu en yakin subemize gidin lutfen..\n");
                    break;
                }
            }


        }

}
