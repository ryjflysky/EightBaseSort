package org.eight.base.sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
	public static void main(String[] args) {
		Integer[] arrays1 = new Integer[] {10, 5, 21, 8, 6, 26, 33, 66, 50, 2, 33};
		Integer[] arrays2 = new Integer[] {10, 5, 21, 8, 6, 26, 33, 66, 50, 2, 33};
		EightBaseSortImpl sort = new EightBaseSortImpl();
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return (i1 - i2);
			}
		};
//		sort.insertSort(arrays1);
//		sort.shellSort(arrays1, comparator);
//		sort.bubbleSort(arrays1, comparator);
//		sort.quickSort(arrays1, comparator);
//		sort.selectSort(arrays1, comparator);
//		sort.heapSort(arrays1, comparator);
		sort.mergeSort(arrays1, comparator);
		System.out.println(Arrays.toString(arrays1));
//		sort.insertSort(arrays2, comparator);
//		sort.shellSort(arrays2);
//		sort.bubbleSort(arrays2);
//		sort.quickSort(arrays2);
//		sort.selectSort(arrays2);
//		sort.heapSort(arrays2);
		sort.mergeSort(arrays2);
		System.out.println(Arrays.toString(arrays2));
	}
}
