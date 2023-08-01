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
		stateMap.put("FL", "Florida");
		stateMap.put("AZ", "Arizona");
		System.out.println(stateMap);

		HashMap<String, Double> priceMap = new HashMap<String, Double>();
		priceMap.put("Iphone", 999.99);
		priceMap.put("MacBook", 1999.99);
		System.out.println("Iphone price: " + priceMap.get("Iphone"));

		ArrayList<String> teamLectures = new ArrayList<String>();

		teamLectures.add("Software Testing");
		teamLectures.add("Java");
		teamLectures.add("Git");
		teamLectures.add("SQL");
		teamLectures.add("Functional Testing");
		teamLectures.add("Maven & Jenkins");
		teamLectures.add("Selenium");
		teamLectures.add("Cucumber");
		teamLectures.add("Framework");
		teamLectures.add("JUnit & Testing");
		teamLectures.add("API");

		System.out.println("Team5: " + teamLectures);

		String arr[] = { "Java", "Git", "SQL" };
		System.out.println(arr[1]);

		ArrayList<String> daysOfTheWeek = new ArrayList<String>();

		daysOfTheWeek.add("Monday");
		daysOfTheWeek.add("Tuesday");
		daysOfTheWeek.add("Wednesday");
		daysOfTheWeek.add("Thursday");
		daysOfTheWeek.add("Friday");
		daysOfTheWeek.add("Saturday");
		daysOfTheWeek.add("Sunday");

		System.out.println("Days of the Week: " + daysOfTheWeek);

		fun("Java");
		getWeather();
		numFav(true);
		car("Toyota");
		getDate();
		getInfo("Santana", "Tucson");
		getColor();
		favPhone("Iphone");
		gator();
	}

	public static void fun(String a) {
		System.out.println(a + " is fun!");
	}

	public static void getWeather() {
		System.out.println("Today is sunny");
	}

	public static void numFav(boolean a) {
		System.out.println(a);
	}

	public static void car(String make) {
		System.out.println(make);
	}

	public static void getDate() {
		System.out.println("Tuesday");
	}

	public static void getInfo(String lastName, String city) {
		System.out.println(lastName + " lives in " + city);
	}

	public static void getColor() {
		System.out.println("RED");
	}

	public static void favPhone(String device) {
		System.out.println(device);
	}

	public static void gator() {
		System.out.println("Gator");
		
		/*
		 * 
                _ ___                /^^\ /^\  /^^\_
    _          _@)@) \            ,,/ '` ~ `'~~ ', `\.
  _/o\_ _ _ _/~`.`...'~\        ./~~..,'`','',.,' '  ~:
 / `,'.~,~.~  .   , . , ~|,   ,/ .,' , ,. .. ,,.   `,  ~\_
( ' _' _ '_` _  '  .    , `\_/ .' ..' '  `  `   `..  `,   \_
 ~V~ V~ V~ V~ ~\ `   ' .  '    , ' .,.,''`.,.''`.,.``. ',   \_
  _/\ /\ /\ /\_/, . ' ,   `_/~\_ .' .,. ,, , _/~\_ `. `. '.,  \_
 < ~ ~ '~`'~'`, .,  .   `_: ::: \_ '      `_/ ::: \_ `.,' . ',  \_
  \ ' `_  '`_    _    ',/ _::_::_ \ _    _/ _::_::_ \   `.,'.,`., \-,-,-,_,_,
   `'~~ `'~~ `'~~ `'~~  \(_)(_)(_)/  `~~' \(_)(_)(_)/ ~'`\_.._,._,'_;_;_;_;_;

		 */
	}
}
