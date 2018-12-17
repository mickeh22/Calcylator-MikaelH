package Borde.Funka;

import java.util.Random;
import java.util.logging.Logger;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class TestCase{
	CalculatorBasic Mikael = new CalculatorBasic();
	CalculatorAdvanced Mikael2 = new CalculatorAdvanced();
	public static final Logger Log = Logger.getLogger(KalkylatorMain.class.getName());
	double a, b, oracle;
	Random rand = new Random();
	
	@Test 
	public void addi50() {
		for (int i = 0; i < 50; i++) 
		{
			a = rand.nextDouble()*10;
			b = rand.nextDouble()*10;
			oracle = a + b;
			assertEquals(Mikael.addition(a,b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}

	@Test 
	public void addi50_negative() {
		for (int i = 0; i < 50; i++) 
		{
			a = -rand.nextDouble()*10;
			b = rand.nextDouble()*10;
			oracle = a + b;
			assertEquals(Mikael.addition(a,b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void addi50_zero() {
		for (int i = 0; i < 50; i++) 
		{
			a = 0;
			b = rand.nextDouble()*10;
			oracle = a + b;
			assertEquals(Mikael.addition(a,b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void sub50() {
		for (int i = 0; i < 50; i++) 
		{
			a = rand.nextDouble()*10;
			b = rand.nextDouble()*10;
			oracle = a - b;
			assertEquals(Mikael.subtraction(a,b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void sub50_negative() {
		for (int i = 0; i < 50; i++) 
		{
			a = -rand.nextDouble()*10;
			b = rand.nextDouble()*10;
			oracle = a - b;
			assertEquals(Mikael.subtraction(a,b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void sub50_zero() {
		for (int i = 0; i < 50; i++) 
		{
			a = 0;
			b = rand.nextDouble()*10;
			oracle = a - b;
			assertEquals(Mikael.subtraction(a,b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void mul50() {
		for (int i = 0; i < 50; i++) 
		{
			a = rand.nextDouble()*10;
			b = rand.nextDouble()*10;
			oracle = a * b;
			assertEquals(Mikael.multiplication(a, b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	@Test 
	public void mul50_negative() {
		for (int i = 0; i < 50; i++) 
		{
			a = -rand.nextDouble()*10;
			b = rand.nextDouble()*10;
			oracle = a * b;
			assertEquals(Mikael.multiplication(a, b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	@Test 
	public void mul50_zero() {
		for (int i = 0; i < 50; i++) 
		{
			a = 0;
			b = rand.nextDouble()*10;
			oracle = a * b;
			assertEquals(Mikael.multiplication(a, b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void div50() {
		for (int i = 0; i < 50; i++) 
		{
			a = rand.nextDouble()*10;
			b = rand.nextDouble()*10 + 1; // Ska aldrig bli noll
			oracle = a / b;
			assertEquals(Mikael.division(a, b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void div50_negative() {
		for (int i = 0; i < 50; i++) 
		{
			a = -rand.nextDouble()*10;
			b = rand.nextDouble()*10 + 1; // Ska aldrig bli noll
			oracle = a / b;
			assertEquals(Mikael.division(a, b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void div50_zero() {
		for (int i = 0; i < 50; i++) 
		{
			a = 0;
			b = rand.nextDouble()*10 + 1; // Ska aldrig bli noll
			oracle = a / b;
			assertEquals(Mikael.division(a, b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void div50_divide_by_zero() {
		for (int i = 0; i < 50; i++) 
		{
			a = rand.nextDouble()*10;
			b = 0;
			oracle = a / b; // Blir Infinity
			assertEquals(Mikael.division(a, b),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
	
	@Test 
	public void div50_cos() {
		for (int i = 0; i < 50; i++) 
		{
			a = rand.nextDouble()*10;
			oracle = Math.cos(Math.toRadians(a));
			assertEquals(Mikael2.Cos(a),oracle,0);
			Log.info("Jag testar addition med ");
		}
		
	}
}
