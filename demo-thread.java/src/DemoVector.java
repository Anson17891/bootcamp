import java.util.List;
import java.util.Vector;

//! Vector vs ArrayList(non-thread safe)

public class DemoVector {
  public static void main(String[] args) {
    //C++
    //Vector's method = synchronized ArrayList
    List<String> names = new Vector<>();// Linkedlist/ArrayList 
    // names.add("Jenny");
    // names.add("Leo");
    // names.add("Oscar");  

    Runnable task = () -> {
      for(int i = 0; i<100000 ; i++){
          names.add("Leo");
      }
    };
long before = System.currentTimeMillis();
    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);
    t1.start();
    t2.start();
    try {
        t1.join();
        t2.join();
    } catch (InterruptedException e){
    }
  long after = System.currentTimeMillis();
  long timeUsed = after-before;
  System.out.println("Time used:" + timeUsed);//! Vector use much more time
    System.out.println(names.size());//!if use ArrayList-> <2000, even arrayOutOfBound
                                     //! use vector -> 2000
                                      //!if have to change data in the same list->use vector
                                     //! if can do it with >1 list -> use >1 arrayList (faster)
    
  }
}
