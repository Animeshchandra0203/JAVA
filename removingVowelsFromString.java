public class removingVowelsFromString {
    

    public static void main(String[] args) {
        String str = "Hello World";
        String res ="";
        char temp;
        for(int i=0;i<str.length();i++){
              temp = str.charAt(i);
             if("aeiouAEIOU".indexOf(temp) == -1){
               res += temp;
             }
        }
       
        System.out.println("the string without vowels: "+ res);
    }
}
