package Extracoding;

public class Butterflypattern {

	public static void main(String[] args) {
		int n = 10;

		for (int i = 1; i <= n; i++) {
		    // 1️⃣ Left stars
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    // 2️⃣ Spaces in middle
		    for (int j = 1; j <= 2*(n-i); j++) {
		        System.out.print(" ");
		    }

		    // 3️⃣ Right stars
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
		for (int i = n; i >= 1; i--) {
		    // 1️⃣ Left stars
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    // 2️⃣ Spaces in middle
		    for (int j = 1; j <= 2*(n-i); j++) {
		        System.out.print(" ");
		    }

		    // 3️⃣ Right stars
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}


	}

}
