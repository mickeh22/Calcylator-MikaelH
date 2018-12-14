package Borde.Funka;

public class CalculatorAdvanced implements AdvancedInterface {

	public double PI(double x) {
		return Math.PI * x;
	}

	public double Random(double x) {
		return x / (Math.random()*20);
	}

	public double Cos(double x ) {
		return Math.cos(Math.toRadians(x));

	}

	public double Tan(double x ) {
		return Math.tan(Math.toRadians(x));

	}

	public double Sin(double x ) {
		return Math.sin(Math.toRadians(x));

	}

	public double Sqrt(double x ) {
		return Math.sqrt(x);

	}

}
