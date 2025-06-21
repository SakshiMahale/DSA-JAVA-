import java.util.Arrays;

public class Exercise {
    public int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // no middle elements
        }

        // Create a new array with size 1 less from each side
        int[] result = new int[array.length - 2];
        for (int i = 1; i < array.length - 1; i++) {
            result[i - 1] = array[i];
        }

        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Exercise obj1 = new Exercise();

        int[] input = {1, 2, 3, 4, 5};
        int[] result = obj1.middle(input);

        System.out.println("Middle elements: " + Arrays.toString(result));
    }
}
