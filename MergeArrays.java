import java.util.Scanner;

public class MergeArrays {

    static void sortArray(int[] arr, int n){
       for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
         }
       }
    }

    static int[] merge(int[] a, int[] b, int n, int m){
        int[] res = new int[n+m];
        for(int i=0;i<n+m;i++){
            if(i<n)
                res[i] = a[i];
            else
                res[i] = b[i-n];
        }
        sortArray(res, m+n);
        return res;
    }
    static void display(int[] arr, int n){
         for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

    public static void main(String args[]){
         int n,m;
         Scanner sc = new Scanner(System.in);

         System.out.print("enter size of first array: ");
          n = sc.nextInt();
          int[] a = new int[n]; 
        
          System.out.print("enter elements: ");
          for(int i=0;i<n;i++)
             a[i] = sc.nextInt();


          System.out.print("enter size of second array: ");
          m = sc.nextInt();
          int[] b = new int[m]; 
        
          System.out.print("enter elements: ");
          for(int i=0;i<m;i++)
              b[i] = sc.nextInt();
        
          System.out.print("merged sorted array:- ");
          int res[] = merge(a,b,n,m);
          display(res,m+n); 

          sc.close();
    }
}
