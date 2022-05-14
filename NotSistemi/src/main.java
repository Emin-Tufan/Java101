import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut", 1234, "TRH");
        Teacher t2 = new Teacher("Graham Bell", 434, "FZK");
        Teacher t3 = new Teacher("Kul Yutmaz", 123, "BIO");

        Course tarih = new Course("Tarih", "2312", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "543", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoleji", "234", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Inek Saban", 435, "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,70, 95,65, 85,34);
        s1.printNote();
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", 444, "4", tarih, fizik, biyo);
        s2.addBulkExamNote(70,85, 30,90, 50,80);
        s2.printNote();
        s2.isPass();


    }
}
