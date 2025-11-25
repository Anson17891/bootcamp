
//! see Card, Deck, ShuffleManager .java
public class HandManager {
  private Card[] cards;

  public HandManager(Card[] cards){
    //if cards.length != 5, throw exception
    this.cards= cards;
  }
  public void setCards(Card[] cards){
    this.cards = cards;
  }

  public boolean withEmptyCard(){
    return cards[0] == null || cards[1] == null//
      || cards[2] == null || cards[3] == null//
      || cards[4] == null;
  }

  public boolean isFullHouse(){
    //Algorithm ->
    if(withEmptyCard())
      return false;
    int[] boxes = new int[13]; //13 ranks //!!!!!!!IMPORTANT TECHNIQUE to count orderless thread .every rank has own counter, 
    for(Card card : this.cards){                   //!cons. Must has definite number of choice
     boxes[card.getRank().getValue()-1]++;
    }
    int threeCount = 0;
    int twoCount = 0;
    int zeroCount = 0;
    for(int i = 0; i<13; i++){
      if(boxes[i] == 0) zeroCount++;
      if(boxes[i] == 2) twoCount++;
      if(boxes[i] == 3) threeCount++;
    }
    return zeroCount==11&&twoCount==1&&threeCount==1;
  }

  //! Excercise:  Straight Flush
  //max-min==5?  royal flush not count
  public boolean isStraightFlush(){
    if(withEmptyCard())return false;
    int[] suiteCounter = new int[4];
    int min = 13;
    int max = 0;
    boolean isDiamondFlush = false;
    boolean isClubFlush = false;
    boolean isHeartFlush = false;
    boolean isSpadeFlush = false;
    boolean isStraight = false;
    for(Card card : this.cards){
      suiteCounter[card.getSuite().getValue()-1]++;
      if(card.getRank().getValue()>max)max=card.getRank().getValue();
      if(card.getRank().getValue()<min)min=card.getRank().getValue();
    }
    if(suiteCounter[0]==5&&suiteCounter[1]==0&&suiteCounter[2]==0&&suiteCounter[3]==0)isDiamondFlush = true;
    if(suiteCounter[0]==0&&suiteCounter[1]==5&&suiteCounter[2]==0&&suiteCounter[3]==0)isClubFlush = true;
    if(suiteCounter[0]==0&&suiteCounter[1]==0&&suiteCounter[2]==5&&suiteCounter[3]==0)isHeartFlush = true;
    if(suiteCounter[0]==0&&suiteCounter[1]==0&&suiteCounter[2]==0&&suiteCounter[3]==5)isSpadeFlush = true;
    if(max-min==4)isStraight = true;
    return (isDiamondFlush||isClubFlush||isHeartFlush||isSpadeFlush)&&isStraight;
  }

  public static void main(String[] args) {
    Card[] cards = new Card[5];
    cards[0]=new Card(Suite.CLUB,Rank.ACE);
    cards[1]=new Card(Suite.SPADE,Rank.ACE);
    cards[2]=new Card(Suite.DIAMOND,Rank.ACE);
    cards[3]=new Card(Suite.DIAMOND,Rank.EIGHT);
    cards[4]=new Card(Suite.HEART,Rank.EIGHT);

    Card[] hand2 = {new Card(Suite.CLUB, Rank.EIGHT),//
                    new Card(Suite.DIAMOND, Rank.FIVE),//
                    new Card(Suite.HEART, Rank.FOUR),
                    new Card(Suite.CLUB, Rank.TEN),
                    new Card(Suite.DIAMOND, Rank.EIGHT)
                  };

    Card[] hand3 = {new Card(Suite.CLUB, Rank.EIGHT),//
                    new Card(Suite.CLUB, Rank.NINE),//
                    new Card(Suite.CLUB, Rank.JACK),
                    new Card(Suite.CLUB, Rank.TEN),
                    new Card(Suite.CLUB, Rank.QUEEN)
                  };

    HandManager hm = new HandManager(cards);
    System.out.println(hm.isFullHouse());
    hm.setCards(hand2);
    System.out.println(hm.isFullHouse());
    hm.setCards(hand3);
    System.out.println(hm.isStraightFlush());
  }
}
