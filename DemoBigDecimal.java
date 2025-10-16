
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    
    //! problem
    System.out.println(0.2 + 0.1); //! 0.30000000000000004
    System.out.println(0.3 - 0.1); //! 0.19999999999999998
    System.out.println(0.1 * 0.2); //! 0.020000000000000004
    System.out.println(0.3 / 0.1); //! 2.9999999999999996

    System.out.println(0.1 + 0.3);//0.4, some cases are ok

    //!/\solution (BigDecimal)
    BigDecimal bd = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal bd3 = bd.add(bd2);
    System.out.println(bd3.doubleValue());//0.3

    //!subtract
    System.out.println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue());
    //alt
    double x = 0.3;
    double y = 0.1;
    double result = BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y)).doubleValue();
    System.out.println(result);
    
    //!multiply
    double a = 0.1;
    double b = 0.2;
    result = BigDecimal.valueOf(a)//
    .multiply(BigDecimal.valueOf(b))//
    .doubleValue();
    System.out.println(BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)).doubleValue());

    result = BigDecimal.valueOf(0.125).multiply(BigDecimal.valueOf(0.35)) //
    .setScale(2, RoundingMode.HALF_UP)//
    .doubleValue();
    System.out.println(result); //0.4


    //!devision (non-terminated decimal place 0.33333...)  //!divide(BigDecimal, decimalPlaces, roundupMode)
    double e = 10.0;
    double f = 3.0;
    result = BigDecimal.valueOf(e) //
      .divide(BigDecimal.valueOf(f), 2, RoundingMode.HALF_UP) // Half = 5, half up: 0.5=1, 
      .doubleValue(); 
    System.out.println(result);

    result = BigDecimal.valueOf(0.5) //
      .divide(BigDecimal.valueOf(4.0), 2, RoundingMode.HALF_UP)
      .doubleValue();
      System.out.println(result); //0.13 (0.125,2dp half up)

    result = BigDecimal.valueOf(0.5) //
      .divide(BigDecimal.valueOf(4.0), 2, RoundingMode.HALF_DOWN) //half down: 0.5 = 0
      .doubleValue();
      System.out.println(result); //0.12 (0.125,2dp half down)

  }
}