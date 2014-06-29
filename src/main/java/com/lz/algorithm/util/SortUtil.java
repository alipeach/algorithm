package com.lz.algorithm.util;


public class SortUtil {
	
	public static void swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	public static void toString(int[] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
	
	
	public static String join(int[] array) {
		StringBuffer sb = new StringBuffer();
		return sb.toString();
	}

}
