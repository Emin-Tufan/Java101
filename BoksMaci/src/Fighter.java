public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int isFirst;


    Fighter(String name, int damage, int health, int weight, int dodge, int isFirst) {
        this.isFirst = isFirst;
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.weight = weight;
        this.dodge = dodge;

    }

    void hit(Fighter foe) {
        System.out.printf(this.name + "=>" + foe.name + " " + this.damage + " hasar vurdu..\n");
        if (isDodge()) {
            System.out.printf(foe.name + " Saldiriyi block'ladi..");
            foe.health += this.damage;
            System.out.printf(foe.name + " Kalan can:" + foe.health + "\n");
        } else {
            System.out.printf(foe.name + " Kalan can:" + foe.health + "\n");
        }

    }

    boolean isDodge() {
        double randomNumer = Math.random() * 100;
        return randomNumer <= this.dodge;

    }

    boolean isFirst() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.isFirst;
    }

}
