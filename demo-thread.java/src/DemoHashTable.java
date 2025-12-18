
import java.util.Hashtable;
import java.util.Map;


//! HashTable vs HashMap(non-thread safe)

public class DemoHashTable {
  public static void main(String[] args) {
    Map<Integer, Integer> numbers = new Hashtable<>();
    
    Runnable task = () ->{

      for(int i = 0; i<10000; i++){
        numbers.put(i,i);
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
    } catch (InterruptedException e) {
    }
    long after = System.currentTimeMillis();
    long timeUsed = after-before;
    System.out.println("Time used:" + timeUsed);
    System.out.println(numbers.size());
  }
}
