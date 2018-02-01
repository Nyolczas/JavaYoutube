package bucky;

import java.util.*;

public class RandomGenerator {

	public static void main(String[] args) {
		Random dobokocka = new Random();
		
		for(int counter=1; counter<=10; counter++) {
			System.out.println(1+dobokocka.nextInt(6) + " ");
		}
	}

}
