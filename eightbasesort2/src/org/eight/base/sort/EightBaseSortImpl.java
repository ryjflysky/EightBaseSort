package org.eight.base.sort;

import java.util.Comparator;

public class EightBaseSortImpl implements IEightBaseSort {

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

	@Override
	public <T> void bubbleSort(T[] data, Comparator<T> comparator) {
		if (null == data || null == comparator) {
			return;
		}
		int dataLen = data.length;
		boolean isSwap = true;
		for (int i = 0; isSwap && i < dataLen - 1; i++) {
			isSwap = false;
			for (int j = 0; j < dataLen - i - 1; j++) {
				if (comparator.compare(data[j], data[j + 1]) > 0) {
					isSwap = true;
					T temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	@Override
	public <T extends Comparable<T>> void bubbleSort(T[] data) {
		if (null == data) {
			return;
		}
		int dataLen = data.length;
		boolean isSwap = true;
		for (int i = 0; isSwap && i < dataLen - 1; i++) {
			isSwap = false;
			for (int j = 0; j < dataLen - i - 1; j++) {
				if (data[j].compareTo(data[j + 1]) > 0) {
					isSwap = true;
					T temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	@Override
	public <T> void quickSort(T[] data, Comparator<T> comparator) {
		if (null == data || null == comparator) {
			return;
		}
		quickSort(data, 0, data.length - 1, comparator);;
	}
	private <T> void quickSort(T[] data, int left, int right, Comparator<T> comparator) {
		if (left >= right) {
			return;
		}
		T base = data[left];
		int low = left;
		int hight = right;
		while (low < hight) {
			while (low < hight && comparator.compare(data[hight], base) >= 0) {
				hight--;
			}
			if (low < hight) {
				data[low] = data[hight];
			}
			while (low < hight && comparator.compare(data[low], base) <= 0) {
				low++;
			}
			if (low < hight) {
				data[hight] = data[low];
			}
		}
		data[low] = base;
		quickSort(data, left, low, comparator);
		quickSort(data, low + 1, right, comparator);
	}
	@Override
	public <T extends Comparable<T>> void quickSort(T[] data) {
		if (null == data) {
			return;
		}
		quickSort(data, 0, data.length - 1);
	}
	private <T extends Comparable<T>> void quickSort(T[] data, int left, int right) {
		if (left >= right) {
			return;
		}
		T base = data[left];
		int low = left;
		int hight = right;
		while (low < hight) {
			while (low < hight && data[hight].compareTo(base) >= 0) {
				hight--;
			}
			if (low < hight) {
				data[low] = data[hight];
			}
			while (low < hight && data[low].compareTo(base) <= 0) {
				low++;
			}
			if (low < hight) {
				data[hight] = data[low];
			}
		}
		data[low] = base;
		quickSort(data, left, low);
		quickSort(data, low + 1, right);
	}

	@Override
	public <T> void selectSort(T[] data, Comparator<T> comparator) {
		if (null == data || null == comparator) {
			return;
		}
		for (int i = 0; i < data.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < data.length; j++) {
				if (comparator.compare(data[j], data[min]) < 0) {
					min = j;
				}
			}
			if (min != i) {
				T temp = data[i];
				data[i] = data[min];
				data[min] = temp;
			}
		}
	}

	@Override
	public <T extends Comparable<T>> void selectSort(T[] data) {
		if (null == data) {
			return;
		}
		for (int i = 0; i < data.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[j].compareTo(data[min]) < 0) {
					min = j;
				}
			}
			if (min != i) {
				T temp = data[i];
				data[i] = data[min];
				data[min] = temp;
			}
		}
	}

	@Override
	public <T> void heapSort(T[] data, Comparator<T> comparator) {
		if (null == data || null == comparator) {
			return;
		}
		/*
		 * 这里堆排序采用的是迭代方式实现的，当然也可以使用递归方式来实现
		 */
		for (int i = 0; i < data.length - 1; i++) {
			int lastIndex = data.length - 1 - i;
			for (int j = (lastIndex - 1) / 2; j >= 0; j--) {
				int l = (j * 2) + 1;
				int r = (j * 2) + 2;
				if (l <= lastIndex && comparator.compare(data[j], data[l]) < 0) {
					T temp = data[j];
					data[j] = data[l];
					data[l] = temp;
				}
				if (r <= lastIndex && comparator.compare(data[j], data[r]) < 0) {
					T temp = data[j];
					data[j] = data[r];
					data[r] = temp;
				}
			}
			T temp = data[0];
			data[0] = data[lastIndex];
			data[lastIndex] = temp;
		}
	}

	@Override
	public <T extends Comparable<T>> void heapSort(T[] data) {
		if (null == data) {
			return;
		}
		/*
		 * 这里堆排序采用的是迭代方式实现的，当然也可以使用递归方式来实现
		 */
		for (int i = 0; i < data.length - 1; i++) {
			int lastIndex = data.length - 1 - i;
			for (int j = (lastIndex - 1) / 2; j >= 0; j--) {
				int l = (j * 2) + 1;
				int r = (j * 2) + 2;
				if (l <= lastIndex && data[j].compareTo(data[l]) < 0) {
					T temp = data[j];
					data[j] = data[l];
					data[l] = temp;
				}
				if (r <= lastIndex && data[j].compareTo(data[r]) < 0) {
					T temp = data[j];
					data[j] = data[r];
					data[r] = temp;
				}
			}
			T temp = data[0];
			data[0] = data[lastIndex];
			data[lastIndex] = temp;
		}
	}

	@Override
	public <T> void mergeSort(T[] data, Comparator<T> comparator) {
		if (null == data || null == comparator) {
			return;
		}
		mergeSort(data, 0, data.length - 1, comparator);
	}
	private <T> void mergeSort(T[] data, int low, int hight, Comparator<T> comparator) {
		if (low >= hight) {
			return;
		}
		int middle = (low + hight) / 2;
		mergeSort(data, low, middle, comparator);
		mergeSort(data, middle + 1, hight, comparator);
		merge(data, low, middle, hight, comparator);
	}
	private <T> void merge(T[] data, int low, int middle, int hight, Comparator<T> comparator) {
		@SuppressWarnings("unchecked")
		T[] buf = (T[]) new Object[hight - low + 1];
		int lIndex = low;
		int hIndex = middle + 1;
		int index = 0;
		while (lIndex <= middle && hIndex <= hight) {
			if (comparator.compare(data[lIndex], data[hIndex]) > 0) {
				buf[index++] = data[hIndex++];
			} else {
				buf[index++] = data[lIndex++];
			}
		}
		while (lIndex <= middle) {
			buf[index++] = data[lIndex++];
		}
		while (hIndex <= hight) {
			buf[index++] = data[hIndex++];
		}
		
		for (int i = 0; i < buf.length; i++) {
			data[i + low] = buf[i];
		}
	}
	@Override
	public <T extends Comparable<T>> void mergeSort(T[] data) {
		if (null == data) {
			return;
		}
		mergeSort(data, 0, data.length - 1);
	}
	private <T extends Comparable<T>> void mergeSort(T[] data, int low, int hight) {
		if (low >= hight) {
			return;
		}
		int middle = (low + hight) / 2;
		mergeSort(data, low, middle);
		mergeSort(data, middle + 1, hight);
		merge(data, low, middle, hight);
	}
	@SuppressWarnings("unchecked")
	private <T extends Comparable<T>> void merge(T[] data, int low, int middle, int hight) {
//		T[] buf = (T[]) new Object[hight - low + 1]; // 这行代码会报类型转换异常，解决方式如下
		Object[] buf = new Object[hight - low + 1]; 
		int lIndex = low;
		int hIndex = middle + 1;
		int index = 0;
		while (lIndex <= middle && hIndex <= hight) {
			if (data[lIndex].compareTo(data[hIndex]) > 0) {
				buf[index++] = data[hIndex++];
			} else {
				buf[index++] = data[lIndex++];
			}
		}
		while (lIndex <= middle) {
			buf[index++] = data[lIndex++];
		}
		while (hIndex <= hight) {
			buf[index++] = data[hIndex++];
		}
		for (int i = 0; i < buf.length; i++) {
			data[i + low] = (T) buf[i];
		}
	}
}
