import java.util.*;
import java.util.Arrays;
public class Exercise {
        public int searchInArray(int[] intArray, int valueToSearch) {

            int i;
            for(i=0;i<intArray.length;i++){
                if(intArray[i]==valueToSearch){
                    System.out.println("Value found on :"+i+" "+intArray[i]);
                    return i;
                }
            }
            System.out.println("VALUE NOT FOUND"); 
            return -1;
        }
}
class MAIN{
    public static void main (String[] args){
        Exercise obj1= new Exercise();
        int[] ARRAY={1,2,3,4};
        int value=1;
        obj1.searchInArray(ARRAY,value);
    }
}
