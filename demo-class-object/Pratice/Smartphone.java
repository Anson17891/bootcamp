public class Smartphone {
  private Battery battery;
    private String brand;
    
public Smartphone(Battery battery, String brand){
    this.battery = battery;
    this.brand = brand;
}

public void usePhone(double usage){
    this.battery.drain(usage);
    System.out.println("The phone is using...");
    System.out.println("Battery level is now: " + this.battery.getChargeLevel());
}
//Add showBatteryBar() Method
public void showBatteryBar() {
	int totalBars = 20; // total segments in the bar
	int filledBars = (int) (battery.getChargeLevel() / 100 * totalBars);

	StringBuilder bar = new StringBuilder("[");
	for (int i = 0; i < totalBars; i++) {
    	if (i < filledBars) {
        	bar.append("█"); // filled segment
    	} else {
        	bar.append("░"); // empty segment
    	}
	}
	bar.append("] ");
	bar.append(String.format("%.2f%%", battery.getChargeLevel()));

	System.out.println("Battery Level: " + bar.toString());
}


public static void main(String[] args){
    Battery b1 = new Battery(1000, 100.0);
    Smartphone p1 = new Smartphone (b1, "samsung");
    p1.usePhone(20.0);
p1.showBatteryBar();
}

}
