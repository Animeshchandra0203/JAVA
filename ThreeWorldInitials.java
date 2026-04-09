import java.util.Scanner;

public class ThreeWorldInitials {
     public static void main(String[] args) {
        System.out.println("enter a String or name with 3 or more words: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();

      StringBuffer initial = new StringBuffer();
        
      if(str.length()>0 && str.charAt(0) != ' '){
                initial.append(str.charAt(0));
            }

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == ' '){
                initial.append(str.charAt(i+1));
            }
        }
        String res = initial.toString();
         System.out.println(" String or name with 3 or more words: "+ res);
     }
}
