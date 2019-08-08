package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
        int[] A = {2,3,1,1,4};
        int[] B = {3,2,1,0,4};
        int[] C = {1,2,0,3,1};
        System.out.println(ugroTest(A));
        System.out.println(ugroTest(B));
        System.out.println(ugroTest(C));
    }


    public static boolean ugroTest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return false;
            } else {
                try {
                    i += array[i]-1;
                } catch (ArrayIndexOutOfBoundsException e){
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean ugroTest2(int[] array) {
/*        for (int i = array.length-1; i >= 0; i--) {

        }*/
        boolean reachable = false;
        if (array[array.length-1] == 0) {
            return false;
        } else {
            for (int i = array.length-2; i >= 0; i--) {
                if (reachable) {
                    return true;
                }
                if (array[i] + i >= array.length-1 ) {
                    reachable = true;
                }
            }
        }
        return true;
    }
}

/*

0 1 2 3 4 5
5 4 3 2 1 0


*/
