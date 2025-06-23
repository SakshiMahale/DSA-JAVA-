import java.util.Arrays;

public class Exercise {
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) return new int[0];

        // Temporary array to store unique elements
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i]; // add to result if not duplicate
            }
        }

        // Always add the last element
        temp[j++] = arr[arr.length - 1];

        // Copy only the filled portion
        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5, 5, 6, 7, 7};
        int[] result = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
