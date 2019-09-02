package day12_Scanner_01;

import java.util.Scanner;

/**
 * 
 * public Scanner(InputStream source)
 * public boolean hasNextXxx()
 * public Xxx nextXxx()
 *
 */

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x:" + x);
		}
		else {
			System.out.println("Wrong type");
		}
		
	}

}
