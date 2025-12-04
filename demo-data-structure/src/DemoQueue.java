
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    Queue<Integer> q1 = new LinkedList<>();
    q1.add(10);
    q1.add(3);
    q1.add(250);
    System.out.println(q1.size());//3
    //q1.get(1) //!no get() for Queue, but has get() in List //polymorphism, which interface is implied
    //also no addFirst()
    
    //!Queue->middle is not important->no need to get()
    //!better representation
    //!cons: memory consuming

    System.out.println(q1.poll());//10, get first and remove it  //!first in first out
    System.out.println(q1.size());//2

    System.out.println(q1.contains(250));//true   //is 250 still in the queue?
    System.out.println(q1.peek());//3, get head but not remove (10 has gone)
    
    //Common usage
    while(!q1.isEmpty()){ //!use while loop is more common
      System.out.println(q1.poll());
    }


    List<Integer> l1 = new LinkedList<>();
    l1.add(10);
    l1.add(3);
    l1.add(250);
    System.out.println(l1.get(1));//!List has get()

    ///////////////////////////////////////////////////
    Queue<String> q2 = new ArrayDeque<>();//use LinkedList also ok, botsh implements queue
    q2.add("John");
    q2.add("Tommy");
    q2.add("Steven");
    System.out.println(q2.poll());//John
    System.out.println(q2.poll());//Tommy
    System.out.println(q2.size());//1(John and Tommy have gone)
    //Strength of array-> search middle, but queue cannot be used for middle....WTF!?
    //!->Mostly use LinkedList

    Deque<String> names = new LinkedList<>();
     names.add("John");
     names.addFirst("Vincent");//!allow Last in first out
     names.addLast("Mary");
     //names.get(1); still cannot get()
     System.out.println(names.pollFirst());//Vincent
     System.out.println(names.pollLast());//Mary

     //!Last in first out
     //eg undo-redo
  }
}
