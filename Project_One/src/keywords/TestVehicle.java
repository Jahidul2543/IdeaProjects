package keywords;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("BMW");
		v1.showSpeedOfVehicle();
		
		MotorVehicle mv1 = new MotorVehicle("Toyota",90);
		mv1.showSpeedOfVehicle();
		mv1.fuelCapacity();

	}

}
