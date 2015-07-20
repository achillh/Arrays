package com.hk;

public class QuickSork 
{
	public static void main(String[] args) 
	{
		int a[] = {12,32,10,76,20,2,19,213,345,56,23,567,456,89};
		quickSort(a,0,13);
		
		for(int i : a)
			System.out.print(i+" ");
	}
	private static void quickSort(int []a,int m,int n)
	{
		if(m<n)
		{
			int i=m,j=n;
			int k = a[m];
			while(i<j)
			{
				while(i<j && a[j]>=k)
				{
					j--;
				}
				if(i<j)
					a[i++] = a[j];

				while(i<j && a[i]<k)
				{
					i++;
				}
				if(i<j)
					a[j--] = a[i];
			}
			a[i] = k;
			quickSort(a,m,i-1);
			quickSort(a,i+1,n);
		}
	}
}
