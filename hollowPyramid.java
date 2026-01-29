import java.util.Scanner;

public class hollowPyramid {
    
    public static void main(String[] args) {
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int space=0;space<=n-1-i;space++)
                System.out.print(" ");

            if(i == 0)
                 System.out.print("*");

            else if(i == n-1){
                 for(int j=0;j<n;j++)
                     System.out.print("* ");
            }
            else{
                System.out.print("*");

               for(int space =0;space<=2*i-1;space++)
                   System.out.print(" ");

               System.out.print("*");
            }
 
             System.out.println("");
          
        }
        
        sc.close();
    }
}
