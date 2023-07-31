package hw;

import java.util.ArrayList;

public class HWDemo {

	public static void main(String[] args) {
		System.out.println("HW");

		ArrayList<String> teamList = new ArrayList<String>();

		teamList.add("Alex");
		teamList.add("Annelisse");
		teamList.add("Jorge");
		teamList.add("Sara");
		teamList.add("Winona");

		System.out.println("Team5: " + teamList);
		System.out.println("Team Size: " + teamList.size());
	}

	public static void fun(String a) {
		System.out.println("Java is fun!");
	}

	public static void getWeather() {
		System.out.println("Today is sunny");
	}

	public static void numFav(boolean a) {
		System.out.println("true");

	}

	public static void car() {
		System.out.println("Toyota");

	}

	public static void getDate() {
		System.out.println("Monday");
	}
	public static void getInfo() {
		System.out.println("Info");
	}
}
