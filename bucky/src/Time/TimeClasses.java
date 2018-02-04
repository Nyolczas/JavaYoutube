package Time;

public class TimeClasses {

	public static void main(String[] args) {
		miliary kvarcora = new miliary();
		System.out.println(kvarcora.toMilitary());
		kvarcora.setTime(16, 29, 5);
		System.out.println(kvarcora.toMilitary());
	}

}
