package hu.flowacademy;

public class Car implements Comparable<Car>{
    private int horsepower;
    private int ccm;

    public int getHorsepower() {
        return horsepower;
    }

    public int getCcm() {
        return ccm;
    }

    public Car(int horsepower, int ccm) {
        this.horsepower = horsepower;
        this.ccm = ccm;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", ccm=" + ccm +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if ((this.horsepower*this.ccm) > (o.horsepower*o.ccm)){
            return 1;
        } else if ((this.horsepower*this.ccm) < (o.horsepower*o.ccm)) {
            return -1;
        }
        return 0;
    }
}
