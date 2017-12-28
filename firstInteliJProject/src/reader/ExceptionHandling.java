package reader;

import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		int num1 = 10, num2=20;
		try {
		int result = num1/1;
		System.out.println(result);
		}catch(Exception ex) {
			System.out.println("Hey ! you can not divide a number by zero. go laern math ");
		}
		System.out.println(num2);

	}

}
