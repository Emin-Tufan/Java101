import java.util.Scanner;

public class KullaniciGiris {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName = "Patika", password = "Patika123";

        System.out.printf("Kullanici adini girin:");
        userName = input.nextLine();
        System.out.printf("Parolayi girin: ");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("Patika123"))
            System.out.printf("Giris basarili..");

        else if (!userName.equals("Patika") && password.equals("Patika123")) {

            System.out.println("Kullanıcı adını yanlış girdiniz");
        }

        else if (userName.equals("Patika") && !password.equals("Patika123")) {

            System.out.println("Sifreniz yanlis !");
            System.out.print("Sifrenizi sifirlamak ister misiniz ?\n1=Evet.\n2=Hayir.\n ");
            int resetpassword ;

            System.out.printf("Secim:");
            resetpassword = input.nextInt();

            switch (resetpassword) {
                case 1 :
                    System.out.print("Yeni Sifreniz : " + input.nextLine());
                    String newPassword = input.nextLine();
                    if (newPassword.equals ("Patika123")) {
                        System.out.println("Yeni sifre , eski sifreyle ayni olamaz.");
                        break;
                    }else {
                        System.out.println("Sifreniz basarıyla degistirildi.");
                        break;
                    }
                case 2 :
                    System.out.println("Sifre sifirlanmadi.");
                    break;
            }
        }





    }
}