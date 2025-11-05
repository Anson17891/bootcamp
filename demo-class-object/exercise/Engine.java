// Create two Java classes: Engine and Car.
// The Engine class should have:
// A private field horsepower (int).
// A constructor to initialize horsepower.
// A getter method for horsepower.
// The Car class should:
// Have a private field engine of type Engine.
// A private field model (String).
// A constructor to initialize both fields.
// A method getCarInfo() that returns a string with the car's model and engine horsepower.
// Then, write a main method to create an instance of Car and print its information using getCarInfo().
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Engine {
   private int horsepower;
    
public Engine(int horsepower){
    this.horsepower = horsepower;
}

public int getHorsepower(){
    return this.horsepower;
}

//Simulate starting the engine(1)
public void start(){
    	System.out.println("Engine with " + horsepower + " HP is starting... Vroom!");
	}

}
