//! if a class extending Exception/RuntimeException, can throw this exception object
//!Checked Exception -> a class extends Exception (must have try-exception)
//!"Uncheck Exception"-> a class extends RuntimeException( no need try-catch)
//DIY a exception
//eg. unreasonable moey transfer->throw exception-> freeze a account
public class BusinessException extends RuntimeException {
  //if code+message? ->see SysError.java
  private int code;


  public BusinessException(SysError sysError){ //encapsulation
    super(sysError.getMessage()); //<- new RuntimeException("abc");
  }
  public static void main(String[] args) {
    throw new BusinessException(SysError.CUSTOMER_NOT_FOUND);
  }
}
