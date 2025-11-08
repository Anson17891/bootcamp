public abstract class HERO {
  private int hp;
  private int mp;
  private int level;

public HERO(){
  this.level = 1;

}

public void levelUp(){
  this.level++;
}

public void setHp(int hp){
  this.hp = hp;
}

  public static int getPA(int role, int level){
    //Role = 0->Warrior, 1=Archer, 2=Mage
      return PA[role][level-1];
    }

    public int getLevel(){
      return this.level;
    }
    public abstract int getPD();
    
  

  public void deductHp(int hp){
   this.hp-= hp; 
  }

  
  public void attack(HERO hero){
    int myPole = xxxxxxx;
    int hpToBoDeducted = Hero.getPA(myRole, this.level-1) - hero.getPD();
    hero.deductHp(hpToBoDeducted);
  }
}

