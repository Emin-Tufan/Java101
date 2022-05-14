public class Teacher {
String name;
int mpno;
String branch;
     Teacher(String name,int mpno,String branch){
          this.name=name;
          this.mpno=mpno;
          this.branch=branch;
     };
     void print(){
          System.out.println("Adi:"+this.name);
          System.out.println("Telefonu:"+this.mpno);
          System.out.println("Alani:"+this.branch);
     }
}
