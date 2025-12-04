
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
//Automatic sorting
  public static void main(String[] args) {

    //!Natral Order

    Queue<String> pq = new PriorityQueue<>();
    pq.add("Steven");
    pq.add("Alex");
    pq.add("Cathy");

    //!Priority Queue had  no ordering during add process
    System.out.println(pq);//![Alex, Steven, Cathy] no oreder

    System.out.println(pq.poll());//Alex
    pq.add("Ben");
    System.out.println(pq);//[Ben, Steven, Cathy]
    System.out.println(pq.poll());//Ben
    System.out.println(pq.poll());//Cathy
    System.out.println(pq.poll());//Stevent, //!alphabetic ordering
    //!When poll, autometic ordering

    //!Custom Order
                                                    //! \/ place the method(Class) here
    Queue<Integer> integers = new PriorityQueue<>(new SortByDesc());
    integers.add(99);
    integers.add(5);
    integers.add(23);

    System.out.println(integers.poll());//99
    integers.add(73);
    System.out.println(integers.poll());//73
    System.out.println(integers.poll());//23
    System.out.println(integers.poll());//5

  }
       //DIY a ordering method
    public static class SortByDesc implements Comparator<Integer>{
       @Override
    public int compare(Integer i1, Integer i2){
      return i1>i2? -1:1;
    }
    }


}
