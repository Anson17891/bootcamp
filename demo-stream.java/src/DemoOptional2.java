
import java.util.Optional;

public class DemoOptional2 {
  //! Mis-use of Optional

  public static void main(String[] args) {
    //!eg1
    //sum(null,null);
    //int x = 23;
    //int y = 40;
    //sum(Optional.of(x), Optional.of(y));//! User has to construct Optional objext before using the method
  }

   //! Problem eg1
  //!What if smo passes null as parameters to call this method?
  //Primitive no need null checking
  public static int sum(Optional<Integer> x, Optional<Integer> y){
   //! null check for Optional object, ANY PROBLEM?   
   //!ans: Optional not used as parameter
   if(x.isPresent() && y.isPresent()) //! -> still can sum(null,null)
   return x.get()+y.get();
  return 0;
  }

  //! Correction eg1
  public static int sum2(Integer x, Integer y){
   //1. null check -> throw
   if(x==null || y==null)
   throw new IllegalArgumentException("x and y should not be null");
   return x + y;
  }
}
