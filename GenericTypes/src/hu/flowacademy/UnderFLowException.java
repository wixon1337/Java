package hu.flowacademy;

public class UnderFLowException extends RuntimeException { // ha runtimeexceptiont használunk akkor nem kell feltétlenül lekezelni hiváskor
    public UnderFLowException(String s) {
        super(s);
    }
}
