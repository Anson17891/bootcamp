import java.util.Arrays;
import java.util.Objects;
//!use enum
public class Card {
private Suite suite;
private Rank rank;

  // //constructor
  // public Card(Suite suite, Rank rank){
  //   this.suite = suite;
  //   this.rank = rank;
  // }



  // //getter
  // public Suite getSuite(){
  //   return this.suite;
  // }
  // public Rank getRank(){
  //   return this.rank;
  // }

  // public void setSuite(Suite suite){
  //   this.suite = suite;
  // }
  // public void setRank(Rank rank){
  //   this.rank = rank;
  // }

  //   @Override
  // public String toString(){
  //   return "Card("//
  //         +"Suite="//
  //         +this.getSuite()//
  //         +" ,Rank="//
  //         +this.getRank()//
  //         +")";
  // }

  //   public static Card[] formDeck(){
  //     Card[] deck = new Card[52];
  //     int idx = 0;
  //   for(int i = 1; i < 5; i++){
  //     for(int j = 1; j < 14; j++){
  //          deck[idx] = new Card(Suite.valueOf(i),Rank.valueOf(j));
  //          idx++;
  //          if(idx==52){break;}
  //     }
  //   }
  //     return deck;
  // }

  // public static void main(String[] args) {
  //   //52 cards
  //   //create Deck.class
  //   //Deck deck = new Deck();//call empty constructor
  //   //System.out.print(deck.getCards());// print all cards, w. its rank and suite
  // }
  //!-----------------solution\/--------------------------
  public Card(Suite suite, Rank rank){
    this.suite = suite;
    this.rank = rank;
  }

  public Suite getSuite(){
    return this.suite;
  }
  public Rank getRank(){
    return this.rank;
  }

  @Override
  public String toString(){
    return "Card("//
          +"suite=" + this.suite//
          +",rank=" + this.rank//
          +")";
  }

  @Override
  public boolean equals(Object obj){
    if(this==obj){
      return true;
    }
    if(!(obj instanceof Card)){
      return false;
    }
    Card card = (Card)obj;
    //return this.suite == card.getSuite()
    //&& this.rank == card.getRank();
    return Objects.equals(this.suite, card.getSuite())//
            && Objects.equals(this.rank, card.getRank());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.suite, this.rank);
  }
  

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(Arrays.toString(deck.getCards()));

    Card c1 = new Card(Suite.DIAMOND, Rank.KING);
    Card c2 = new Card(Suite.HEART, Rank.QUEEN);
    System.out.println(c1.equals(c2));//false

    Card c3 = new Card(Suite.HEART,Rank.QUEEN);
    System.out.println(c2.equals(c3));//true
  }
}
