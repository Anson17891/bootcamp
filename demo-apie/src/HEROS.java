public final class HEROS { //!use as dictionary, store all static variable / method
  private static final int[][] PA = new int[3][10];
  private static final int[][] PD = new int[3][10];
  private static final int[][] MAX_HP = new int[3][10]; 
  public static final int WARRIOR = 0; //!!!!!
  public static final int ARCHER = 1;  //!!!!!
  public static final int MAGE = 2;  //!!!!!!
  //! static block
//execute static block once when there is a static variavble
  static{
//! Dictionary
    PA[0] = new int[]{2,4,6,8,10,12,14,16,18,20};//let it be warrior
    PA[1] = new int[]{2,4,6,8,10,12,14,16,18,20};//be archer
    PA[2] = new int[]{2,4,6,8,10,12,14,16,18,20};//be mage

    PD[0] = new int[]{1,2,3,4,5,6,7,8,9,10};//let it be warrior
    PD[1] = new int[]{1,2,3,4,5,6,7,8,9,10};//be archer
    PD[2] = new int[]{1,2,3,4,5,6,7,8,9,10};//be mage

    MAX_HP[0] = new int[]{20,40,60,80,100,120,140,160,180,200};//let it be warrior
    MAX_HP[1] = new int[]{1,2,3,4,5,6,7,8,9,10};//be archer
    MAX_HP[2] = new int[]{1,2,3,4,5,6,7,8,9,10};//be mage
  }
}
