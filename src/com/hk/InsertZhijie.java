package com.hk;

public class InsertZhijie {

	public static void main(String[] args) {

		int []a = {12,32,67,56,43,2,21};
		insert(a);
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	/*ʱ�临�Ӷ�  O(n^2)*/
	/*
	 *�ҵ�github  https://github.com/BirdHK/Arrays.git
	 * 
	 * */
	private static void insert(int a[]){
		int temp = 0;
		for(int i=1; i<a.length; i++) 		//�ѵ�һ���������������У��ӵڶ���ʼ����
		{
			int j = i-1;             					 	// j ���Ѿ��ź�������еĽǱ�
			temp = a[i];
			while(j>=0&&temp<a[j]){   	//������whileʱ��j�Ѿ�Ϊ-1�������������a[j+1] 
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;        					//��temp���뵽������Ķ�����
		}
	}
}
