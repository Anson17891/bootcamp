public enum Suite {
  // Diamond(1),//
  // Heart(2),//
  // Club(3),//
  // Spade(4);


  // private final int value;

  // private Suite(int value){
  //   this.value = value;
  // }

  // public int getValue(){
  //   return this.value;
  // }

  // public static Suite valueOf(int value){
  //   for(Suite suite : values()){
  //     if(suite.getValue() == value){
  //       return suite;
  //     }
  //   } return null;
  // }
  //!-----------------solution\/--------------------------
  DIAMOND(1),//
  CLUB(2),//
  HEART(3),//
  SPADE(4),// add a commer convinence for add more afterward
  ;

  private int value;

  private Suite(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }
}
