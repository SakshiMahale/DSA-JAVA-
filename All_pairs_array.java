import java.util.*;
import java.util.Arrays;

class SUM_prod{
    public int getSUM_PROD(int[] Myarray){
        System.out.println("Pairs of of numbers are:");
       for(int i=0;i< Myarray.length;i++){
           for(int j=0;j<Myarray.length;j++){
               System.out.println(Myarray[i]+" "+Myarray[j]);
           }
       }
       return -1;
    }
}

class Main{
    public static void main(String[] args){
        SUM_prod obj=new SUM_prod();
        int[] array={1,2,3,4,5};
        obj.getSUM_PROD(array);
    }
}
