public class Exercise {
    public String maxProduct(int[] intArray) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max1) {
                max2 = max1;
                max1 = intArray[i];
            } else if (intArray[i] > max2) {
                max2 = intArray[i];
            }
        }

        return max1 + "," + max2; // ✅ COMMA between the two max values
    }
}

class main1 {
    public static void main(String[] args) {
        Exercise obj = new Exercise();
        int[] myarray = {10, 20, 30, 40, 50, 60};
        String result = obj.maxProduct(myarray);
        System.out.println(result);  // Output: 60,50
    }
}
