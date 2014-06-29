package com.lz.algorithm.sort;

import com.lz.algorithm.util.SortUtil;


/**
 * 选择排序
 * 每次排序,通过遍历数组,得到max/min元素与左/右端元素交换
 * @author liuzhuo
 *
 */
public class Select {
	
	public static int[] select(int[] array) {
		
		int size = array.length;
		for(int i = 0 ; i < size ; i++ ) {
			for (int j = i+1; j < size; j++) {
				if(array[i] < array[j]) {
					SortUtil.swap(array, i, j);
				}
			}
		SortUtil.toString(array);	
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		int[] array = {2,4,6,7,8,3,9,4,5,7};
		int[] result = select(array);
		SortUtil.toString(result);
	}

}
