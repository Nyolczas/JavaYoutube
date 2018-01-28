import java.util.Scanner;

public class MultipleClasses {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ElsoOsztaly elso = new ElsoOsztaly();
		System.out.println("Írd ide az elsõ csajod nevét:");
		String temp = input.nextLine();
		elso.setName(temp);
		elso.saying();
	}
}
