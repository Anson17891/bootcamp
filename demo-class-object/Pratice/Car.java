
public class Car {
     private Engine engine;
    private String model;
    
public Car(Engine engine, String model){
    this.engine = engine;
    this.model = model;
}

public String getCarInfo(){
    return "Car's model : " + this.model + ", Engine horsepower: " + this.engine.getHorsepower() + ".";
}
//Simulate starting the engine(2)
public void startCar(){
    	System.out.println("Starting the car: " + model);
    	engine.start();
	}
//Add honk functionality
public void honk(){
    	System.out.println(model + " says: Honk! Honk!");
	}



public static void main(String[] args){
    Engine v6 = new Engine(180);
    Car volvo = new Car(v6, "Köttbulle");
    
        System.out.println(volvo.getCarInfo());
        volvo.startCar();
        volvo.honk();



}
}


