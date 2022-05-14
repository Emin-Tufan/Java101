public class Student {


    Course c1;
    Course c2;
    Course c3;
    Course q1;
    Course q2;
    Course q3;

    String name;
    int stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, int stuNo, String classes, Course c1, Course c2, Course c3) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int quiz1, int note2, int quiz2, int note3, int quiz3) {

        if (quiz1 >= 0 && quiz1 <= 100) {

            this.c1.quiz = quiz1 * 0.20;
        }
        if (quiz3 >= 0 && quiz2 <= 100) {

            this.c2.quiz = quiz2 * 0.20;
        }
        if (quiz3 >= 0 && quiz3 <= 100) {

            this.c3.quiz = quiz3 * 0.20;
        }
        if (note1 >= 0 && note1 <= 100) {

            this.c1.note = (note1 * 0.80) + this.c1.quiz;
        }
        if (note2 >= 0 && note2 <= 100) {

            this.c2.note = (note2 * 0.80) + this.c2.quiz;
        }
        if (note3 >= 0 && note3 <= 100) {

            this.c3.note = (note3 * 0.80) + this.c3.quiz;
        }

    }

    void printNote() {
        System.out.println("Ad :" + this.name + "\nSinifi :" + this.classes + "\n" + "Numarasi: " + this.stuNo);
        System.out.println("**************");
        System.out.println(this.c1.name + " Notu :" + this.c1.note);
        System.out.println(this.c2.name + " Notu :" + this.c2.note);
        System.out.println(this.c3.name + " Notu :" + this.c3.note + "\n");
    }

    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;

        if (avarage >= 55 && avarage <= 100)
            System.out.printf("GECTINIZ..\nOrtalamaniz:" + this.avarage + "\n");
        else
            System.out.printf("KALDINIZ..\n Ortalamaniz:" + this.avarage + "\n");
    }
}
