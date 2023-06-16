package TwoDArray;
//.WAP to find prime numbers from an array given below

// a[]={13,4,56,32,99,11} 

public class PrimeNumber {
	public static void main(String[] args) {
		int a[] = { 3, 13, 4, 56, 32, 99, 11 };
		prime(a);
	}

	public static void prime(int a[]) {
		for (int num : a) {
			boolean isPrime = true;
			if (num <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= Math.sqrt(num); i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println(num + " is a prime number.");
			}
		}
	}

	public static void isPrime(int a[]) {
		for (int num : a) {
			boolean isPrime = true;
			if (num <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= Math.sqrt(num); i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println(num);
			}
		}

	}
}
