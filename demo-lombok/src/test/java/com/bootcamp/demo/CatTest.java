package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CatTest {  // xxxTest(s).java  for tesing
  //! first check what are the requirements 
  //! use mvn command (mvn test/mvn install...) to verify below testes
  //! Systemetically verify the code (without reading thousand of lines)
  //! test case once built keep forever -> even update the project (eg. add new class, new method), ensure existed classes/methods won't be changed 
  //! -->(recursion)
  //! if test case fail, discuss with developer (rewrite the code/ test case in not reasonable...)
  @Test
  void testAllArgsConstructor(){
    Cat c1 = new Cat("Leo", 3);

    //expected result
    String expectedName = "Leo";
    int expectedAge = 3;

    //testing
    Assertions.assertEquals(expectedName, c1.getName()); //if they're not equal, test case fail
    Assertions.assertEquals(expectedAge, c1.getAge());
  }
    @Test
    void testGetter(){
      Cat c1 = new Cat("Leo", 3);
      String actualName = c1.getName();
      String expectedName = "Leo";

      Assertions.assertEquals(expectedName, actualName);

      c1.setName("Mary"); //also tested setter (just coincidence)
      expectedName = "Mary";
      Assertions.assertEquals(expectedName, c1.getName());
    }

    @Test
    void testSum(){
      int actualResult = Cat.sum(10,3);
      Assertions.assertEquals(13, actualResult);

      Assertions.assertEquals(-7, Cat.sum(10,-17));
    }


    }
