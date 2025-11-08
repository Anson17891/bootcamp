public class Candy {
  private final String color; //also can "no final, and without setter", just for better representation, let other know this will not be changed

public Candy(String color){
  this.color = color;
}
  public String getColor(){
    return this.color;
  }

public String toString(){
  return "Candy(" //
        + "color=" +this.color//
        + ")";
}
}
