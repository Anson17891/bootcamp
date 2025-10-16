public class DemoPrimitive2 {
  public static void main(String[] args) {
    
    //! Overflow
    short s1 = 30000;
    short s2 = 31000;
    //short s3 = s1 + s2; // short(byte) + short(byte) = int
    short s3 = (short)(s1 + s2);   //! (type)() force change type
    System.out.println(s3); //-4536    32xxx+1=-32xxx is a cycle

    int i1 = 2_100_000_000;
    int i2 = 100_000_000;
    long i4 = Long.valueOf(i1) + Long.valueOf(i2);
    int i3 = i1 + i2; //! overflow
    System.out.println(i3);// -2094967296
    System.out.println(i4);


    //! Promotion
    // byte->short->int->long->float->double
    byte b1 = 10;
    short s4 = b1;
    int i10 = s4;
    long l10 = i10;
    float f10 = l10;
    double d10 = f10;

    //! downcasting
    float f11 = (float)10.5d;

    long l12 = 2_200_000_000L;
    int i11 = (int)l12; //confirmed the risk
    System.out.println(i11); //-2094967296


    // char ->int
  }
  
}
