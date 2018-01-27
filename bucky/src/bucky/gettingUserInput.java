package bucky;

import java.util.Scanner;

public class gettingUserInput {
	public static void main(String args[]){
		System.out.println("Hogy hívják a te nevedet vazze?");
		Scanner bucky = new Scanner(System.in);
		System.out.println("Hello " + bucky.nextLine() + " !");
	}
}
