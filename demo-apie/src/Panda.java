//!SEE TIGER.JAVA COLOR.JAVA
public class Panda {
  private Color color;

  //! using enum as parameter in constructor -> Encapsulation
  //Limit user, give meaning to the parameter
  public Panda(Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    Panda p1 = new Panda(Color.RED);
    Panda p2 = new Panda(Color.White);
    //new Panda("RED"); // error cannot construct with a STRING

    //check uf p2 is RED?
    if(p2.getColor() == Color.RED){//! use ==, bcoz enum is the only one address
      System.out.println("The Panda p3 is RED.");
    }

    Color color = Color.valueOf('R');
    System.out.println(color);//RED   //!enum implicitly has toString() 
    }

  }
}
