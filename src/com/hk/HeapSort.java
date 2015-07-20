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

	//堆调整
	private static void HeapAdjust(int H[], int s,int length)
	{
		int temp = H[s];
		int child = 2*s+1;   /*左孩子节点，每次都是奇数    0
																					   1         2
																					3   4     5   6
																					
																		排序：	 左节点  <根节点<  右节点  		
										   */
																						
		while(child<length)
		{
			if(child+1<length && H[child]<H[child+1])  //左节点 <  右节点 
			{
				++child;        //得到较大的那个节点
			}
			if(H[child]>H[s])       // 较大的节点 与 根节点做比较
			{
				H[s] = H[child];				
				s = child;							//下一个节点	开始	
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
	    //初始堆  
	    buildHeap(H,length);  
	    //从最后一个元素开始对序列进行调整  
	    for (int i = length - 1; i > 0; --i)  
	    {  
	        //交换堆顶元素H[0]和堆中最后一个元素  
	        int temp = H[i]; H[i] = H[0]; H[0] = temp;  
	        //每次交换堆顶元素和堆中最后一个元素之后，都要对堆进行调整  
	        HeapAdjust(H,0,i);  
	  }  
	} 
}
