//!fix problem in DemoThread
public class DemoThread2 {
  private int x = 0;

public void increament(){
    this.x++;
}
public int getX(){
    return this.x;
}
    public static void main(String[] args) {
    //! main Thread
     int x = 3;
     x++;
     System.out.println(x);//4
     x++;
     System.out.println(x);//5

     //Lambda   runnable(no input no output)
     DemoThread2 d1= new DemoThread2();
     Runnable task = () -> {
        for(int i = 0; i< 100000; i++){
        d1.increament();
        }
     };
       
     //! t1 -> 2nd thread
     Thread t1 = new Thread(task); //assign task to the thread
     //! t3 -> 3rd thread
     Thread t2 = new Thread(task);

     //! Main Thread release Thread t1
     t1.start();//Thread t1 starts to execute task
     //! Main Thread release Thread t2
     t2.start();//Thread t2 starts to execute task


     //Main Thread stand here to wait both t1 and t2 finish their tasks
     try{
      t1.join();
      t2.join();
     }catch(InterruptedException e){}

     //!Main Thread comes here after release t1 and t2
     System.out.println(d1.getX());//!not 200000


     //! Problems:
     //1. t1 and t2 doing the same task(x++), they change value of the same memory slot.
     //2. Main Thread continue execute the rest of code after release threads
    }
}
