import java.util.Scanner;

public class MultipleClasses {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ElsoOsztaly elso = new ElsoOsztaly();
		System.out.println("�rd ide az els� csajod nev�t:");
		String temp = input.nextLine();
		elso.setName(temp);
		elso.saying();
	}
}
