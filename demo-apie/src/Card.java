//!use enum
public class Card {
private Suite suite;
private Rank rank;

  //constructor
  public Card(Suite suite, Rank rank){
    this.suite = suite;
    this.rank = rank;
  }



  //getter
  public Suite getSuite(){
    return this.suite;
  }
  public Rank getRank(){
    return this.rank;
  }

  public void setSuite(Suite suite){
    this.suite = suite;
  }
  public void setRank(Rank rank){
    this.rank = rank;
  }

    @Override
  public String toString(){
    return "Card("//
          +"Suite="//
          +this.getSuite()//
          +" ,Rank="//
          +this.getRank()//
          +")";
  }

    public static Card[] formDeck(){
      Card[] deck = new Card[52];
      int idx = 0;
    for(int i = 1; i < 5; i++){
      for(int j = 1; j < 14; j++){
           deck[idx] = new Card(Suite.valueOf(i),Rank.valueOf(j));
           idx++;
           if(idx==52){break;}
      }
    }
      return deck;
  }

  public static void main(String[] args) {
    //52 cards
    //create Deck.class
    //Deck deck = new Deck();//call empty constructor
    //System.out.print(deck.getCards());// print all cards, w. its rank and suite
  }
}
