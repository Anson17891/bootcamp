package com.bootcamp.demo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //! @AllargsConstructor + @Getter + @Setter
@Builder
@NoArgsConstructor //when use @Builder, need to add @xxxconstructor, avoiding bugs
@AllArgsConstructor //^^^^^^^
@EqualsAndHashCode   //Three must in a class, in just two lines ,WTF
@ToString            //^^^^^^^


public class Dog {
  private double weight;
  private int age;

  public static void main(String[] args) {
    Dog d1 = Dog.builder().weight(1.7).age(5).build();
    System.out.println(d1.getAge());
    System.out.println(d1.getWeight());
    d1.setAge(4);
    d1.setWeight(1.9);


    Dog d2 = new Dog(1.9, 2);
    //cons: fixed, must included all element
  }
}
