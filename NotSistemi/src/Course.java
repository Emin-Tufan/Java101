public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double quiz;


    Course(String name,String code,String prefix) {
        this.name =name;
        this.code=code;
        this.prefix=prefix;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }
        else
            System.out.printf("Ogretmen ve ders bolumleri uyusmuyor...");

    }
    void printTeacherInfo(){
        this.teacher.print();
    }





}
