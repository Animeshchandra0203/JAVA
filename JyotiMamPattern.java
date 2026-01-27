import java.util.*;
public class jyotiMamPattern {
	public static void main(String[] args) {
		System.out.print("enter size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++){
			
			for(int s=1;s<=(4/2);s++)
			   System.out.print(" ");
			   
			 if(i%4 == 0){
			 	for(int k=1;k<=4;k++){
			 		System.out.print("*");
			 	}
			 	
			      a++;
			 	System.out.println("");
			 }
			 else
			 	System.out.println((i%4)*a);
		}
	}
}
