package bucky;
import java.util.Scanner;


public class BasicCalculator {
	public static void main(String args[]) {
		Scanner beir = new Scanner(System.in);
		double elsoszam, masodikszam, valasz;
		System.out.println("�rd be az els� sz�mot!");
		elsoszam = beir.nextDouble();
		System.out.println("�rd be a m�sodik sz�mot!");
		masodikszam = beir.nextDouble();
		valasz = elsoszam + masodikszam;
		System.out.println("A k�t sz�m �sszege: " + valasz);
	}
}
