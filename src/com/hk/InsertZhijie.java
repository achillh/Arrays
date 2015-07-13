package com.hk;

public class InsertZhijie {

	public static void main(String[] args) {

		int []a = {12,32,67,56,43,2,21};
		insert(a);
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	/*时间复杂度  O(n^2)*/
	/*
	 *我的github  https://github.com/BirdHK/Arrays.git
	 * 
	 * */
	private static void insert(int a[]){
		int temp = 0;
		for(int i=1; i<a.length; i++) 		//把第一个数当做有向序列，从第二开始插入
		{
			int j = i-1;             					 	// j 是已经排好序的数列的角标
			temp = a[i];
			while(j>=0&&temp<a[j]){   	//当跳出while时，j已经为-1，所以下面就有a[j+1] 
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;        					//将temp加入到已排序的队列中
		}
	}
}
