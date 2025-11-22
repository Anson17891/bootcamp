public enum Rank {
  // ONE(1),
  // TWO(2),
  // THREE(3),
  // FOUR(4),
  // FIVE(5),
  // SIX(6),
  // SEVEN(7),
  // EIGHT(8),
  // NINE(9),
  // TEN(10),
  // JACK(11),
  // QUEEN(12),
  // KING(13);

  // private final int rank;

  // private Rank(int rank){
  //   this.rank = rank;
  // }

  // public int getRank(){
  //   return this.rank;
  // }

  //   public static Rank valueOf(int value){
  //   for(Rank rank: values()){
  //     if(rank.getRank() == value){
  //       return rank;
  //     }
  //   } return null;
  // }

  // public static void main(String[] args) {
  //  Rank rank = Rank.valueOf(1);
  //   System.out.println(rank);
  // }
  //!-----------------solution\/--------------------------
  ACE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(11),
  QUEEN(12),
  KING(13);
  ;
  private int value;
  private Rank(int value){
    this.value = value;
  }
  public int getValue(){
    return this.value;
  }
}
