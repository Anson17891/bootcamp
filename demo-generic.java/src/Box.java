public class Box<T> {  // <> for generic
  private T value;

  public Box(T value){
    this.value = value;
  }

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value = value;
  }

  public static void main(String[] args) {
    
  }
}
