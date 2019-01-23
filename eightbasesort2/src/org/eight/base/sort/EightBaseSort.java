package org.eight.base.sort;

import java.util.Comparator;

/**
 * 常见的八大排序算法
 * @author FK
 *
 */
public interface EightBaseSort {
	/**
	 * 直接插入算法  稳定算法 辅助空间O(1) 平均时间复杂度O(N^2)
	 * @param data 待排序的数据
	 * @param comparator 自定义排序大小比较器
	 * @category insert
	 */
	<T> void insertSort(T[] data, Comparator<T> comparator);
	/**
	 * 直接插入算法  稳定算法 辅助空间O(1) 平均时间复杂度O(N^2)
	 * @param data 待排序数据，待排序数据必须要实现接口Comparable
	 * @category insert
	 */
	<T extends Comparable<T>> void insertSort(T[] data);
	/**
	 * 希尔排序 不稳定算法 辅助空间O(1) 平均时间复杂度O(N^1.3)
	 * @param data 待排序的数据
	 * @param comparator 自定义排序大小比较器
	 * @category insert
	 */
	<T> void shellSort(T[] data, Comparator<T> comparator);
	/**
	 * 希尔排序 不稳定算法 辅助空间O(1) 平均时间复杂度O(N^1.3)
	 * @param data 待排序数据，待排序数据必须要实现接口Comparable
	 * @category insert
	 */
	<T extends Comparable<T>> void shellSort(T[] data);
}
