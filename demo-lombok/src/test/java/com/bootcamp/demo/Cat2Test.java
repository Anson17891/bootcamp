package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;   //static + .*   quote all static method in class MatcherAssert
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.not;
import org.junit.jupiter.api.Test;



//! Junit -> check object
//problem: List-> check "John" exist in the list   <--Junit cannot do this
//! USE Hamcrest
public class Cat2Test {

  @Test
  void testSum(){
    int actual = Cat.sum(3,7);
    int expected = 10;
    assertThat(actual, is(equalTo(expected)));   //like SVO sentence  is()-> no need
  }

  @Test
  void testList(){
    List<String> names = new ArrayList<>(List.of("Peter", "John", "Steven"));
    
    assertThat(names, hasItem("Peter"));
    assertThat(names, not(hasItem("Mary")));   // = !names.cotains("Mary")  but in testing version
  }

  @Test     //!hasItems  ,  contains
  void testList2(){
    List<Integer> ages = new ArrayList<>(List.of(18, 20, 40));
    assertThat(ages, hasItems(20,40));
    assertThat(ages, hasItems(40,20)); //!no ordering req.     
                                                                
    assertThat(ages,not(hasItems(40,20,100))); //test all three  
                                                                
    //! contains --> with all element with order               
    assertThat(ages, contains(18,20,40));
     //assertThat(ages, contains(40,20));  <-test fail

     //! containsInAnyOrder
     assertThat(ages, containsInAnyOrder(18,40,20));

     //!hasSize
     assertThat(ages, hasSize(3));

  }
    
  //! greaterThan lessThan
  @Test
  void testNumberRange(){
    int actual = 35;
    assertThat(actual, is(greaterThan(30)));
    assertThat(actual, is(lessThan(40)));
    assertThat(actual, is(greaterThanOrEqualTo(30)));
    assertThat(actual, is(lessThanOrEqualTo(40)));
  }



}
