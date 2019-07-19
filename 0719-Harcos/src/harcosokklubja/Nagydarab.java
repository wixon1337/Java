package harcosokklubja;

public class Nagydarab extends Harcos {
    private int stamina;

    public Nagydarab(int hp, int dmg, int stamina) {
        super(hp, dmg);
        this.stamina = stamina;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public int getHp() {
        return super.getHp() + this.stamina;
    }

    @Override
    public String toString() {
        return "Nagydarab " + super.toString() + "Állóképességem: " + this.stamina + ".";
    }
}
