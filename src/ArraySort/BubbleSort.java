package ArraySort;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 5, 3, 2, 1, 9, 4 };
		String a1[]={"a","z","c"};
		sortWithSTRING(a1);
		
	}
	
	public static void sortWithSTRING(String a[]) {
		String temp=""; int flag=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j].compareTo(a[j+1])<0) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					flag=1;
				}
				
			}
			if (flag==0) {
				break;
			}
		}
		for (String s : a) {
			System.out.print(s);
		}
	}
	
	public static void sortWithINT(int a[]) {
		int temp; 
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag=1;
				}

			}
			if (flag == 0) {
				break;
			}
		}
		for (int num : a) {
			System.out.print(num);
		}
	}
}
