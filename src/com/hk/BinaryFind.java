package com.hk;

import java.util.Arrays;

//二分法查找
public class BinaryFind {

	public static void main(String[] args) 
	{
		int a[] = {12,34,56,21,2,43,67,9,64,324,23,1};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println(Arrays.binarySearch(a, 21));
		System.out.println(binarySearch(a,43));
	}
	public static int binarySearch(int a[],int x){
		int max,min;
		min=0;
		max=a.length-1;
		int point = 0;
		while(min<=max)
		{
			point = (min+max)/2;
			if(x>a[point]){
				min = point+1;
			}
			if(x<a[point]){
				max = point-1;
			}
			if(x==a[point])
				return point;
		}
		return point;
	}
}
