public class LongestPrefix{

    static String longprefix(String[] strs){
       int min=strs[0].length(); // method used because Strs[0] is resolved first ad found to be string
        for(int i=1;i<strs.length;i++){
              if(min > strs[i].length()){
                min = strs[i].length();
              }
        }

        String res="";

        char[] compare = strs[0].toCharArray();  // assigns FIRST string from strs
        char[] check;
        for(int i=0;i<min;i++){
            for(int j=1;j<strs.length;j++){
                 check = strs[j].toCharArray();   //every iteration assigns a new string from strs

                if(compare[i] != check[i]){
                    return res;
                }
            }
            res += compare[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"abcde","abcd", "abc","ab"};
        String res = longprefix(strs);

        System.out.println("The longest common prefix: "+ res);
    }
}