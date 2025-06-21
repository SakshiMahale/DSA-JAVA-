import java.util.*;

class TEMP {

    float[] Temp = new float[5];
    float avg = 0;
    int count = 0;
    float sum = 0;

    TEMP() {

        Temp[0] = 1.5f;
        Temp[1] = 2.5f;
        Temp[2] = 1.0f;
        Temp[3] = 3.5f;
        Temp[4] = 2.0f;
    }

    public void takeTemp() {
        for (int i = 0; i < Temp.length; i++) {
            System.out.println("Enter the first hight Temperature:" + i + " " + Temp[i]);
        }
    }

    public void AvgTemp() {

        for (int i = 0; i < Temp.length; i++) {
            sum = Temp[i] + sum;
            count++;
        }
        avg = sum / Temp.length;
        System.out.println("The Average is:" + avg);
    }

    public void HigherTemp() {
        int count1 = 0;
        for (int i = 0; i < Temp.length; i++) {
            if (Temp[i] > avg) {
                System.out.println("HIgher Temp then AVG" + " " + Temp[i]);
                count1++;
            } else {
                System.out.println("Less Temp than AVG" + " " + Temp[i]);
            }
        }
        System.out.println("Number of days having higher Temperature than Average is:" + count1);
    }
}

class AverageTemp_project {
    public static void main(String[] args) {

        TEMP obj1 = new TEMP();
        obj1.takeTemp();
        obj1.AvgTemp();
        obj1.HigherTemp();

    }
}
