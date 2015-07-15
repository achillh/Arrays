package com.hk;

public class QuickSork {

	//����������ͨ������Ϊ��ͬ��������O(nlog2n)�������򷽷���ƽ��������õġ�
	//������ʼ���а��ؼ���������������ʱ�������򷴶��ɻ�Ϊð������
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
	        int privotLoc = partition(a,  low,  high);  //����һ��Ϊ��  
	        myQuickSort(a,  low,  privotLoc -1);          //�ݹ�Ե��ӱ�ݹ�����  
	        myQuickSort(a,   privotLoc + 1, high);        //�ݹ�Ը��ӱ�ݹ�����  
	    } 
	}
	
	private static int partition(int a[],int low,int high)
	{
			int privotKey = a[low];                            	 //��׼Ԫ��  
		    while(low < high)										 //�ӱ�����˽�������м�ɨ�� 
		    {          
		    	//��high ��ָλ����ǰ���������ൽlow+1 λ�á����Ȼ�׼Ԫ��С�Ľ������Ͷ�  
		        while(low < high  && a[high] >= privotKey) --high;  
		        a[low]=a[high];
		        while(low < high  && a[low] <= privotKey ) ++low;  
		       a[high] =a[low];
		    }  
		    return low; //���ر��Ԫ�ؽǱ�
	}
}
