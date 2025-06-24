class Exercise {
    public boolean permutation(int[] array1, int[] array2){
        
        if(array1.length==array2.length)
        { 
            
            for(int i=0;i<array1.length-1;i++)
            {
                for(int j=0;j<array2.length-1;j++)
                {
                    if(array1[i]==array2[j])
                    {
                    System.out.println("PERMUTED ARRAY");
                    return true;
                    }
                }
            }
            
       }
       else{
           System.out.println("It is not a permuted array");
           return false;
       }
       return false;
           
    }

}
class Main{
    public static void main (String[] args){
        Exercise obj1=new Exercise();
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,3,5,1,2};
        obj1.permutation(arr1,arr2);
    }
}
