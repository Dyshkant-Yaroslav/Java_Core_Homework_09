package ua.lviv.desctop.part2;

public class Main {

	public static void main(String[] args) throws MyException, IllegalAccessException {
		Methods m = new Methods();

		try {
			m.add(-15, -9);
		} catch (Exception e) {
			System.err.println("You tried to use method add with wrong input values ");
			e.printStackTrace();
		}
		try {
			m.subs(0, 8);
		} catch (Exception e) {
			System.err.println("You tried to use method subs with wrong input values ");
			e.printStackTrace();
		}
		try {
			m.subs(9, 0);
		} catch (Exception e) {
			System.err.println("You tried to use method subs with wrong input values ");
			e.printStackTrace();
		}
		try {
			m.multi(0, 0);
		} catch (Exception e) {
			System.err.println("You tried to use method multi with wrong input values ");
			e.printStackTrace();
		}
		try {
			m.div(9, 14);
		} catch (Exception e) {
			System.err.println("You tried to use method subs with wrong input values ");
			e.printStackTrace();
		}

	}

}
