package Simple;

public class LargestNum {
	/*
	 * Algorithm 2: Find the largest number among three numbers
		Step 1: Start
		Step 2: Declare variables a,b and c.
		Step 3: Read variables a,b and c.
		Step 4: If a > b
		           If a > c
		              Display a is the largest number.
		           Else
		              Display c is the largest number.
           		Else
		           If b > c
		              Display b is the largest number.
		           Else
		              Display c is the greatest number.  
		Step 5: Stop
	 */
	public static void main(String[] args) {
		int a=10,b=2,c=3;
		if (a>b) {
			if (a>c) {
				System.out.println("a is the largest number");
			}else {
				System.out.println("c is the largest number");				
			}			
		}
		else {
			if (b>c) {
				System.out.println("b is the largest number");
			}else {
				System.out.println("c is the largest number");
			}
		}
	}

}
