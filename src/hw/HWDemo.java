package hw;

import java.util.ArrayList;
import java.util.HashMap;

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

		HashMap<String, String> stateMap = new HashMap<String, String>();
		stateMap.put("VA", "Virginia");
		stateMap.put("NY", "New York");
		System.out.println(stateMap);

		stateMap.put("FL", "Florida");
		System.out.println(stateMap);
		
		HashMap<String, Double> priceMap = new HashMap<String, Double>();
		priceMap.put("Iphone", 999.99);
		priceMap.put("MacBook", 1999.99);
		System.out.println(priceMap.get("Iphone"));
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

	public static void fun(String a) {
		System.out.println("Java is fun!");
	}

	public static void getWeather() {
		System.out.println("Today is sunny");
	} 
	
	public static void getColor() {
		System.out.println("RED");
	} 
}
