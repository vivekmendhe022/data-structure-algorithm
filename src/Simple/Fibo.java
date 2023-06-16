package Simple;

public class Fibo {
	/*
	 * Algorithm 6: Find the Fibonacci series till the term less than 1000
		Step 1: Start 
		Step 2: Declare variables first_term,second_term and temp. 
		Step 3: Initialize variables first_term ← 0 second_term ← 1 
		Step 4: Display first_term and second_term 
		Step 5: Repeat the steps until second_term ≤ 1000 
		     5.1: temp ← second_term 
		     5.2: second_term ← second_term + first_term 
		     5.3: first_term ← temp 
		     5.4: Display second_term 
		Step 6: Stop
	 */
	public static void main(String[] args) {
		int n1, n2,  temp;
		n1=0; n2=1;
		int count=0;
		System.out.print(n1+" "+n2+" ");
		for (int i = 2; i <= 10000; i++) {
			temp=n2;
			n2=n2+n1;
			n1=temp;
			System.out.print(n2+" ");
			count++;
		}
		System.out.println();
		System.out.println(count);
		m();
	}
	
	static void m() {
		/*n1=0 n2=1
		n1+n2=n3 
		0+1=2		
		n2=n1
		n3=n2*/
		int n1=0, n2=1;
		int n3;
		for (int i = 2; i <= 10; i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}		
	}
}
