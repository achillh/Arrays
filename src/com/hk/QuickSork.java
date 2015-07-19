package com.hk;

public class QuickSork {

	//����������ͨ������Ϊ��ͬ��������O(nlog2n)�������򷽷���ƽ��������õġ�
	//������ʼ���а��ؼ���������������ʱ�������򷴶��ɻ�Ϊð������
	public static void main(String[] args) 
	{
		int a[] = {12,32,10,76,20,2,19,213,345,56,23,567,456,89};
		myQuickSort(a,0,13);
		
		for(int i : a)
			System.out.print(i+" ");
	}

	//��������
	private static void myQuickSort(int s[], int l, int r)
	{
	    if (l < r)
	    {
			//Swap(s[l], s[(l + r) / 2]); //���м��������͵�һ�������� �μ�ע1
	        int i = l, j = r, x = s[l];
	        while (i < j)
	        {
	            while(i < j && s[j] >= x) // ���������ҵ�һ��С��x����
					j--;  
	            if(i < j) 
					s[i++] = s[j];
				
	            while(i < j && s[i] < x) // ���������ҵ�һ�����ڵ���x����
					i++;  
	            if(i < j) 
					s[j--] = s[i];
	        }
	        s[i] = x;
	        myQuickSort(s, l, i - 1); // �ݹ���� 
	        myQuickSort(s, i + 1, r);
	    }
	}
}
