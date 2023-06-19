package ArrayDataStructure;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int a[] = { 4, -2, -3, 4, -1, -2, 1, 5, -3 };

		int max_so_far = Integer.MIN_VALUE; // int smallest value -2147483648
		int max_ending_here = 0;
		int s=0; int start=0; int end=0;
		for (int i = 0; i < a.length; i++) {
			max_ending_here = max_ending_here + a[i];
			
			if (max_so_far<max_ending_here) {
				max_so_far = max_ending_here;
				start=s;
				end=i;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				s=i+1;
			}
		}
		System.out.println("Maximum sum of sum array is: "+max_so_far);
		System.out.println("Starting index value of sub array: "+start);
		System.out.println("Ending index value of sub array: "+end);
	}

}
