package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//! Ref
// public class Gun {
//   private int bullet;
//   public Gun(){this.bullet = 6;}
//   public boolean shoot(){
//     if(this.bullet>0){
//     this.bullet--;
//     return true;
//     }
//     return false;
//   }
// }

public class GunTest {
  @Test
  void testShoot(){
    Gun g1 = new Gun();
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),true);
    Assertions.assertEquals(g1.shoot(),false);

  }
}
