package com.Insurance.LICInsurance;

/**
 * @author PiyushBodhani In simple words, == checks if both objects point to the
 *         same memory location whereas .equals() evaluates to the comparison of
 *         values in the objects.
 */
public class Task {
	public static void main(String args[]) {
		// -> This type of string is immutable
		String s1 = "Harshad";
		String s2 = "Harshad";
		// -> This type strings are mutable because they are stored in heap memory
		// location
		String s3 = new String("Harshad");
		Thread t = new Thread();

		System.out.println(s1 == s2); // true
		// -> Its false because of their memory location s3 is stored in
		// -> heap memory location area, while s1 is stored in normal memory location.
		// -> and == is will be true when memory of both s1 and s3 will be same,
		// -> rather than different
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true

		System.out.println('p' == 112.0);
		
		System.out.println(t.equals(s3));
		if("raj" == "raj") {
			
		}
		if("raj".equals("raj")) {
			
		}
	}
}
