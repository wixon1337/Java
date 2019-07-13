public class Main {
    public static void main(String[] args) {
        int[][] array2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] array3 = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        int[][] empty = {};
        int[][] empty2 = {{}};
        System.out.println(empty2.length);
        int[] tomb = snail(empty2);
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
    }

    public static int[] snail(int[][] array) {
        if (array.length == 1 && array[0].length == 0) {
            int[] empty1d = {};
            return empty1d;
        }
        int[] returnArray = new int[array.length*array.length];
        int index = 0;
        int startingRowIndex = 0;
        int endingRowIndex = array[0].length-1;
        int startingColumnIndex = 0;
        int endingColumnIndex = array.length-1;

        while (startingRowIndex<=endingRowIndex && startingColumnIndex<=endingColumnIndex) {
            for (int i = startingColumnIndex; i <= endingColumnIndex; i++) {
                returnArray[index] = array[startingRowIndex][i];
                index++;
            }
            startingRowIndex++;

            for (int i = startingRowIndex; i <= endingRowIndex; i++) {
                returnArray[index] = array[i][endingColumnIndex];
                index++;
            }
            endingColumnIndex--;

            for (int i = endingColumnIndex; i >= startingColumnIndex; i--) {
                returnArray[index] = array[endingRowIndex][i];
                index++;
            }
            endingRowIndex--;

            for (int i = endingRowIndex; i >= startingRowIndex; i--) {
                returnArray[index] = array[i][startingColumnIndex];
                index++;
            }
            startingColumnIndex++;
        }

        return returnArray;
    }
}

