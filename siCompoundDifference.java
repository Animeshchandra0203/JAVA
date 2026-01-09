import java.util.Scanner;

public class siCompoundDifference{
 

    public static float difference(Scanner sc, float p, float r, float t){
          float si = p*r*t/100;
          System.out.println(" simple interst: " + si);   
           

        System.out.println("select:\n 1. compounded YEARLY\n2. compounded HALF-YEARLY\n3. compounded QUARTERLY: ");
         int choice = sc.nextInt();
         float power = 0;
         switch(choice){
            case 1:  power = (float)Math.pow((1+r/100), t); 
                     break;
            
            case 2: power = (float)Math.pow((1+(r/2)/100), 2*t); 
                     break;
                    
            case 3: power = (float)Math.pow((1+(r/4)/100), 4*t); 
                     break;
            
            default: System.out.println("invalid input !!");
         }
    
          float compound = power*p-p;
          System.out.println(" compound intrest: " + compound);

          return (Math.abs(si-compound));
    }
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("this program calculates  difference between simple intrest and compound intrest.");

        System.out.print("enter principal: ");
        Float p = sc.nextFloat();
    
         System.out.print("enter rate: ");
        Float r = sc.nextFloat();
       
         System.out.print("select: \n1. time in months\n2. time in years: ");
         int choice = sc.nextInt();
         float t = 0;
         switch(choice){
            case 1:  System.out.print("enter time period in months:");
                      t = sc.nextFloat();
                     t = t/12;
                     break;
            
            case 2: System.out.print("enter time period in years:");
                     t = sc.nextFloat();
                     break;
            
            default: System.out.println("invalid input !!");
         }
        
         float dif = difference(sc,p,r,t);   
         System.out.print("difference between simple intrest and compound intrest: " + dif);    
        
        sc.close();

    }
}
