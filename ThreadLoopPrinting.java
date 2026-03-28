
class MyThread extends Thread{
  private int i;
  MyThread(int i){
    this.i = i;
  }
  @Override
  public void run(){
    System.out.println("the current thread is"+ Thread.currentThread().getName()+" -->  "+i);
  }
}

public class ThreadLoopPrinting{
        public static void main(String[] args) {
             for(int i=1;i<=10;i++){
                  Thread t= new MyThread(i);
                   t.start();
             }

        
        }
}

