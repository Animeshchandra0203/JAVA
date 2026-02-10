import java.util.Scanner;

public class RepeatedLetters {

    static void count(String str) {
        int[] arr = new int[str.length()];
        char[] chararr = str.toCharArray();

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - i - 1; j++)
                if ((int) chararr[j] > (int) chararr[j + 1]) {
                    char temp = chararr[j];
                    chararr[j] = chararr[j + 1];
                    chararr[j + 1] = temp;
                }
        }
        
        int count = 1;
        for (int i = 0; i < str.length()-1; i++) {
            
            if (chararr[i] == chararr[i + 1]) {
                arr[i] = ++count;
            }
            else{
                 System.out.println(chararr[i] + " - " + count);
                count=1;
            }
        }
         System.out.println(chararr[str.length()-1] + " - " + count);  //prints last character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to get number of each letter repeated: ");
        String str = sc.next();

         System.out.println("\ncount of each letter of the string: ");
        count(str);
       
        sc.close();
    }
}
