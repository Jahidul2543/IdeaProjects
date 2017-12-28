package keywords;

public class TestHouseStatic {

	    public static void main(String [] args) {
		NadiaNRubyHouse nadia = new NadiaNRubyHouse();
		nadia.driveWay = 11;
		System.out.println("drive way size of Nadia : " + nadia.driveWay);

		NadiaNRubyHouse ruby = new NadiaNRubyHouse();
		ruby.driveWay = 10;
		System.out.println("drive way size of Ruby: " +ruby.driveWay);
		System.out.println("drive way size of Nadia : " + nadia.driveWay);
		
		NadiaNRubyHouse.houseSize();
		PropertyManagement.heatingSystem();
		

	}

}
