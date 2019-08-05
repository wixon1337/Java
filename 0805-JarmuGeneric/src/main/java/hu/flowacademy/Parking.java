package hu.flowacademy;


import java.util.HashMap;

public class Parking<T> {
    private T[] array;
    private int pointer;

    public Parking(int length) {
        this.array = (T[]) new Object[length];
        this.pointer = 0;
    }

    public void addSomething(T element) throws OverFlowException {
        if (array.length == pointer) throw new OverFlowException("Tele van a parkoló!");
        this.array[pointer++] = element;
    }

    public void getAll() {
        HashMap<String, Integer> storage = new HashMap<>();
        for (int i = 0; i < pointer; i++) {

            storage.put(array[i].getClass().getName(), 1);
            System.out.println(storage.get(array[i].getClass().getName()) + 1);

        }
        System.out.println(storage);
    }
}
