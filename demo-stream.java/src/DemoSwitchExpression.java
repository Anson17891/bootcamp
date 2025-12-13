public class DemoSwitchExpression {
  public static void main(String[] args) {
    //Switch (Java 1.0)
    //Disadvantage : 
    //1. No range checking
    //2. proactively break

    char grade ='B';
    switch(grade){
      case 'A':
        System.out.println("Doing smth for grade A.");
        break;  //2. proactively break
      case 'B':
        System.out.println("Doing smth for grade B.");
        break;
      case 'C':
        System.out.println("Doing smth for grade C.");
        break;
      default: //else
        System.out.println("Doing something for other grafes...");
    }

    //Not good number checking, -> No range checking
    int score = 80;
    char examGrade = ' ';
      switch(score){
        case 80:
          examGrade = 'B';
          break;
        case 81: 
          examGrade = 'B';
          break;
          //...
          default:
            break;
      }
//----------------20 years later-----------------------------

  // Java 14 : Expression
   Color[] colors = new Color[]{Color.RED,Color.RED,Color.BLUE,Color.YELLOW};
   int sum = 0;
   for(Color c : colors){
    //color -> int
    //sum
    //! 1. enum + Switch expression -> Java check if all enum values have been considered. & avoid duplicate enum value
       //but still no range checking -> suitable for enum (limited choice)
    //! 2. simple logic for returning value
    //! 3. can assign return type internally or just being void method  aka "int value =" switch(c)
    int value = switch(c){ //if one of the enum value missed, compile time error
      case RED -> 7;
      case YELLOW -> 9;
      case BLUE -> 15; 
    };
    sum += value;
   }
System.out.println("sum=" + sum);//sum=38

   //Convert String
   String day = "Tuesday";

   String dayDescription = switch(day){
    case "Monday", "Tuesday", "Wendesday", "Thursday", "Friday" -> "Weekday"; //!"," = or
    case "Saturday", "Sunday" -> "Weekend";
    default -> "Unknown";//!Force to use default when apply String for Switch expression
   };
System.out.println("Day Descrption=" + dayDescription);//Day Descrption=Weekday


  //! yield & ->
  //! if the logic has only 1 line use "->"
  //! more than one line: {} + yield
  //"yield" similar to return, "yield" for switch only
  Direction d1 = Direction.WEST;
  int value = switch(d1){
    // case EAST ->{
    //   System.out.println("hello");
    //   yield 10;}
    case EAST:
        yield 10;
    case SOUTH:
        yield 20;
    case WEST:
        yield 30;
    case NORTH:
        yield 40;

  };

  }



  public static int converDirection(Direction direction){
    int value = switch(direction){
    case EAST:
      yield 10;
    case SOUTH:
      yield 20;
    case WEST:
      yield 30;
    case NORTH:
      yield 40;
  };
  return value;  //to distinguish "return" in switch or return in method
  }
  
  public static enum Direction{
    EAST,WEST,SOUTH,NORTH;
  }
  public static enum Color{
    RED,BLUE,YELLOW;
  }
}
