
import java.math.BigDecimal;
import java.math.RoundingMode;

//! Class' author write down the ways to access(read->get/write->set) the attribute valus
//! Method = Presentation of values

public class Dog {
  //! Attribute
  private double weight;
  private double height;

  //! Constructor
  //empty const.
  public Dog(){
  }

  //!all args contructor
  public Dog(double weight, double height){
    this.weight = weight;
    this.height = height;
  }
  //Empty constructor initializes an object with default values,   (have default value)
  //- Often used when you want to create an object and set its properties later using SETTERS.
  //- Required by frameworks like Hibernate or Spring for object instantiation via reflection

  //All-arguments constructor requires values for every field during object creation (need to input value)
  //- Useful when you want to ensure all fields are set immediately
  //- Common in immutable classes or when using libraries like Lombok (@AllArgsConstructor).

//! Duplicated: the number of parameter and the type of parameters are same
  // public Dog(double weight){   
  //   this.weight = weight;
  // }
                                              //eg. new Dog(3.0);   <-you mean weight or height???
  // public Dog(double height){ 
  //   this.weight = height;
  // }

  //!getter (to read value)
  //for weight and height
  public double getWeight(){
    return this.weight;
  }
  public double getHeight(){
    return this.height;
  }

  public double getBmi(){
    double bmi = BigDecimal.valueOf(this.weight)//
    .divide(BigDecimal.valueOf(this.height).pow(2),2,RoundingMode.HALF_UP)//
    .doubleValue();
    return bmi;
  }

  //! Setter (update attribute values)
  public void setWeight(double weight){ //void=>return nothing
    this.weight = weight;
  }
  public void setHeight(double height){
    this.height = height;
  }


  public static void main(String[] args) {
    Dog d1 = new Dog(4.5, 0.3);
    Dog d2 = new Dog(5.5, 0.25);

    System.out.println(d1.getWeight());
    System.out.println(d2.getHeight());

    //! double primitive default value = 0.0   (bcoz nothing in empty const.)
    Dog d3 = new Dog();
    System.out.println(d3.getWeight());//0.0
    System.out.println(d3.getHeight());//0.0

    System.out.println(d1.getBmi());


  }

}
