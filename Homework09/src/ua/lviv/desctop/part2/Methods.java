package ua.lviv.desctop.part2;

public class Methods {

	public void add(double a, double b) throws IllegalAccessException, MyException {
		useExceptions(a, b);
		System.out.println(a + b);
	}

	public void subs(double a, double b) throws IllegalAccessException, MyException {
		useExceptions(a, b);
		System.out.println(a - b);
	}

	public void multi(double a, double b) throws IllegalAccessException, MyException {
		useExceptions(a, b);
		System.out.println(a * b);
	}

	public void div(double a, double b) throws IllegalAccessException, MyException {
		useExceptions(a, b);
		System.out.println(a / b);
	}

	public void useExceptions(double a, double b) throws IllegalAccessException, MyException {
		if (a < 0 & b < 0) {
			throw new IllegalArgumentException();
		} else if (a == 0 & b != 0) {
			throw new ArithmeticException();
		} else if (a != 0 & b == 0) {
			throw new ArithmeticException();
		} else if (a == 0 & b == 0) {
			throw new IllegalAccessException();
		} else if (a > 0 & b > 0) {
			throw new MyException();
		}
	}

}
