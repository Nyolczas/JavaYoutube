package bucky;
import java.util.Scanner;


public class BasicCalculator {
	public static void main(String args[]) {
		Scanner beir = new Scanner(System.in);
		double elsoszam, masodikszam, valasz;
		System.out.println("Írd be az elsõ számot!");
		elsoszam = beir.nextDouble();
		System.out.println("Írd be a második számot!");
		masodikszam = beir.nextDouble();
		valasz = elsoszam + masodikszam;
		System.out.println("A két szám összege: " + valasz);
	}
}
