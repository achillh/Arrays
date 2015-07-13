package com.hk;


/*							
 * 								冒泡排序
 */
//当然，在java提供了线程的排序方法，Arrays.sort()或Collections.sort()
public class MaoPao {

	public static void main(String[] args) 
	{
		int a[] = {12,34,56,21,2,43,67,9,64};
		int temp;
		System.out.println("排序前：");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("");
		System.out.println("排序后：");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
}
