public class Exercise {
      public static int sumDiagonalElements(int[][] array) {
         int sum=0;
         for(int i=0;i<array.length;i++){
             for(int j=0;j<array[0].length;j++){
                if(i==j){
                    sum=array[i][j]+sum;
                }
             }
         }
         
         System.out.println("The sum of diagonals is:"+sum);
          return sum;
 
    }
   
}

class MAIN{
    public static void main(String[] args){
        Exercise obj1=new Exercise();
        
        int[][] array1={{1,2,3},{4,5,6},{7,8,9}};
        
        int result=obj1.sumDiagonalElements(array1);
        
    }
}
