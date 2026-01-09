import java.util.*;
public class ticTacToe {

    static char[] arr = {'1','2','3','4','5','6','7','8','9'};  // Global declartion 
    static Scanner sc = new Scanner(System.in);

    static void board(){
        int a = 0;
        for(int i=0;i<3;i++){
          System.out.println("|---|---|---|");
          System.out.println("| " + arr[a++] + " | " + arr[a++] + " | "+ arr[a++]+ " |");

        }
        System.out.println("|---|---|---|");
    }

    static void emptyBoard(){
       int a = 0;
       for(int i=0;i<3;i++){
         System.out.println("|---|---|---|");

          for(int j=0;j<3;j++){
             if(arr[a] == 'X' || arr[a] == 'O')
                 System.out.print("| " + arr[a] + " ");
             else
                 System.out.print("| " + " "+ " ");
             
             a++;
          }
          System.out.println("|");
          

        }
        System.out.println("|---|---|---|");
    }

    static int choose(){
        
        System.out.print("enter postion:  ");
        int a = sc.nextInt();
        

        if(a<1 || a>9 || arr[a-1]=='X' || arr[a-1]=='O'){
           System.out.println("invalid or Wrong postion !!!");
            return choose();
        }

       return a;
    }

    static char winnerDecision(){
       for(int i=0;i<8;i++){
         
        String line ="";

        switch(i){
            case 0: line += arr[0]; line +=arr[1]; line +=arr[2];
                    break; 
            case 1:  line += arr[0]; line += arr[3]; line += arr[6];
                    break; 
            case 2: line += arr[0]; line += arr[4]; line += arr[8];
                    break;
            case 3: line += arr[1]; line += arr[4]; line +=arr[7];
                    break; 
            case 4: line += arr[2]; line += arr[5]; line += arr[8];
                    break;   
            case 5: line += arr[3]; line += arr[4]; line += arr[5];
                    break; 
            case 6: line += arr[6]; line += arr[7]; line +=arr[8];
                    break; 
            case 7: line += arr[2]; line += arr[4]; line += arr[6];
                    break; 
        }

        if(line.equals("XXX"))
          return 'X';
        
        else if(line.equals("OOO"))
          return 'O';
        
     }
     
      return 'd';
  }


    public static void main(String[] arg){

        System.out.println("Play Tic-Tac-Toe witth X\' and Y\' .");
        System.out.println("X\'s player will play first.");

        board();

        for(int i=0;i<9;i++){
            int choice;

            if(i%2 == 0){
              System.out.println("X\'s Turn");
               choice = choose();
               arr[choice-1] = 'X';
               emptyBoard();
            }
            else{
              System.out.println("O\'s Turn: ");
               choice = choose();
               arr[choice-1] = 'O';
               emptyBoard();
            }
             char res = winnerDecision();
            if(res == 'X'){
                 System.out.println("X\'s player won.");
                 return ;
            }
            else if(res == 'O'){
                 System.out.println("O\'s player won.");
                 return ;
            }
        }
          sc.close();
          System.out.println("Game DRAW.");
          return ;
    }
    
}
