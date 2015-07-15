package com.hk;

public class HeapSort {

	public static void main(String[] args) 
	{
		int a[] = {12,32,10,76,20,2,19,213,345,56,23};
		myHeapSort(a,11);
		for (int i : a) {
			System.out.print(i+" ");
		}
			
	}

	//�ѵ���
	private static void HeapAdjust(int H[], int s,int length)
	{
		int temp = H[s];
		int child = 2*s+1;   //
		while(child<length)
		{
			if(child+1<length && H[child]<H[child+1])
			{
				++child;
			}
			if(H[child]>H[s])  
			{
				H[s] = H[child];			// ��ô�ѽϴ���ӽ�������ƶ����滻���ĸ���� 			
				s = child;
				child = 2*s +1;       //
			}else								// �����ǰ�������������������Һ��ӣ�����Ҫ������ֱ���˳�
				break;
			H[s] = temp;		// ��ǰ�������Ľ��ŵ������ĺ��ӽ��λ����  
		}
	}
	//Building heap
	private static void buildHeap(int a[],int length){
		for(int i=(length-1)/2; i>=0; i--){
			HeapAdjust(a,i,length);
		}
	}
	
	private static void myHeapSort(int H[],int length)  
	{  
	    //��ʼ��  
	    buildHeap(H,length);  
	    //�����һ��Ԫ�ؿ�ʼ�����н��е���  
	    for (int i = length - 1; i > 0; --i)  
	    {  
	        //�����Ѷ�Ԫ��H[0]�Ͷ������һ��Ԫ��  
	        int temp = H[i]; H[i] = H[0]; H[0] = temp;  
	        //ÿ�ν����Ѷ�Ԫ�غͶ������һ��Ԫ��֮�󣬶�Ҫ�Զѽ��е���  
	        HeapAdjust(H,0,i);  
	  }  
	} 
}
