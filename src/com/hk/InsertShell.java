package com.hk;

public class InsertShell {

	public static void main(String[] args) 
	{
		int []a = {12,34,56,32,1,22,5,41,10,15};
		insertShell(a);
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	private static void insertShell(int a[])
	{
		int gap = 0;
		int temp = 0;
		int n = a.length;
		while(gap<=n){
			gap = gap*3 +1;//研究证明，最好的步长序列是（1,4,10,23,57，。。。。。。）
		}
		while(gap>0){
			/*接下来就是直接插入排序的代码*/
			for(int i=gap; i<n; i++)
			{
				int j = i-gap;
				temp = a[i];
				while(j>=0&& temp<a[j])
				{
					a[j+gap] = a[j];
					j = j-gap;
				}
				a[j+gap]  =  temp;
			}
			
			gap = (gap-1)/3;
		}
	}
}
