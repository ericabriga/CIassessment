import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	 
	 private Calculator calculate;
	  
	 @Before
	 public void setUp() throws Exception {
		 calculate = new Calculator();
	 }
	 
	 @After
	 public void tearDown() throws Exception {
		 calculate = null;
	 }
	 
	 @Test
	 public void AdditionTest() {
	  double result = calculate.addition(33, 20.32);
	  assertEquals(53.32, result, 0);
	 }
	 
	 @Test
	 public void SubtractionTest() {
	  double result = calculate.subtraction(80, 70.25);
	  assertEquals(9.75, result, 0);
	 }
	 
	 @Test
	 public void MultiplicationTest() {
	  double result = calculate.multiplication(3.6, 50);
	  assertEquals(180, result, 0);
	 }
	 
	 @Test
	 public void DivisionTest() {
	  double result = calculate.division(100, 10);
	  assertEquals(10, result, 0.001);
	   
	 }
	  
	 @Test(expected = ArithmeticException.class)
	 public void DivideByZeroTest() {
		 calculate.division(100.5, 0);
	 }
	 
	
	}


