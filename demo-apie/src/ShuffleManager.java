
import java.util.Arrays;
import java.util.Random;

//! see Deck Card Suite Rank .java
public class ShuffleManager { //if you think up of some algorithms and want somewhere to store your idea...write a manager
  private Deck deck;

  public ShuffleManager(Deck deck){
    this.deck = deck;
  }

  public void shuffle(){
    //random index(20-40)
    //repeat 100times
    //pick 10 card in middle, put to top
    Card[] newCards = new Card[deck.getCards().length];
    int idx = 0;
    for( int i = 0; i < 50; i++){
      int randomIndex = new Random().nextInt(21) + 20;
      idx = 0;
       for(int j = randomIndex; j < randomIndex + 10; j++){
        newCards[idx++] = deck.getCards()[j];
       }         //first part of new deck = middle(random) of old deck
       for(int j = 0; j < randomIndex; j++){
        newCards[idx++] = deck.getCards()[j];
       }        //second part of new deck = head of old deck
       for(int j = randomIndex + 10; j < deck.getCards().length; j++){
        newCards[idx++] = deck.getCards()[j];
       }        //third part of new deck = rear of old deck
       deck.setCard(newCards);  //! !IMMUTABLE! remember to reassign (also for next shuffle)
    }
    
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    ShuffleManager sm = new ShuffleManager(d1);
    sm.shuffle();
    System.out.println(Arrays.toString(d1.getCards()));
  }
}
