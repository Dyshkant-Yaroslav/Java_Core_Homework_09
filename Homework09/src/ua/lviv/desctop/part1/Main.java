/*
 * Logos IT Academy
 * Homework 9: exceptions, java code convention
 */

package ua.lviv.desctop.part1;

import java.util.Scanner;

/**
 * Main class
 * 
 * @author Yaroslav
 * @version 08.07.2020.final
 */
public class Main {

	public static void main(String[] args) throws WrongInputConsoleParametersException {

		/* Initialization scanner, creating arrays from enumerations */
		Scanner sc = new Scanner(System.in);
		Months[] mas = Months.values();
		Seasons[] mas1 = Seasons.values();

		/* Crating an endless loop */
		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month:");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase(); // make the register not important
				boolean flag = isMonthPresent(mas, month);
				if (!flag) {
					throw new WrongInputConsoleParametersException("Month doesnt exist");
				}
				break;
			}
			case "2": {
				System.out.println("Enter season:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = false;

				for (Months months : mas) {
					if (months.getS().name().equals(season)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons s = Seasons.valueOf(season);
					for (Months months : mas) {
						if (months.getS().toString().equalsIgnoreCase(season)) {
							System.out.println(months);
						}
					}
				}
				if (!flag) {
					throw new WrongInputConsoleParametersException("Season doesnt exist");
				}
				break;
			}

			case "3": {
				System.out.println("enter value of days(30,31,29):");
				sc = new Scanner(System.in);
				int val = sc.nextInt();
				for (Months months : mas) {
					if (val < 29) {
						throw new WrongInputConsoleParametersException("incorrect value");
					} else if (val > 31) {
						throw new WrongInputConsoleParametersException("incorrect value");
					} else if (months.getDays() == val) {
						System.out.println(months);

					}
				}
				break;

			}

			case "4": {
				System.out.println("enter value of days(30,31,29):");
				sc = new Scanner(System.in);
				int val = sc.nextInt();
				for (Months months : mas) {
					if (val == 29) {
						System.out.println("a month with less days does not exist");
						break;
					} else if (val > 31) {
						throw new WrongInputConsoleParametersException("incorrect value");
					} else if (val < 29) {
						throw new WrongInputConsoleParametersException("incorrect value");
					} else if (months.getDays() < val) {
						System.out.println(months);
					}
				}
				break;
			}
			case "5": {
				System.out.println("enter value of days(30,31,29):");
				sc = new Scanner(System.in);
				int val = sc.nextInt();
				for (Months months : mas) {
					if (val == 31) {
						System.out.println("a month with fewer days does not exist");
						break;
					} else if (val > 31) {
						throw new WrongInputConsoleParametersException("incorrect value");
					} else if (val < 29) {
						throw new WrongInputConsoleParametersException("incorrect value");
					} else if (months.getDays() > val) {
						System.out.println(months);
					}
				}
				break;

			}
			case "6": {
				System.out.println("Enter season:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = ifSeasonExist(mas1, season);

				if (flag) {
					Seasons s1 = Seasons.valueOf(season);
					int ordinal = s1.ordinal();
					if (ordinal == (mas1.length - 1)) {
						ordinal = 0;
						System.out.println("The next season is: " + (mas1[ordinal]));
					} else {
						System.out.println("The next season is: " + (mas1[ordinal + 1]));
					}
				}

				if (!flag) {

					throw new WrongInputConsoleParametersException("this season doesnt exist");
				}

				break;
			}

			case "7": {
				System.out.println("Enter season:");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = ifSeasonExist(mas1, season);

				if (flag) {
					Seasons s1 = Seasons.valueOf(season);
					int ordinal = s1.ordinal();
					if (ordinal == 0) {
						ordinal = 3;
						System.out.println("The previous season is: " + (mas1[ordinal]));
					} else {
						System.out.println("The previous season is: " + (mas1[ordinal - 1]));
					}
				}

				if (!flag) {
					throw new WrongInputConsoleParametersException("this season doesnt exist");
				}

				break;
			}
			case "8": {
				for (Months months : mas) {

					if (months.getDays() % 2 == 0) {
						System.out.println("Month with a pair of days: " + (months));
					}
				}
				break;
			}

			case "9": {
				for (Months months : mas) {
					if (months.getDays() % 2 == 1) {
						System.out.println("Months with an unpaired number of days: " + (months));
					}
				}
				break;
			}

			case "10": {
				System.out.println("Enter month:");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = isMonthPresent(mas, month);
				int value;
				if (flag) {
					for (Months months : mas) {
						if (months.name().equals(month)) {
							value = months.getDays();
							if (value % 2 == 0) {
								System.out.println("Month is with a pair of days");
							} else {
								System.out.println("Months is with an unpaired number of days");
							}
						}
					}

				}

				if (!flag) {
					throw new WrongInputConsoleParametersException("This month does not exists");
				}

				break;
			}
			}
		}

	}

	/**
	 * Method equals entered String from scanner with array values
	 * 
	 * @param mas1
	 * @param season
	 * @return boolean value of flag
	 */
	private static boolean ifSeasonExist(Seasons[] mas1, String season) {
		boolean flag = false;
		for (Seasons seasons : mas1) {
			if (seasons.name().equals(season)) {
				System.out.println("Season exist");
				flag = true;
			}
		}
		return flag;
	}

	/**
	 * Method equals entered String from scanner with array values
	 * 
	 * @param mas
	 * @param month
	 * @return boolean value of flag
	 */
	private static boolean isMonthPresent(Months[] mas, String month) {
		boolean flag = false;
		for (Months months : mas) {
			if (months.name().equals(month)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}

	/**
	 * Void method displays key and their meanings on console
	 */
	static void menu() {
		System.out.println("Натисніть 1 щоб: Перевірити чи є такий місяць");
		System.out.println("Натисніть 2 щоб: Вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3 щоб: Вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 4 щоб: Вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 5 щоб: Вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 6 щоб: Вивести на екран наступну пору року");
		System.out.println("Натисніть 7 щоб: Вивести на екран попередню пору року");
		System.out.println("Натисніть 8 щоб: Вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 9 щоб: Вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 10 щоб: Вивести на екран чи введений з консолі місяць має парну кількість днів");
	}

}
