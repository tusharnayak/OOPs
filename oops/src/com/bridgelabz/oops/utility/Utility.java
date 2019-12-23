package com.bridgelabz.oops.utility;

import java.util.Scanner;

public class Utility {
	
		private final static Scanner sc = new Scanner(System.in);

		public static int intScanner() {
			return sc.nextInt();
		}

		public static boolean booleanScanner() {
			return sc.nextBoolean();
		}

		public static float floatScanner() {
			return sc.nextFloat();

		}

		public static double doubleScanner() {
			return sc.nextDouble();
		}

		public static String StringScanner() {
			return sc.next();
		}
	

}
