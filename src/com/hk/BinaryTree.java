package com.hk;

/*           二叉树的java代码实现
 * 
 *1、理解递归
 * 
 * 
 * */
public class BinaryTree 
{
	private Node root ;        //根节点，对空树来说，值为null
	
	private static class Node
	{
		Node left;
		Node right;
		int data;
		
		Node(int newData)   //节点构造器，为节点赋值
		{
			left = null;
			right = null;
			data = newData;
		}
	}
	
	public BinaryTree()   //二叉树构造器，为二叉树赋值，初始为null
	{
		root = null;
	}
	
	public void insert(int data){           //注意修饰词为public
		root = insert(root,data);
	}
	
	private Node insert(Node node, int data){
		if(node==null)
		{
			node = new Node(data);
		}else{
			if(data<=node.data){
				node.left = insert(node.left,data);
			}else{
				node.right = insert(node.right,data);
			}
		}
		return node;
	}
	
	public void buildTree(int []data){
		for(int i=0;i<data.length;i++){
			insert(data[i]);
		}
	}
	
	public void printTree()
	{
		printTree(root);
		System.out.println();
	}
	
	private void printTree(Node node){
		if(node==null) return;
		printTree(node.left);
		System.out.println(node.data+" ");
		printTree(node.right);
	}
}
