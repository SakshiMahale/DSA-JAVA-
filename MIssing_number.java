public class Exercise {

    // Original method with two parameters
    static int findMissingNumberInArray(int[] arr, int n) {
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        int diff = sum1 - sum2;
        System.out.println("Missing number: " + diff); // Optional print
        return diff;
    }

    // Overloaded method for test compatibility
    static int findMissingNumberInArray(int[] arr) {
        int n = arr.length + 1; // Total numbers including the missing one
        return findMissingNumberInArray(arr, n);
    }
}

class MAIN {
    public static void main(String[] args) {
        Exercise obj1 = new Exercise();
        int[] array = {1, 2, 4};
        int missing = obj1.findMissingNumberInArray(array); // Test-compatible call
        System.out.println("Returned missing number: " + missing);
    }
}
