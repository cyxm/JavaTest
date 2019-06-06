package com.un.javatest;

import java.text.DateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		printCalendar(calendar);
	}

	public static final void printCalendar(Calendar calendar) {

		DateFormat df = DateFormat.getDateTimeInstance();

		System.out.println(df.format(calendar.getTime()));
		System.out.println(calendar.toString());

		int year = calendar.get(Calendar.YEAR);
		int mouth = calendar.get(Calendar.MONTH);
		//		int day = calendar.get(Calendar.DATE);
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		System.out.println("year:" + year + ";");
		System.out.println("mouth:" + mouth + ";");
		System.out.println("day:" + day + ";");

		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("dayOfYear:" + dayOfYear + ";");

		//星期相关
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		int firstDayOfWeek = calendar.getFirstDayOfWeek();
		System.out.println("firstDayOfWeek:" + firstDayOfWeek + ";");

	}
}
