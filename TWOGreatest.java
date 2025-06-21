import java.util.*;

class Exercise {
    public static int[] findTopTwoScores(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (array[i] > second && array[i] == first) {
                second = array[i];
            }
        }

        return new int[] { first, second };
    }
}

class MAIN {
    public static void main(String[] args) {
        Exercise obj1 = new Exercise();

        int[] input = { 90, 90, 87, 86, 86, 89 };
        int[] result = obj1.findTopTwoScores(input);

        System.out.println("Top two scores: " + Arrays.toString(result));
    }
}
