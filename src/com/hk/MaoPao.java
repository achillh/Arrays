package com.hk;


/*							
 * 								ð������
 */
//��Ȼ����java�ṩ���̵߳����򷽷���Arrays.sort()��Collections.sort()
public class MaoPao {

	public static void main(String[] args) 
	{
		int a[] = {12,34,56,21,2,43,67,9,64};
		int temp;
		System.out.println("����ǰ��");
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
		System.out.println("�����");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
}
