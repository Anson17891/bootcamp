

public class Deck {
  // private final Card[] cards;
 
  // public Deck(){
  //   this.cards = Card.formDeck();
  // }

  // public Card[] getDeck(){
  //   return this.cards;
  // }
  // public static void main(String[] args) {
  //   Deck deck = new Deck();
  //   for(Card card : deck.getDeck()){
  //     System.out.println(card.toString());
  //   }

  // }
//!-----------------solution\/--------------------------

  private Card[] cards;

  public Deck(){
    this.cards = new Card[Suite.values().length * Rank.values().length];
    int idx = 0;
    for(Suite suite : Suite.values()){
      for(Rank rank : Rank.values()){
        this.cards[idx++] = new Card(suite,rank);
      }
    }
  }

  public Card[] getCards(){
    return this.cards;
  }

  public void setCard(Card[] cards){//put the shuffled cards to new a deck
  this.cards = cards;  
  }
}
