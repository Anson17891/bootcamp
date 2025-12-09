
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoBigO {
  public static void main(String[] args) {
    //!O(n^2+n) -(same)-> O(n^2)    n^2 is the most critical
    //for(...){
     // for(...){}
    //}

    //for(...){}
  //}
  //! Discript algorithm's performance (time/sapce consumption)


  //DSA data structure algorithm
  List<String>names = new ArrayList<>();
  //List<String>names = new LinkedList<>(); 
  names.add("Mary");  //O(n) for ArrayList, O(1) for LinkedList
  names.add("Tommy");
  names.add("Jenny");
  System.out.println(names.get(2)); //O(1) for ArrayList, O(n) for LinkedList

  Queue<String> names2 = new LinkedList<>();
  //Queue<String> names2 = new ArrayDeaue<>();
  names2.add("Leo");//O(n) for ArrayDeque, O(1) for LinkedList
  names2.add("Oscar");
  names2.add("Johnny");
  System.out.println(names2.poll());//O(n) for ArrayDeque, O(1) for LinkedList (manipulate the first)
}
}
