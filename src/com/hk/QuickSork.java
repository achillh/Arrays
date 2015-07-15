package com.hk;

public class QuickSork {

	//快速排序是通常被认为在同数量级（O(nlog2n)）的排序方法中平均性能最好的。
	//但若初始序列按关键码有序或基本有序时，快排序反而蜕化为冒泡排序
	public static void main(String[] args) 
	{
		int a[] = {12,32,10,76,20,2,19,213,345,56,23};
		myQuickSort(a,0,10);
		for(int i : a)
			System.out.print(i+" ");
	}

	private static void myQuickSort(int a[],int low, int high)
	{
		if(low < high){  
	        int privotLoc = partition(a,  low,  high);  //将表一分为二  
	        myQuickSort(a,  low,  privotLoc -1);          //递归对低子表递归排序  
	        myQuickSort(a,   privotLoc + 1, high);        //递归对高子表递归排序  
	    } 
	}
	
	private static int partition(int a[],int low,int high)
	{
			int privotKey = a[low];                            	 //基准元素  
		    while(low < high)										 //从表的两端交替地向中间扫描 
		    {          
		    	//从high 所指位置向前搜索，至多到low+1 位置。将比基准元素小的交换到低端  
		        while(low < high  && a[high] >= privotKey) --high;  
		        a[low]=a[high];
		        while(low < high  && a[low] <= privotKey ) ++low;  
		       a[high] =a[low];
		    }  
		    return low; //返回标记元素角标
	}
}
