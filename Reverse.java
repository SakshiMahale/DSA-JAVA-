import java.util.*;
import java.util.Arrays;

class rev{
    public void getrev(int[] Myarray){
        System.out.println("The array is:");
        System.out.println(Arrays.toString(Myarray));
        System.out.println("The reversed array is:");
        
        int n = Myarray.length-1;
        for(int i = n;i>=0;i--){
            System.out.print((Myarray[i]));
        }
        
    }

}

class Main{
    public static void main(String[] args){
        rev obj=new rev();
        int[] array={1,2,3,4,5};
        obj.getrev(array);
    }
}
