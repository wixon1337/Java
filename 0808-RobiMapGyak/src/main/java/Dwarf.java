import java.util.Objects;
import java.util.Random;

public class Dwarf implements Comparable<Dwarf> {
    private String name;

    private int age;

    private int tall;

    private boolean hasAxe;

    public Dwarf(String name) {
        this(name, new Random().nextInt(99), new Random().nextInt(99), new Random().nextBoolean());
    }

    public Dwarf(String name, int age, int tall, boolean hasAxe) {
        this.name = name;
        this.age = age;
        this.tall = tall;
        this.hasAxe = hasAxe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public boolean isHasAxe() {
        return hasAxe;
    }

    public void setHasAxe(boolean hasAxe) {
        this.hasAxe = hasAxe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dwarf dwarf = (Dwarf) o;
        return getAge() == dwarf.getAge() &&
                getTall() == dwarf.getTall() &&
                isHasAxe() == dwarf.isHasAxe() &&
                Objects.equals(getName(), dwarf.getName());
    }

    @Override
    public int hashCode() {
        return 1;
        // return Objects.hash(getName(), getAge(), getTall(), isHasAxe());
    }

    @Override
    public int compareTo(Dwarf o) {
        if (o == null) {
            return 1;
        }
        if (o.getTall() > this.tall) {
            return -1;
        } else if (o.getTall() == this.tall) {
            return 0;
        } else {
            return 1;
        }
    }
}
