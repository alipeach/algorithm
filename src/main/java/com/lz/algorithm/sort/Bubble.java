package com.lz.algorithm.sort;

import com.lz.algorithm.util.SortUtil;

/**
 * 冒泡
 * 每次排序,通过比较相邻元素,得到max/min元素
 * @author liuzhuo
 *
 */
public class Bubble {
	
	public static int[] bubble(int[] array) {
		int size = array.length;
		for(int i = size; i > 0 ; i--) {
			for(int j = 0 ; j < i-1 ; j++) {
				if(array[j] < array[j+1]) {
					SortUtil.swap(array, j, j+1);
				}
			}
		SortUtil.toString(array);	
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = {2,4,6,7,8,3,9,4,5,7};
		int[] result = bubble(array);
		SortUtil.toString(result);
	}

}
