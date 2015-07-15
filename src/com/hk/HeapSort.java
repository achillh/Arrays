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
		int child = 2*s+1;   //
		while(child<length)
		{
			if(child+1<length && H[child]<H[child+1])
			{
				++child;
			}
			if(H[child]>H[s])  
			{
				H[s] = H[child];			// 那么把较大的子结点往上移动，替换它的父结点 			
				s = child;
				child = 2*s +1;       //
			}else								// 如果当前待调整结点大于它的左右孩子，则不需要调整，直接退出
				break;
			H[s] = temp;		// 当前待调整的结点放到比其大的孩子结点位置上  
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
