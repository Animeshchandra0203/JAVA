public class ExceptionHandling {
    public static void main(String[] args) {
        
        int[] arr ={0,10,20,30};

        try {
            int result = arr[2]/ arr[0];   
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Cannot get Array out of bound Index!");
        }

        finally {
            System.out.println("this block definetely runs whether catch-block runs or not.");
        }
    }
}

