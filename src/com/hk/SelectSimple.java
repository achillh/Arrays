package com.hk;

public class SelectSimple {

	public static void main(String[] args) 
	{
		int []a = {12,34,56,32,1,22,5,41,10,15};
		selectSimple(a);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
	}
	private static void selectSimple(int a[]){
		int n = a.length;
		int k ,temp;
		for(int i = 0 ; i<n; ++i){
			
			k = getKey(a,i);    //求最小值的角标
			
			if(k!=i){             //角标相同说明正好是最小值，就不需要交换
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
	private static int getKey(int a[],int i){
		int k = i;
		for(int j = i+1; j<a.length; ++j)
		{
			if(a[k]>a[j])
				k=j;
		}
		return k;
	}
}
