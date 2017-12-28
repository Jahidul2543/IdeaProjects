package keywords;

public class Vehicle {
  String name;
	public Vehicle() {
		System.out.println("people use vehicle to travel");
	}
	public Vehicle(String name) {
		this.name = name;
		System.out.println(name);
	}
	public Vehicle(String name, int age) {
		this.name = name;
		System.out.println(name);
	}
	public final void showSpeedOfVehicle() {
		System.out.println("Runs in 60 m/h");
	}
}
