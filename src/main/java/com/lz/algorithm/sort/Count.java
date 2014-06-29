package com.lz.algorithm.sort;

import com.lz.algorithm.util.SortUtil;

/**
 * 计数
 * 通过统计数组中比自身大/小元素的个数，来决定元素在数组中的位置
 * @author liuzhuo
 *
 */
public class Count {
	
	public static int[] count(int[] array,int k) {
		int size = array.length;
		int[] count = new int[k];
		int[] result = new int[size];
		for(int i = 0; i < size ; i++){
			count[array[i]]++;
		}
		
		for(int i = 1; i < k ; i++){
			count[i] = count[i] + count[i-1];
		}
		
		//从size-1开始，确保排序稳定
		for(int i = size-1 ; i >= 0; i--) {
			result[count[array[i]]-1] = array[i];
			count[array[i]]--;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] array = {2,4,6,7,8,3,9,2,5};
		int[] result = count(array,10);
		SortUtil.toString(result);
	}

}
