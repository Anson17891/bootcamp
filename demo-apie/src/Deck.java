
import java.util.Arrays;

public class Deck {
  private final Card[] cards;
 
  public Deck(){
    this.cards = Card.formDeck();
  }

  public Card[] getDeck(){
    return this.cards;
  }
  public static void main(String[] args) {
    Deck deck = new Deck();
    for(Card card : deck.getDeck()){
      System.out.println(card.toString());
    }

  }
}
