package hu.flowacademy;

public class Verem<E> {
    private int pointer;
    private E[] array;


    public Verem(int length) {
        this.pointer = 0;
        this.array = (E[]) new Object[length];
    }

    public void push(E value) throws OverFlowException {
        if (this.pointer == this.array.length) {
            throw new OverFlowException("Tele van a verem bástya");
        }
        this.array[this.pointer++] = value;
    }

    public E pop() throws UnderFLowException {
        if (this.pointer == 0) throw new UnderFLowException("Üres a verem bástya.");
        return this.array[--this.pointer];

    }

    public E peek() throws UnderFLowException {
        if (this.pointer == 0) throw new UnderFLowException("Üres a verem bástya.");
        return this.array[this.pointer - 1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Verem: [ ");
        for (int i = 0; i < pointer; i++) {
            sb.append(array[i]);
            sb.append(' ');
        }
        sb.append(']');
        return sb.toString();
    }
}
