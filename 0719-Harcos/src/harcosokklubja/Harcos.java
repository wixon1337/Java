package harcosokklubja;

public class Harcos {
    private int damage;
    private int hp;

    public Harcos(int damage, int hp) {
        this.damage = damage;
        this.hp = hp;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Harcos vagyok, ütőerőm: " + this.damage + ", egészségem: " + this.getHp() + ".";
    }

    public void hit(Harcos masikHarcos) {
        System.out.println(this + " megütötte:\n=> " + masikHarcos);
        masikHarcos.setHp(masikHarcos.getHp()-this.damage);
        System.out.println("-" + this.damage);
    }

}
