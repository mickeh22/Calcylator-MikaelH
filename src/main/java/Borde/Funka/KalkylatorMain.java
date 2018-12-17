package Borde.Funka;
import java.util.Scanner;

public class KalkylatorMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, Val;
		System.out.println("V�lkommen till Mikaels Kalkulator ");
		System.out.print("Ange ett nummer:");
		a = scan.nextDouble();

		System.out.println("Ange en metod");
		System.out.println("1. Addition");
		System.out.println("2. Subtraktion");
		System.out.println("3. Division");
		System.out.println("4. Multiplikation");
		System.out.println("5. PI");
		System.out.println("6. Cos");
		System.out.println("7. Tan");
		System.out.println("8. Sin");
		System.out.println("9. Sqrt");
		System.out.println("10. Cbrt");

		Val = scan.nextDouble();
		while (Val > 11) {
			System.out.print("Ange r�tt tal");
			Val = scan.nextDouble();

		}

		BasicInterface Mikael = new CalculatorBasic();
		AdvancedInterface Mikael2 = new CalculatorAdvanced();
		if (Val == 1) {
			System.out.print("Ange ett andra nummer:");
			b = scan.nextDouble();
			c = Mikael.addition(a, b);
			System.out.print("Talet blir " + c);

		} else if (Val == 2) {
			System.out.print("Ange ett andra nummer:");
			b = scan.nextDouble();
			c = Mikael.subtraction(a, b);
			System.out.print("Talet blir " + c);

		} else if (Val == 3) {
			System.out.print("Ange ett andra nummer:");
			b = scan.nextDouble();
			if (b == 0) {
				System.out.println("Du får inte dela med noll");
			} else {
				c = Mikael.division(a, b);
				System.out.print("Talet blir " + c);
			}
		} else if (Val == 4) {
			System.out.print("Ange ett andra nummer:");
			b = scan.nextDouble();
			c = Mikael.multiplication(a, b);
			System.out.print("Talet blir " + c);
		} else if (Val == 5) {
			c = Mikael2.PI(a);
			System.out.print("Talet blir " + c);
		} else if (Val == 6) {
			c = Mikael2.Cos(a);
			System.out.print("Talet blir " + c);
		} else if (Val == 7) {
			c = Mikael2.Tan(a);
			System.out.print("Talet blir " + c);
		} else if (Val == 8) {
			c = Mikael2.Sin(a);
			System.out.print("Talet blir " + c);
		} else if (Val == 9) {
			if (a < 0) {
				System.out.println("Du f�r inte r�kna p� negativa tal");
			} else {
				c = Mikael2.Sqrt(a);
				System.out.print("Talet blir " + c);
			}
		}
		else if (Val == 10) {
			if (a < 0) {
				System.out.println("Du f�r inte r�kna p� negativa tal");
			} else {
				c = Mikael2.Cbrt(a);
				System.out.print("Talet blir " + c);
			}
		}
		scan.close();
	}

}
