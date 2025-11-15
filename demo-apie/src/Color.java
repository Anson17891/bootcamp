//!SEE　TIGER.JAVA PANDA.JAVA
//! enum is a more powerful version of class
//1. Cannot create enum by oneself
//2. All enum value exist in memory w/o object reference
public enum Color {
  RED('R'),//!  (xxx) <- calling constructor
  YELLOW('Y'),// 
  White('W');
  //only ^ can operate

  private char initial;//Attribute , ofcoz can be any primitive/class

  //constructor (private for enum constructor)
  private Color(char initial){
    this.initial = initial;
  }

  public char getInitial(){ //still can have getter setter
    return this.initial;
  }

  //Search enum by attribute
  public static Color valueOf(char initial){
    for(Color color : values()){  
      //!(Color.)values() implicitly exist in enum.class
       if(color.getInitial() == initial){
        return color;
       }
    }
    return null; //actually should use throw error
  }



  //!Enum Examples in real world:
  //eg.Days of week
  //   Direction
  //   Diamond, club...(suit)
  //! Gender
  //! Occupation
  //! District
  //!...DROP DOWN LIST

  //!Definition od enum:
  //1. Has to be finite values
  //2. Not modified frequently
  

}
