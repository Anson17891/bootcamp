//! see COLOR.JAVA
public enum Direction {
  EAST('E',1),//
  WEST('W',-1),//
  SOUTH('S',2),//
  NORTH('N',-2);

  private char initial;
  private int label;

  private Direction(char initial, int label){
    this.initial = initial;
    this.label = label;
  }

  public char getInitial(){
    return this.initial;
  }
  public int getLabel(){
    return this.label;
  }

//   public Direction opposite(){
//   switch(this.getInitial()){
//    case 'E':
//    return WEST;
//    case 'W':
//    return EAST;
//    case 'S':
//    return NORTH;
//    case 'N':
//    return SOUTH;
//    default:
//    return null;
//   }
// }
public Direction opposite(){
  for(Direction direction : values()){
    if(direction.getLabel() * -1 == this.label){
      return direction;
    }
  }
}

//Static method (check if two direction value are opposite)
public static boolean isOpposite(Direction d1, Direction d2){
  return d1.opposite().getLabel() == d2.getLabel();
}

  public static void main(String[] args) {
    System.out.println(Direction.EAST.opposite());

    System.out.println(Direction.isOpposite(WEST, EAST));//true
  }
}
