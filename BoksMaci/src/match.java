public class match {
    Fighter f1;
    Fighter f2;
    int minweight;
    int maxweight;

    match(Fighter f1, Fighter f2, int minweight, int maxweight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxweight = maxweight;
        this.minweight = minweight;
    }


    void run() {
        if (isCheck()) {
            while (this.f1.health >= 0 && this.f2.health >= 0 && isCheck()) {

                if (this.f1.health - this.f2.damage < 0 || this.f2.health - this.f1.damage < 0) {
                    if (this.f1.health <= 0) {
                        System.out.printf("Kazanan:" + f2.name + "\n");
                        break;
                    } else {
                        System.out.println("Kazanan:" + f1.name);
                        break;
                    }
                }
                if(f1.isFirst()){
                    this.f2.health -= this.f1.damage;
                    f1.hit(f2);
                    this.f1.health -= this.f2.damage;
                    f2.hit(f1);
                }
                else{

                    this.f1.health -= this.f2.damage;
                    f2.hit(f1);
                    this.f2.health -= this.f1.damage;
                    f1.hit(f2);
                }



            }

        } else {
            System.out.printf("Sporcularin sikletleri uymuyor..");
        }
    }


    boolean isCheck() {
        return (this.f1.weight >= minweight && this.f1.weight <= maxweight && (this.f2.weight >= minweight && this.f2.weight <= maxweight));

    }

}
