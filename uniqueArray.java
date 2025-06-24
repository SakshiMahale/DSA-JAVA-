import java.util.Arrays;
public class Exercise {
    public boolean isUnique(int[] intArray) {
        boolean a=true;
        boolean b=false;
        Arrays.sort(intArray);
        for(int i=0;i<intArray.length-1;i++){
            if(intArray[i]==intArray[i+1]){
                System.out.println("The array provided is not unique"+b);
                return false;
            }
            
        }
        System.out.println("ARRAY is unique"+a);
        return true;
    }

}
class MAIN{
    public static void main (String[] args){
        Exercise obj = new Exercise();
        int[] MYARRAY={1,2,3,4,4};
        obj.isUnique(MYARRAY);
    }
}
