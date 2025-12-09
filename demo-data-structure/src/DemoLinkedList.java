//!See Dog
import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    LinkedList<Square> cats = new LinkedList<>();
    Square c1 = new Square("", "John");
    Square c2 = new Square("", "Merry");
    cats.add(c1);
    cats.add(c2);
    cats.remove(c2);
    //cats.addFirst();
    //cats.addLast();
    System.out.println(cats);
    System.out.println(cats.contains(c2));//false
    //Still has method in arrayList

    //!LinkedList vs ArrayList
    //1. add() : add to tail-> LinkedList a little bit faster //use addLast()
    //2. size(): should store the current size -> Draw
    //3. get() : eg find the 10th elements in the list -> ArrayList faster  (LL find one by one)
    //4. contains(): both a loop ->Draw
    //5. remove(): eg remove "John" ->Draw

  }
}
