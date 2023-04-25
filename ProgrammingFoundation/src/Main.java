import java.util.Scanner;

public class Main {
	
// with arg with retun
	
public static float add(float a , float b) {
	return a + b;
}
public static float sub(float a , float b) {
	return a - b;
}
public static float mul(float a , float b) {
	return a * b;
}
public static float div(float a , float b) {
	return a / b;
}

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		while(true) {
System.out.println("Enter the options based on choice " 
+ "1. Add \n 2. sub \n 3. mul \n 4. div \n 5. exit");	

int choice = scanner.nextInt();

switch (choice) {
case 1: {
	
	System.out.println("addition case");
	System.out.println("Pls enter 2 numbers ");
	float number1 = scanner.nextFloat();
	float number2= scanner.nextFloat();
	
	System.out.println(number1);
	System.out.println(number2);
	
	float result = add(number1,number2);
	
	System.out.println("addition result"+result);
}
	break;
case 2: {
	
	System.out.println("Subraction case");
	System.out.println("Pls enter 2 numbers ");
	float number1 = scanner.nextFloat();
	float number2= scanner.nextFloat();
	
	System.out.println(number1);
	System.out.println(number2);
	
	float result = sub(number1,number2);
	
	System.out.println("Subtract result"+result);
}
	break;
case 3: {
	
	System.out.println("Multiply case");
	System.out.println("Pls enter 2 numbers ");
	float number1 = scanner.nextFloat();
	float number2= scanner.nextFloat();
	
	System.out.println(number1);
	System.out.println(number2);
	
	float result = mul(number1,number2);
	
	System.out.println("Multiply result"+result);
}
	break;
case 4: {
	
	System.out.println("Divide case");
	System.out.println("Pls enter 2 numbers ");
	float number1 = scanner.nextFloat();
	float number2= scanner.nextFloat();
	
	System.out.println(number1);
	System.out.println(number2);
	
	float result = div(number1,number2);
	
	System.out.println("divide result"+result);
}
	break;
case 5: {
	System.out.println("5");
	System.exit(0);
}

break;
default: {
	System.out.println("default case");
}
break;
}
		}
		
// TODO Auto-generated method stub

	}
	private static float divide(float number1, float number2) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static float Multiply(float number1, float number2) {
		// TODO Auto-generated method stub
		return 0;
	}
	private static float subtract(float number1, float number2) {
		// TODO Auto-generated method stub
		return 0;
	}

}