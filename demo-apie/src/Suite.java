public enum Suite {
  Diamond('D'),//
  Heart('H'),//
  Club('C'),//
  Spade('S');

  private char initial;
  private Suite(char initial){
    this.initial = initial;
  }
  private char getInitial(){
    return this.initial;
  }

}
