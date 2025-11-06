// Create two Java classes: Battery and Smartphone.


// The Battery class should have:

// A private field capacity (in mAh, int).
// A private field chargeLevel (percentage, double).
// A constructor to initialize both fields.
// Getter methods for both fields.
// A method drain(double amount) that reduces the charge level by the given percentage.

// The Smartphone class should:

// Contain a private Battery object.
// A private field brand (String).
// A constructor to initialize both fields.
// A method usePhone(double usage) that simulates battery drain.
// A method getStatus() that returns the brand and current battery level.



// Then, write a main method to create a Smartphone object and simulate using the phone.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Battery {
      private int capacity;
    private double chargeLevel;
    
public Battery(int capacity, double chargeLevel){
    this.capacity = capacity;
    this.chargeLevel = chargeLevel;
}
public int getCapacity(){
    return this.capacity;
}
public double getChargeLevel(){
    return this.chargeLevel;
}
public void drain(double amount){

    this.chargeLevel = BigDecimal.valueOf(this.chargeLevel).subtract(BigDecimal.valueOf(amount))
.max(BigDecimal.ZERO) //privent negative num
.setScale(2, RoundingMode.HALF_UP)
.doubleValue();

}

}
