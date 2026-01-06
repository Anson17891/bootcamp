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
    private Gun gun;
    // no more need hand typing....
    //Construcutor
    //getter
    //setter....

//------testing "method call method"
    //! Dependency
    //Cat object depends on Gun, Name, Age
   public Cat(Gun gun, String name, int age){
    this.gun = gun;
    this.name = name;
    this.age = age;}

     public Cat(String name, int age){
    this.name = name;
    this.age = age;}

    public int shoot(){   //~methodA
    //this.gun.shoot()   //!<---in case developer take mistake, apply gun.shoot() twice -> can also get true (false diagnosis),
                             //!need mockito.verify()
      if(this.gun.shoot()){  //~methodB
        return 100;
      } return -1;        
    }                      //!Num of test cases -> only 2(result: 100 or 1), independent to methodB


    public void addBullet(){
      this.gun.addBullet();
    }

//----------------------
public void sleep(){    //auto detect
  System.out.println("Cat is sleeping...");
}
public static int sum(int x, int y){
  return x+y;
}
//--------------Method calls method(s)------------------------------
public static int methodA(String s, int index){
  if(s == null){return -1;}
  if(index <0||index>=s.length()){return -2;}
  return methodB(s,index);
}

public static char methodB(String s, int index){
  return s.charAt(index);
}
//----------------------------------------------------------------
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
