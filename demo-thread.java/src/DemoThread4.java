
import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread4 {
private AtomicInteger x = new AtomicInteger(0);

public void increament(){
    this.x.addAndGet(1);
}
public int getX(){   //!use Atomic -> no synchronized
    return this.x.intValue();
}
    public static void main(String[] args) {
     int x = 3;
     x++;
     System.out.println(x);//4
     x++;
     System.out.println(x);//5

     //Lambda   runnable(no input no output)
     DemoThread4 d1= new DemoThread4();
     Runnable task = () -> {
        for(int i = 0; i< 100000; i++){
        d1.increament();
        }
     };
       

     Thread t1 = new Thread(task);
     Thread t2 = new Thread(task);


     t1.start();
     t2.start();

     try{
      t1.join();
      t2.join();
     }catch(InterruptedException e){}
     


     System.out.println(d1.getX());

    }
}
