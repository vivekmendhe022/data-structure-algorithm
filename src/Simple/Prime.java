package Simple;

import java.util.Iterator;

public class Prime {

	/*
	 * Algorithm 5: Check whether a number is prime or not
		Step 1: Start
		Step 2: Declare variables n, i, flag.
		Step 3: Initialize variables
		        flag ← 1
		        i ← 2  
		Step 4: Read n from the user.
		Step 5: Repeat the steps until i=(n/2)
		     5.1 If remainder of n÷i equals 0
		            flag ← 0
		            Go to step 6
		     5.2 i ← i+1
		Step 6: If flag = 0
		           Display n is not prime
		        else
		           Display n is prime
		Step 7: Stop 
	 */
	public static void main(String[] args) {
		int n=7;
		int flag=0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				flag++;
				break;
			}
		}
		if (flag==0) {
			System.out.println("n is prime");
		}else {
			System.out.println("n is not prime");
		}
		
		m();
	}
	
	static void m() {
		for (int i = 2; i < 10; i++) {
			boolean isPrime=true;
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i%j==0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i+" isPrime");
			}
		}
	}
	
}
