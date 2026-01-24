import java.util.Scanner;

public class SpyNumber {

    static int digitSum(int n){
        int sum=0, digit;
        while(n>0){
            digit = n % 10;
            sum += digit;
            n /= 10;
        }

        return sum;
    }
     static int digitProduct(int n){
        int product=1, digit;
        while(n>0){
            digit = n % 10;
            product *= digit;
            n /= 10;
        }

        return product;
    }

    public static void main(String args[]){
        System.out.print("enter number to check for spy number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(digitSum(n) == digitProduct(n))
           System.out.println("given number is spy number "); 
        else
             System.out.print("NOT spy number!!! "); 

        sc.close();
    }
}
