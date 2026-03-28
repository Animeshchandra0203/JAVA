class ThreadInt extends Thread{
  
  @Override
  public void run(){
    for(int i=0;i<5;i++)
        System.out.println("the current thread is"+ Thread.currentThread().getName()+" -->  "+i);
  }
}
class ThreadAlpha extends Thread{
  private char ch;
  @Override
  public void run(){
    for(int i=0;i<5;i++){
      ch = (char)(65+i);
        System.out.println("the current thread is"+ Thread.currentThread().getName()+" -->  "+ ch);
     }
   }
}

public class FirstMultipleThread {
        public static void main(String[] args) {
             Thread t1 = new ThreadInt();
             Thread t2 = new ThreadAlpha();
             
             t1.start();
             t2.start();
         
      }
}
