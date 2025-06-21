import java.util.*;

class MAIN1 {
    int[] Myarray = new int[7]; // Move array to class level to be accessible in constructor

    // Constructor
    MAIN1(int value) {
        // Initialize some default values (optional)
        Myarray[0] = 10;
        Myarray[1] = 20;
        Myarray[2] = 30;
        Myarray[3] = 40;
        Myarray[4] = 50;
        Myarray[5] = 60;

        System.out.println("SEARCHING:");

        // Search logic
        boolean found = false;
        for (int i = 0; i < Myarray.length; i++) {
            if (value == Myarray[i]) {
                System.out.print("Value found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.print("Value not found in the array.");
        }
    }

    public void abd() {
        System.out.println("HELLO WORLD");

        System.out.println("TRAVERSING:");

        // Traversing through the array
        System.out.print("Array contents:");
        System.out.print(Arrays.toString(Myarray));

        System.out.println("AFTER DELETE:");

        // Deleting an element (marking it as deleted)
        Myarray[0] = Integer.MIN_VALUE;
        System.out.print("Deleted index 0 value: " + Myarray[0]);

        System.out.println("ACCESSING");

        // Accessing an element
        int hie = Myarray[2];
        System.out.print("Accessed element at index 2: " + hie);

        System.out.println("2D arrays:");

        // Creating 2D Array
        String[][] ARRAY = new String[2][2];
        ARRAY[0][0] = "SAKSHI";
        ARRAY[0][1] = "CHITRU";
        ARRAY[1][0] = "AJJU";
        for (int i = 0; i < ARRAY.length; i++) {
            System.out.println(Arrays.toString(ARRAY[i]));
        }

    }
}

class arr {
    public static void main(String[] args) {
        MAIN1 obj = new MAIN1(20); // Correct object creation with constructor
        obj.abd(); // Method call using object
    }
}
