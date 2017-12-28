package nestedclass;

public class OutterClass {
	public String name="Milan is dead wrong";
	int num1 = 10;
	InnerClassA innerA = new InnerClassA();
	InnerClassB innerB = new InnerClassB();
	public void showName() {
		System.out.println(num1);
		innerA.showValueOfInnerA();
		innerB.showValueOfInnerB();
	}
	
	//First Inner class
	public class InnerClassA{
		String valueOfInnerA;
		InnerClassB innerB = new InnerClassB();
		public void showValueOfInnerA() {
			System.out.println(num1);
			innerB.showValueOfInnerB();
			System.out.println("This is InnerA method");
			
		}
		
	}//InnerClassA ends here
	
	//Second Inner class
	private class InnerClassB{
		String valueOfInnerB;
		public void showValueOfInnerB() {
			System.out.println("This is InnerB method");
		}
			
	}//InnerClassB ends here

}//Outer class ends
