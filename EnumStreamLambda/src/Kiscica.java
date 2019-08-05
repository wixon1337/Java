import java.util.Objects;

public class Kiscica {
    private  String name;
    private int age;

    public Kiscica(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kiscica kiscica = (Kiscica) o;
        return getAge() == kiscica.getAge() &&
                Objects.equals(getName(), kiscica.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
