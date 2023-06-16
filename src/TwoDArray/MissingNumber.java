package TwoDArray;

// WAP to find all misiing numbers from 1 to 100 from an array
// {22,17,4,66,8,2,87}

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 22, 17, 4, 66, 8, 2, 87 };
		isMissingNumber(a);
	}

	public static void isMissingNumber(int a[]) {
		boolean status = false;
		int count=0;
		for (int j = 0; j <= 100; j++) {

			for (int i = 0; i < a.length; i++) {
				if (j == a[i]) {
					status = false;
					break;
				}
			}
			if (status == true)// num not present
			{
				System.out.print(j+" ");
				count++;
			}
			status = true; // for every number status should be true
		}
		System.out.println();
		System.out.println(count);

	}
}
