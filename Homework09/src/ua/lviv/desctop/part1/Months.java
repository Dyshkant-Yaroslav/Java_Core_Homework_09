package ua.lviv.desctop.part1;

import ua.lviv.desctop.part1.Seasons;

public enum Months {
	JANUARY(31, Seasons.WINTER),
	FEBRUARY(29, Seasons.WINTER),
	MARCH(31, Seasons.SPRING),
	APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING),
	JUNE(30, Seasons.SUMMER),
	JULY(31, Seasons.SUMMER),
	AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.FALL),
	OKTOBER(31, Seasons.FALL),
	NOVEMBER(30, Seasons.FALL),
	DECEMBER(31, Seasons.WINTER);

	int days;
	Seasons s;

	private Months(int days, Seasons s) {
		this.days = days;
		this.s = s;
	}

	public int getDays() {
		return days;
	}

	public Seasons getS() {
		return s;
	}

}
