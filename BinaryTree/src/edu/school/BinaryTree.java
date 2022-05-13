package edu.school;

class Node<T extends Comparable<T>>
{
	T data;
	Node<T> left;
	Node<T> right;
	
	boolean isLeaf()
	{
		return left == null && right == null;
	}
	
	int children()
	{
		if(isLeaf())
			return 0;
		if(left != null && right != null)
			return 2;
		return 1;
	}
}

public class BinaryTree<T extends Comparable<T>> 
{
	private Node<T> root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public void add(T data)
	{
		if(! isEmpty())
			add(data, root);
		else
		{
			root = new Node<>();
			root.data = data;
		}
	}
	
	private Node<T> findParent(T data, Node<T> current)
	{
		if(current == null)
			return null;
		if(data.compareTo(current.left.data) == 0 || 
				data.compareTo(current.right.data) == 0)
		{
			return current;
		}
		else if(data.compareTo(current.data) > 0)
			return findParent(data, current.right);
		else
			return findParent(data, current.left);
	}
	
	
	
	public void remove(T data)
	{
		Node<T> parent = findParent(data, root);
		if(parent == null)
			return;
		if(data.compareTo(parent.right.data) == 0)
		{
			if(parent.right.isLeaf())
			{
				
			}
			else if(parent.right.children() == 1)
			{
				
			}
			else
			{
				
			}
			
		}
		else //left
		{
			
		}
	}
	
	private void add(T data, Node<T> current)
	{
		if(data.compareTo(current.data) > 0)
		{
			if(current.right == null)
			{
				current.right = new Node<>();
				current.right.data = data;
			}
			else
			{
				add(data, current.right);
			}
		}
		else if(data.compareTo(current.data) < 0)
		{
			if(current.left == null)
			{
				current.left = new Node<>();
				current.left.data = data;
			}
			else
			{
				add(data, current.left);
			}
		}
		else
		{
			throw new RuntimeException("Element already exists!");
		}
	}
}
