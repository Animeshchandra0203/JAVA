
import java.util.Scanner;

public class PrivateConstructor{
    
    private static PrivateConstructor pc;
    
    int x, y;
    
    private PrivateConstructor(int x, int y){
           this.x = x;
           this.y = y;
    }

    public static PrivateConstructor getMethod(int x, int y){
          if(pc == null){                       //pc is created only once            
            pc = new PrivateConstructor(x,y);  //The second call (5,6) is ignored because pc != null 
         }
         return pc;
    }

    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
  
         System.out.println("SINGLETON access through private constructor");
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();

         PrivateConstructor m = getMethod(a,b);                 
         PrivateConstructor n = getMethod(5,6);
         
         System.out.println("x: "+ m.getX() + " & " + n.getX());
         System.out.println("y: "+ m.getY() + " & " + n.getY());

          System.out.println(m == n);   // Both m and n point to the same object

         sc.close();
    }
}

