package hu.flowacademy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        HideValue<String> val1 = new HideValue<>("Cica");
        System.out.println(val1);
        HideValue<Integer> val2 = new HideValue<>(200);
        System.out.println(val2);
        Verem<String> veremString = new Verem<>(2);
        try {
            veremString.push("asdasd");
            veremString.push("asd");
        } catch (OverFlowException e) {
            System.out.println(e);
        }

        try {
            veremString.push("asd");
        } catch (OverFlowException e) {
            System.out.println(e);
        }
        System.out.println(veremString);


        try {
            veremString.pop();
            veremString.pop();
        } catch (UnderFLowException e) {
            System.out.println(e);
        }

        try {
            veremString.pop();
        } catch (UnderFLowException e) {
            System.out.println(e);
        }
        System.out.println(veremString);
        veremString.push("asdasd");
        System.out.println("---------------------------------------------");

        System.out.println(veremString);
        System.out.println(veremString.peek());
        veremString.pop();
        System.out.println(veremString.peek());

    }
}
