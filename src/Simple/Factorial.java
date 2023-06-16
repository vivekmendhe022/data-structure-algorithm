package Simple;

public class Factorial {
	/*
	 * Algorithm 4: Find the factorial of a number
		Step 1: Start
		Step 2: Declare variables n, factorial and i.
		Step 3: Initialize variables
		          factorial ← 1
		          i ← 1
		Step 4: Read value of n
		Step 5: Repeat the steps until i = n
		     5.1: factorial ← factorial*i
		     5.2: i ← i+1
		Step 6: Display factorial
		Step 7: Stop
	 */
	public static void main(String[] args) {
		int n=5; // 5*4*3*2*1
		int f=1; int i;
		for (i = 1;  i <= n; i++) {
			f=f*i;
		}
		System.out.println(f);
	}
}
