package com.bootcamp.demo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//! Maven
//! gitbash:       
//!          1. mvn command looks for pom.xml
//!          2. search .m2 folder, check if the <dependency> exists (if no, download from internet)
//!          3. search any non-java codes (@xxxxxx), convert them into java code (see target/classes/xxx.class , @Generate)
//!          4. compile java file to class file, create "target" folder.
//!          5. run all the test cases inside the "test" folder
//!          6. package class files into single jar file inside the target folder
//!          7. put the jar file back to .m2 folder

//mvn comile phase(run from1-4)-----------Compile the code in main folder//
//mvn test phase(1-5)
//mvn install (1-7)
//mvn clean : delete target folder
//mvn clean install : delete target folder then 1-7


  @Builder   //Builder pattern
  @AllArgsConstructor
  @Getter
  @Setter
  @NoArgsConstructor //empty constructor
  @EqualsAndHashCode


public class Cat {
    private String name;
    private int age;
    // no more need hand typing....
    //Construcutor
    //getter
    //setter....

   
public void sleep(){    //auto detect
  System.out.println("Cat is sleeping...");
}
public static int sum(int x, int y){
  return x+y;
}

  public static void main(String[] args){
    Cat c1 = new Cat("Leo",13);
    System.out.println(c1.getName());
    System.out.println(c1.getAge());
    c1.setAge(10);



Cat c2 = Cat.builder()//
            .name("Leo")//
            .age(13)//
            .build();
            System.out.println(c2.getAge());

Cat c3 = Cat.builder()//
            .name("Leo")//
            .age(13)//
            .build();
            System.out.println(c3.getAge());
            
    System.out.println(c2.equals(c3));       //with @EqualsAndHashCode
    System.out.println(c2.hashCode());       //with @EqualsAndHashCode
    System.out.println(c3.hashCode());       //with @EqualsAndHashCode

  }
  
}
