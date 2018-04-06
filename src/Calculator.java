import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		scan.close();
		}
	
	 public double addition(double x, double y) {
		  return x + y;
		 }
		  
		 public double subtraction(double x, double y) {
		  return x - y;
		 }
		  
		 public double multiplication(double x, double y) {
		  return x * y;
		 }
		  
		 public double division(double x, double y) { 
		  if(y == 0) {
		   throw new ArithmeticException();
		  }
		  return x / y;
		 }
	}


