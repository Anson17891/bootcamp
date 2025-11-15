//!SEE COLOR.JAVA AND PANDA.JAVA
public class Tiger {
  public static final String RED = "RED"; //solution,but if smo write red or other form w/o looking this def?
  private String color;
  
  public Tiger(String color){
    this.color=color;
  }

  public String getColor(){
    return this.color;
  }

  //public boolean isRed(){
    //a.return this.color.trim().equalsIgnoreCase("RED");} //if smo write red or other form w/o looking this def?
    //b.or return this.color.trim().equalsIgnoreCase(Tiger.RED);} //same problem


  public static void main(String[] args) {
    Tiger t1 = new Tiger("RED");
    Tiger t2 = new Tiger("red");
    Tiger t3 = new Tiger("Red");
    Tiger t4 = new Tiger("RED "); //all are red but different

    //check if t2 is red color?
    //if(t2.getColor().equals("RED")){}

    Tiger t5 = new Tiger(Tiger.RED);

    //! without enum, we cannot ensure user passing the right parameter to call constructor
    //Tiger t5 = new Tiger("red"); //user not using the parameter RED

  }
}
