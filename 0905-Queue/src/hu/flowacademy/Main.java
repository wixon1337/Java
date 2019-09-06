package hu.flowacademy;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) throws Exception{
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(3);
        q.add(4);
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        q.poll();
        for (Integer i: q) {
            System.out.println(i);
        }
        q.remove();
        for (Integer i: q) {
            System.out.println(i);
        }
        q.add(15);
        System.out.println("ELső a sorban: " + q.element());
        System.out.println("Ugyanez peekel: " + q.peek());

        System.out.println("-----------------------------------------------------");

        Deque<String> dq = new LinkedList<>();
        dq.add("kecske");
        dq.add("nagyonkecske");
        dq.add("ezmárhiéna");
        for (String s: dq) {
            System.out.println(s);
        }
        System.out.println("Ez az első elem: " + dq.getFirst());
        System.out.println("Ez az utolsó elem: " + dq.getLast());
        Iterator<String> dqIt = dq.descendingIterator(); // deque-ban visszafele is belehet járni a sort
        while (dqIt.hasNext()) {
            System.out.println(dqIt.next());
        }

        System.out.println("Elsőt kivesszük: " + dq.pollFirst()); // ki lehet venni az elsőt és az utolsót is
        for (String s: dq) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------------");

        XMLDOMtry.xmlLoaderDom();

        System.out.println("-----------------------------------------------------");

        XMLSAXtry.xmlLoaderSax();

        System.out.println("-----------------------------------------------------");

        var gson = new GsonBuilder().setPrettyPrinting().create();
       // var json = gson.toJson()
    }
}
