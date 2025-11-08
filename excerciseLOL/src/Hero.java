import java.util.Random;

public class Hero {
  //Attributes
  private final String role;
  private int level;
  private int maxExp;
  private int exp;
  private int maxHP;
  private int maxMP;
  private int HP;
  private int MP;
  private int PA;
  private int PD;
  private int MA;
  private int MD;
  private int AG;
  private int CC;
  private double CD;

//Constructors
public Hero(String role){
  this.role = role;
  this.level = 1;
  this.exp = 0;
  this.maxExp = 2;
  this.maxHP = 20;
  this.maxMP = 20;
  this.HP = 20;
  this.MP = 20;
  this.PA = 0;
  this.PD = 0;
  this.MA = 0;
  this.MD = 0;
  this.AG = 0;
  this.CC = 0;
  this.CD = 0.0; 
}

//Getters
public String getRole(){
  return this.role;
}

public int getLevel(){
  return this.level;
}

public int getexp(){
  return this.exp;
}
public int getMaxHP(){
  return this.maxHP;
}

public int getMaxMP(){
  return this.maxMP;
}

public int getHP(){
  return this.HP;
}

public int getMP(){
  return this.MP;
}

public int getPA(){
  return this.PA;
}
public int getPD(){
  return this.PD;
}
public int getMA(){
return this.MA;
}
public int getMD(){
  return this.MD;
}
public int getAG(){
  return this.AG;
}
public int getCC(){
  return this.CC;
}
public double getCD(){
  return this.CD;
}
public void charcterInfo(){
  System.out.println("Role: " + this.role + " HP: " + this.HP + "/" + this.maxHP + " MP: " + this.MP + "/" + this.maxMP + " EXP: " + this.exp + "/" + this.maxExp);
  System.out.println("Phy Att: " + this.PA + " Phy Def: " + this.PD + " Mag Att: " + this.MA + " Mag Def: " + this.MD + " AGI: " + this.AG);
}

//!game mechanism
public double dodge(){
  int random = new Random().nextInt(0-101);
  return random>(100 - this.AG)?1.0:0.0;
}

public double cirticalHit(){
  int random = new Random().nextInt(0-101);
  return random>(this.CC)?this.CD:1.0;
}

public void isKilledEnemy(Hero enemy){
  if(enemy.HP <= 0){
  System.out.println("\r\n" + //
        "  _____ _____  ______       _______   ______ _   _ ______ __  ____     __\r\n" + //
        " / ____|  __ \\|  ____|   /\\|__   __| |  ____| \\ | |  ____|  \\/  \\ \\   / /\r\n" + //
        "| |  __| |__) | |__     /  \\  | |    | |__  |  \\| | |__  | \\  / |\\ \\_/ / \r\n" + //
        "| | |_ |  _  /|  __|   / /\\ \\ | |    |  __| | . ` |  __| | |\\/| | \\   /  \r\n" + //
        "| |__| | | \\ \\| |____ / ____ \\| |    | |____| |\\  | |____| |  | |  | |   \r\n" + //
        " \\_____|_|  \\_\\______/_/    \\_\\_|    |______|_| \\_|______|_|  |_|  |_|   \r\n" + //
        "                                                                         \r\n" + //
        "                                                                         \r\n" + //
        " ______ ______ _      _      ______ _____  \r\n" + //
        "|  ____|  ____| |    | |    |  ____|  __ \\ \r\n" + //
        "| |__  | |__  | |    | |    | |__  | |  | |\r\n" + //
        "|  __| |  __| | |    | |    |  __| | |  | |\r\n" + //
        "| |    | |____| |____| |____| |____| |__| |\r\n" + //
        "|_|    |______|______|______|______|_____/ \r\n" + //
        "                                           ");
  this.exp++;
  enemy.initialise();
  }
}

public void levelUP(){
  if(this.exp >= this.maxExp){
    System.out.println("デ↑デ↑デン↑ デ↓デン デッ↑デデン↑");
    System.out.println("Congrat, You are level up");
    this.level++;
    this.exp = 0;
    this.maxExp++;
    this.maxHP+=5;
    this.maxMP+=5;
    this.HP = this.maxHP;
    this.MP = this.maxMP;
    this.PA++;
    this.PD++;
    this.MA++;
    this.MD++;
    this.AG++;
    this.CC++;
    this.CD++;
    this.charcterInfo();
}
}

public void youDie(){
  if(this.HP <= 0){
    System.out.println("\r\n" + //
            "__     ______  _    _   _____ _____ ______ _____  \r\n" + //
            "\\ \\   / / __ \\| |  | | |  __ \\_   _|  ____|  __ \\ \r\n" + //
            " \\ \\_/ / |  | | |  | | | |  | || | | |__  | |  | |\r\n" + //
            "  \\   /| |  | | |  | | | |  | || | |  __| | |  | |\r\n" + //
            "   | | | |__| | |__| | | |__| || |_| |____| |__| |\r\n" + //
            "   |_|  \\____/ \\____/  |_____/_____|______|_____/ \r\n" + //
            "                                                 ");
    System.out.println("Your exp will be initialised");
    System.out.println("Try again, dumbass");
    this.initialise();
}

}
public void initialise(){
this.HP = this.maxHP;
this.MP = this.maxMP;
this.exp = 0;
}

public void phyAttack(Hero enemy){
  double damage = 0.0;
  double criticalDamage = this.cirticalHit();
  double dodge = enemy.dodge();
  if(this.HP <= 0){
    System.out.println("Don't you died? You dum");
  }else if(enemy.HP <= 0){
    System.out.println("Don't overkill, have mercy on your enemy, you loser");
  }else{
  damage = (this.PA*criticalDamage - enemy.PD)*dodge;
  if(criticalDamage > 1.0){
    System.out.println("Critical Hit!");
  }
  if(dodge == 0){
    System.out.println("Enemy managed to dodge your attack, dum you!");
  }
  enemy.HP -= (int)damage;
  System.out.println("You cause " + damage + " damage to enemy.");
  }
}

public void magAttack(Hero enemy){}

//public void damage(){}
public static void main(String[] args) {}


}
