package org.eight.base.sort;

import java.util.Comparator;

/**
 * 常见的八个基本排序算法
 * @author 
 * @version 1.0
 */
public interface IEightBaseSort {
	/**
	 * 1.直接插入算法  稳定算法 辅助空间O(1) 平均时间复杂度O(N^2)
	 * @param data 待排序的数据
	 * @param comparator 自定义排序大小比较器
	 * @category insert 插入排序类别
	 */
	<T> void insertSort(T[] data, Comparator<T> comparator);
	/**
	 * 1.直接插入算法  稳定算法 辅助空间O(1) 平均时间复杂度O(N^2)
	 * @param data 待排序数据，待排序数据必须要实现接口Comparable
	 * @category insert 插入排序类别
	 */
	<T extends Comparable<T>> void insertSort(T[] data);
	/**
	 * 2.希尔排序 不稳定算法 辅助空间O(1) 平均时间复杂度O(N^1.3)
	 * @param data 待排序的数据
	 * @param comparator 自定义排序大小比较器
	 * @category insert 插入排序类别
	 */
	<T> void shellSort(T[] data, Comparator<T> comparator);
	/**
	 * 2.希尔排序 不稳定算法 辅助空间O(1) 平均时间复杂度O(N^1.3)
	 * @param data 待排序数据，待排序数据必须要实现接口Comparable
	 * @category insert 插入排序类别
	 */
	<T extends Comparable<T>> void shellSort(T[] data);
	/**
	 * 3.冒泡排序 稳定算法 辅助空间O(1) 平均时间复杂度O(N^2)
	 * @param data 待排序数据
	 * @param comparator 自定义排序大小比较器
	 * @category swap 交换排序类别
	 */
	<T> void bubbleSort(T[] data, Comparator<T> comparator);
	/**
	 * 3.冒泡排序 稳定算法 辅助空间O(1) 平均时间复杂度O(N^2)
	 * @param data 待排序数据，待排序数据必须要是实现了Comparable接口
	 * @category swap 交换排序类别
	 */
	<T extends Comparable<T>> void bubbleSort(T[] data);
	/**
	 * 4.快速排序 不稳定算法 辅助空间O(long2^N) 平均时间复杂度O(Nlong2^N)
	 * @param data 待排序数据
	 * @param comparator 自定义排序大小比较器
	 * @category swap 交换排序类别
	 */
	<T> void quickSort(T[] data, Comparator<T> comparator);
	/**
	 * 4.快速排序 不稳定算法 辅助空间O(long2^N) 平均时间复杂度O(Nlong2^N)
	 * @param data 待排序数据，待排序数据必须是实现了接口Comparable
	 * @category swap 交换排序类别
	 */
	<T extends Comparable<T>> void quickSort(T[] data);
	/**
	 * 5.选择排序 不稳定算法 辅助空间O(1) 平均时间复杂度O(N^2)
	 * @param data 待排序数据
	 * @param comparator 自定义排序大小比较器
	 * @category select 选择排序类别
	 */
	<T> void selectSort(T[] data, Comparator<T> comparator);
	/**
	 * 5.选择排序 不稳定算法 辅助空间O(1) 平均时间复杂度O(N^2)
	 * @param data 待排序数据，待排序数据必须是时间了接口Comparable
	 * @category select 选择排序类别
	 */
	<T extends Comparable<T>> void selectSort(T[] data);
	/**
	 * 6.堆排序 不稳定算法 辅助空间O(1) 平均时间复杂度O(Nlong2^N)
	 * @param data 待排序数据
	 * @param comparator 自定义排序大小比较器
	 * @category select 选择排序类别
	 */
	<T> void heapSort(T[] data, Comparator<T> comparator);
	/**
	 * 6.堆排序 不稳定算法 辅助空间O(1) 平均时间复杂度O(Nlong2^N)
	 * @param data 待排序数据，待排序数据必须是时间了接口Comparable
	 * @category select 选择排序类别
	 */
	<T extends Comparable<T>> void heapSort(T[] data);
	/**
	 * 7.归并排序 稳定排序 辅助空间O(N) 平均时间复杂度O(Nlong2^N)
	 * @param data 待排序数据
	 * @param comparator 自定义排序大小比较器
	 */
	<T> void mergeSort(T[] data, Comparator<T> comparator);
	/**
	 * 7.归并排序 稳定排序 辅助空间O(N) 平均时间复杂度O(Nlong2^N)
	 * @param data 待排序数据，待排序数据必须是时间了接口Comparable
	 */
	<T extends Comparable<T>> void mergeSort(T[] data);
}
