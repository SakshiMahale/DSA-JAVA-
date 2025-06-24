import java.util.*;
import java.util.Arrays;

class SUM_prod{
    int sum=0;
    int prod=1;
    public int getSUM_PROD(int[] Myarray){
        for(int i=0;i< Myarray.length;i++){
            sum=sum+Myarray[i];
            prod=prod*Myarray[i];
        }
        System.out.println("The sum of my array is:"+sum);
        System.out.println("The product of my array is:"+prod);
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
