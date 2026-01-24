public class VarargsTry {
  
    static void addition(int sum, int... num){ 

        
       for(int i:num)
           sum += i;
        
       
    }
    public static void main(String args[]){
    System.out.println("Addition of integers ");

    int sum = 0;
 
     addition(sum,10,20);
    System.out.println("Sum of numbers = " + sum);
     
     addition(sum,10,20,30,40);
    System.out.println("Sum of numbers = " + sum);


    }
}
