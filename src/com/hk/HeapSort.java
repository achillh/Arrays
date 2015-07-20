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
		int child = 2*s+1;   /*���ӽڵ㣬ÿ�ζ�������    0
																					   1         2
																					3   4     5   6
																					
																		����	 ��ڵ�  <���ڵ�<  �ҽڵ�  		
										   */
																						
		while(child<length)
		{
			if(child+1<length && H[child]<H[child+1])  //��ڵ� <  �ҽڵ� 
			{
				++child;        //�õ��ϴ���Ǹ��ڵ�
			}
			if(H[child]>H[s])       // �ϴ�Ľڵ� �� ���ڵ����Ƚ�
			{
				H[s] = H[child];				
				s = child;							//��һ���ڵ�	��ʼ	
				child = 2*s +1;       
			}else								
				break;
			H[s] = temp;		 
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
