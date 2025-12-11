public class Person {
  private String name;
  private int age;
  //!!!!Builder Pattern

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

@Override
  public String toString(){
    return "Person( "//
           +"name= "//
           +this.name//
           +", age= "//
           +this.age//
           +")";
  }
  //First step
  public static Builder builder(){
    return new Builder();
  }

  //Last step
  public Person(Builder builder){
    this.name = builder.name;
    this.age = builder.age;
  }

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }

  public static class Builder {
    private String name;
    private int age;

    public Builder name(String name){
      this.name = name;
      return this;  //for chain method  
    }
    public Builder age(int age){
      this.age = age;
      return this;
    }

    public Person build(){
      return new Person(this);
    }

  }

  public static void main(String[] args) {
    Person person = Person.builder()//
                          .name("John")//
                          .age(30)//
                          .build(); 
    //!!!!!name and age can be swap, also can leave any attributes blank
    Person person2 = Person.builder()//
                           .age(30)//
                           .build();

   System.out.println(person.getAge() + ", " + person.getName());//30, John
   System.out.println(person2.getAge() + ", " + person2.getName());//30, null
  }
}
