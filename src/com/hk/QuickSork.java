package com.hk;

public class QuickSork {

	//快速排序是通常被认为在同数量级（O(nlog2n)）的排序方法中平均性能最好的。
	//但若初始序列按关键码有序或基本有序时，快排序反而蜕化为冒泡排序
	public static void main(String[] args) 
	{
		int a[] = {12,32,10,76,20,2,19,213,345,56,23,567,456,89};
		myQuickSort(a,0,13);
		
		for(int i : a)
			System.out.print(i+" ");
	}

	//快速排序
	private static void myQuickSort(int s[], int l, int r)
	{
	    if (l < r)
	    {
			//Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
	        int i = l, j = r, x = s[l];
	        while (i < j)
	        {
	            while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
					j--;  
	            if(i < j) 
					s[i++] = s[j];
				
	            while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
					i++;  
	            if(i < j) 
					s[j--] = s[i];
	        }
	        s[i] = x;
	        myQuickSort(s, l, i - 1); // 递归调用 
	        myQuickSort(s, i + 1, r);
	    }
	}
}
