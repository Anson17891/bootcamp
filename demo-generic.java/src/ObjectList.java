public class ObjectList<T> {
  private T[] objects;
//!~ArrayList.class
 public ObjectList(){
  this.objects = (T[]) new Object[0];
 }

 public void add(T Object){
  //...
 }
 
 public static void main(String[] args) {
  ObjectList<String> strings = new ObjectList<>();
 }
}
