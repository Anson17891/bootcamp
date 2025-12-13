import java.util.Optional;
//!Problem eg2
public class DemoOptional3 {
  private Optional<String> name;  //meaning: Cat has Optional Object, Optional Object has name
                                  //need more object->//!Waste memory
  //! The problem of return null at getName()?
  public Optional<String> getName(){
    return this.name;
  }



  public static void main(String[] args) {
    //Cat c1 = new Cat("Jenny");
    // if(c1.getName() != null && c1.getName().equals("Jenny"))

    //! Summary: As developer, always do null check befor using the object
    //1.Avoid
    //2.Transfer (throw)
  }
}
