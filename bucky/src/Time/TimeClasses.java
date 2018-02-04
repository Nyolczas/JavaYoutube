package Time;

public class TimeClasses {

	public static void main(String[] args) {
		TimeFormat kvarcora = new TimeFormat();
		System.out.println(kvarcora.toMilitary());
		kvarcora.setTime(16, 29, 5);
		System.out.println(kvarcora.toMilitary());
		System.out.println(kvarcora.toAmerikai());
	}

}
