public class DemoWrapperClass2 {
  public static void main(String[] args) {
    
    //! dont use == for WrapperClass
    //! -128 to 127 -> cache
    Integer i10 = Integer.valueOf(127);
    Integer i11 = Integer.valueOf(127);
    System.out.println(i10 == i11); //true
    System.out.println(i10.equals(i11)); //true
    // <-128, >127
    Integer i12 = Integer.valueOf(128);
    Integer i13 = Integer.valueOf(128);
    System.out.println(i12 == i13); //!flase
    System.out.println(i12.equals(i13));//true

    //Short, Bytr, Long
    Long l10 = Long.valueOf(128);
    Long l11 = Long.valueOf(128);
    System.out.println(l10 == l11);//!flase
    System.out.println(l10.equals(l11));

    //Boolean
    Boolean b10 = true;
    Boolean b11 = new Boolean(true);
    Boolean b12 = Boolean.valueOf(true);
    Boolean b13 = Boolean.valueOf(true);

    System.out.println(b12 == b11);//!flase
    System.out.println(b12 == b13);//true


    // Character //!DIY


  }
  
}
