package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

//!Testing envionment
public class CatTest {  // xxxTest(s).java  for tesing

  @Mock
  private Gun gun;  //Object refernece ,  no function,just pretend to be a gun

  @Spy
  private Gun gun2; // functional gun


  //! first check what are the requirements 
  //! use mvn command (mvn test/mvn install...) to verify below testes
  //! Systemetically verify the code (without reading thousand of lines)
  //! test case once built keep forever -> even update the project (eg. add new class, new method), ensure existed classes/methods won't be changed 
  //! -->(recursion)
  //! if test case fail, discuss with developer (rewrite the code/ test case in not reasonable...)

  //! Once a test case fail, whole java-project stop



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
  //-----------------------------------
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
//--------------------------------------
    @Test
    void testSum(){
      int actualResult = Cat.sum(10,3);
      Assertions.assertEquals(13, actualResult);
      Assertions.assertEquals(-7, Cat.sum(10,-17));
    }
//-----------------------------------------
@Test
void testMethodB(){
Assertions.assertEquals('l', Cat.methodB("hello",2));
Assertions.assertEquals('o', Cat.methodB("hello",4));
}

@Test        //!need to repeat testMethodB???  NO
void testMethodA(){
  Assertions.assertEquals('l', Cat.methodB("hello",2));}  //!MethodA sholud be none of buisness with (independent to) methodB

@Test
void testShoot(){
  //Preparing part
  Mockito.when(this.gun.shoot()).thenReturn(true); //!  method->true   
  Cat c1 = new Cat(this.gun, "John", 12);               //! ^(assume methodB run normally, no matter if methodB having any bugs)
                   //!^ this.gun => mock gun                 //! ^INDEPENDENCE
    //Testing part
    int actual = c1.shoot(); //test if cat.shoot() == gun.shoot()
    int expected = 100;
    Assertions.assertEquals(expected, actual);

    Mockito.verify(this.gun, Mockito.times(1)).shoot(); //!ensure Gun.shoot() only run the times wanted
                                                        //! Prevent developer wrongly apply more/less methods
}
@Test
void testShoot2(){
  //Preparing part
  Mockito.when(this.gun.shoot()).thenReturn(false); //!  method->false   
  Cat c1 = new Cat(this.gun, "Leo", 11);               //! ^(assume methodB run normally, no matter if methodB having any bugs)
                   //!^ this.gun => mock gun                 //! ^INDEPENDENCE
    //Testing part
    int actual = c1.shoot(); //test if cat.shoot() == gun.shoot()
    int expected = -1;
    Assertions.assertEquals(expected, actual);
}



//!----SPY
@Test
void testShoot3(){
  Mockito.when(this.gun2.shoot()).thenReturn(true); //control only part of Gun's ,method
                                                     //if use Mock, have to mock addBullet() also
  Cat c1 = new Cat(this.gun2, "Leo", 11); 

    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    c1.addBullet();
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot());
    Assertions.assertEquals(100, c1.shoot()); 
    Assertions.assertEquals(100, c1.shoot()); //shoot 8 times

    Mockito.verify(this.gun2, Mockito.times(1)).addBullet();
    Mockito.verify(this.gun2, Mockito.times(8)).shoot();
}

    }
