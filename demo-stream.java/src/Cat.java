  //!After Java 16
public record Cat(String name, int age) {
  //before java16, create a class:
  //Attribute
  //Constructor
  //getter,setter
//.........After Java 16....................
  //!Cannot write constructor
  //public Cat(){}

  //getter

  //setter
  public void setName(String name){
    //this.name = name;  //! by default, attributes are final
  }
  //! No setter. "Record" cannot be alter.

}
