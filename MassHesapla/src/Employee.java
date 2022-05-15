public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi = 0;
    int bonus = 0;
    int maasArtisi = 0;
    double vergilerBonus = 0;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    int tax() {
        double temp = this.salary;
        if (this.workHours > 40) {
            this.salary += (this.workHours - 40) * 30;
            this.bonus += this.salary - temp;

        }
        if (temp > 1000) {
            this.vergi += temp * 0.03;
            this.salary =  temp * 0.97;
        }
        this.vergilerBonus = this.salary+this.bonus;
        return (int) this.salary;
    }

    int raiseSalary() {
        double temp = this.salary;
        int year = 2021;

        if (year - this.hireYear < 10) {
            this.salary += this.salary * 0.05;

        } else if (year - this.hireYear > 9 && year - this.hireYear <= 20) {
            this.salary += this.salary * 0.10;

        } else if (year - this.hireYear > 19) {
            this.salary += this.salary * 0.15;

        } else {
            System.out.printf("Lutfen gecerli tarih girin...");

        }
        this.maasArtisi += this.salary - temp;
        return (int) this.salary;
    }

    void toPrint() {
        System.out.println("Adi:" + this.name);
        System.out.println("Massi:" + this.salary);
        System.out.println("Calisma saati:" + this.workHours);
        System.out.println("Ise baslama yili:" + this.hireYear);
        System.out.println("Vergi:" + this.vergi);
        System.out.println("Bonus:" + this.bonus);
        System.out.println("Maas Artisi:" + this.maasArtisi);
        System.out.println("Vergi ve Bonuslar ile toplam maas:" + this.vergilerBonus);
        System.out.println("Toplam maas:" + this.salary);


    }


}
