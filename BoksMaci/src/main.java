import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Fighter f1=new Fighter("Emin",10,120,70,20,50);
        Fighter f2=new Fighter("Sena",10,120,70,20,50);
        match run=new match(f1,f2,0,150);

        run.run();




    }
}
