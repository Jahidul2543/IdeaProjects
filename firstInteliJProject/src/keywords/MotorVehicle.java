package keywords;

public class MotorVehicle extends Vehicle{

	public MotorVehicle() {
		super();
	}
	public MotorVehicle(String name,int age) {
		super(name,age);
	}
	public void fuelCapacity() {
		showSpeedOfVehicle();
		super.name = "Ali Star";
		System.out.println(name);
	}
}
