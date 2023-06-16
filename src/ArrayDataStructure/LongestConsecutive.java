package ArrayDataStructure;

import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutive {

	public static void main(String[] args) {
		int a[] = { 103, 105, 1, 2, 3, 56, 88, 89, 99, 100, 101, 102, 104 };
		int findLongestConecutive = findLongestConecutive(a);
		System.out.println(findLongestConecutive);
	}

	private static int findLongestConecutive(int[] a) {

		int longestStreak = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int num : a) {
			set.add(num);
		}
		for (int num : set) {
			if (!set.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;
				while (set.contains(currentNum + 1)) {
					currentNum++; 
					currentStreak++; // 3
				}
				longestStreak = Math.max(currentStreak, longestStreak);
			}
		}

		return longestStreak;
	}
}
