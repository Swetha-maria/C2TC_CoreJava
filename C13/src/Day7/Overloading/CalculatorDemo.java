package Day7.Overloading;

public class CalculatorDemo {

	public static void main(String[] args) {

		Calculation calc = new Calculation();
		
		System.out.println(calc.add(100, 20));
		System.out.println(calc.add(7.9f, 5.4f));
		System.out.println(calc.add(23.3, 3.2));
		System.out.println(calc.sub(100, 20));
		System.out.println(calc.sub(7.9f, 5.4f));
		System.out.println(calc.sub(23.3, 3.2));
		System.out.println(calc.mul(100, 20));
		System.out.println(calc.mul(7.9f, 5.4f));
		System.out.println(calc.mul(23.3, 3.2));
		System.out.println(calc.div(100, 20));
		System.out.println(calc.div(7.9f, 5.4f));
		System.out.println(calc.div(23.3, 3.2));
		System.out.println(calc.mod(100, 20));
		System.out.println(calc.mod(7.9f, 5.4f));
		System.out.println(calc.mod(23.3, 3.2));
		
	}

}