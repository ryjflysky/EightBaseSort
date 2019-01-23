package org.eight.base.sort;

import java.util.Comparator;

public class EightBaseSortImpl implements EightBaseSort {

	@Override
	public <T> void insertSort(T[] data, Comparator<T> comparator) {
		if (null == data || null == comparator) {
			return;
		}
		for (int i = 0; i < data.length - 1; i++) {
			int j = i + 1;
			T temp = data[j];
			for (; j > 0 && (comparator.compare(temp, data[j - 1]) < 0); j--) {
				data[j] = data[j - 1];
			}
			if (j != (i + 1)) {
				data[j] = temp;
			}
		}
	}

	@Override
	public <T extends Comparable<T>> void insertSort(T[] data) {
		if (null == data) {
			return;
		}
		for (int i = 0; i < data.length - 1; i++) {
			int j = i + 1;
			T temp = data[j];
			for (; j > 0 && (temp.compareTo(data[j - 1]) < 0); j--) {
				data[j] = data[j - 1];
			}
			if (j != (i + 1)) {
				data[j] = temp;
			}
		}
	}

	@Override
	public <T> void shellSort(T[] data, Comparator<T> comparator) {
		if (null == data || null == comparator) {
			return;
		}
		int gap = data.length / 2;
		while (gap >= 1) {
			for (int i = gap; i < data.length; i++) {
				for (int j = i - gap; j >= 0; j -= gap) {
					if (comparator.compare(data[j], data[j + gap]) > 0) {
						T temp = data[j];
						data[j] = data[j + gap];
						data[j + gap] = temp;
					}
				}
			}
			gap /= 2;
//			gap = gap >> 1;
		}
	}

	@Override
	public <T extends Comparable<T>> void shellSort(T[] data) {
		if (null == data) {
			return;
		}
		int gap = data.length / 2;
		int dataLen = data.length;
		while (gap >= 1) {
			for (int i = gap; i < dataLen; i++) {
				for (int j = i - gap; j >= 0; j-= gap) {
					if (data[j].compareTo(data[j + gap]) > 0) {
						T temp = data[j];
						data[j] = data[j + gap];
						data[j + gap] = temp;
					}
				}
			}
			gap /= 2;
	//		gap = gap >> 1;
		}
	}
}
