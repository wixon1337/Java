package Main;

public class Animal { // Osztály
    public String name;
    public int age;
    protected boolean isMammal; // private      - csak osztály

    // ""           - osztályban és csomagban
    // protected    - osztály, csomag, leszármazott
    // public       - más csomagban is
    public Animal(String name, int age, boolean isMammal) {  // Konstruktor
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void sayHello() {
        System.out.println("Szia, " + name + " vagyok. " + age + " éves vagyok. " + (isMammal ? "Emlős vagyok." : "Nem emlős vagyok."));
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", emlős: " + isMammal;
    }
}
