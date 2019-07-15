package Main;

import java.util.Objects;

public abstract class Animal { // Osztály
    private String name;
    private int age;
    private boolean isMammal; // private      - csak osztály

    // ""           - osztályban és csomagban
    // protected    - osztály, csomag, leszármazott
    // public       - más csomagban is

    public Animal() { // Default konstruktor
        this.name = "";
        this.age = 0;
        this.isMammal = false;
    }

    public Animal(String name, int age, boolean isMammal) {  // Konstruktor
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Animal(String name) {  // function overloading = eltérő paraméter lista, ugyanaz a név
        this.name = name;
        this.age = 0;
        this.isMammal = true;
    }

    public abstract void sound();   // Absztrakt függvény: nem implementáljuk itt, hanem a leszármazottban

    public String sayHello() {
        return ("Szia, " + name + " vagyok. " + age + " éves vagyok. " + (isMammal ? "Emlős vagyok." : "Nem emlős vagyok."));
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", emlős: " + isMammal;
    }

    public String getName() {  // Getter fggvény, visszaadja az adattag értékét
        return name;
    }

    public void setName(String name) { // Setter függvény: beállitja az adattag értékét
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age && age < 30) {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {  // nem kell a this ha nem takarja a paraméter
        isMammal = mammal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                isMammal == animal.isMammal &&
                getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), isMammal);
    }
}
