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
	
	public T getRootData()
	{
		if(!isEmpty())
			return root.data;
		return null;
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
		if((current.left != null && data.compareTo(current.left.data) == 0) || 
				(current.right != null && data.compareTo(current.right.data) == 0))
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
		if(data.compareTo(root.data) == 0)
		{
			if(root.isLeaf())
			{
				root = null;
				return;
			}
			
			Node<T> max = findMax(root.left);
			Node<T> min = findMin(root.right);
			if(max.isLeaf())
			{
				Node<T> parentMax = findParent(max.data, root);
				root.data = max.data;
				parentMax.right = null;
			}
			else if(min.isLeaf())
			{
				Node<T> parentMin = findParent(min.data, root);
				root.data = min.data;
				parentMin.left = null;
			}
			else
			{
				Node<T> parentOfMax = findParent(max.data, root);
				root.data = max.data;
				parentOfMax.right = max.left;
			}
		}
		
		
		
		Node<T> parent = findParent(data, root);
		if(parent == null)
			return;
		if(data.compareTo(parent.right.data) == 0)
		{
			if(parent.right.isLeaf())
			{
				parent.right = null;
			}
			else if(parent.right.children() == 1)
			{
				Node<T> toRemove = parent.right;
				if(toRemove.left != null)
				{
					parent.right = toRemove.left;
				}
				if(toRemove.right != null)
				{
					parent.right = toRemove.right;
				}
			}
			else
			{
				Node<T> toRemove = parent.right;
				Node<T> max = findMax(toRemove.left);
				Node<T> min = findMin(toRemove.right);
				if(max.isLeaf())
				{
					
					Node<T> parentOfMax = findParent(max.data, toRemove);
					toRemove.data = max.data;
					parentOfMax.right = null;
				}
				else if(min.isLeaf())
				{
					Node<T> parentOfMin = findParent(min.data, toRemove);
					toRemove.data = min.data;
					parentOfMin.left = null;
				}
				else
				{
					Node<T> parentOfMax = findParent(max.data, toRemove);
					toRemove.data = max.data;
					parentOfMax.right = max.left;
				}
			}
			
		}
		else //left
		{
			if(parent.left.isLeaf())
			{
				parent.left = null;
			}
			else if(parent.left.children() == 1)
			{
				Node<T> toRemove = parent.left;
				if(toRemove.left != null)
				{
					parent.left = toRemove.left;
				}
				if(toRemove.right != null)
				{
					parent.left = toRemove.right;
				}
			}
			else
			{
				Node<T> toRemove = parent.left;
				Node<T> max = findMax(toRemove.left);
				Node<T> min = findMin(toRemove.right);
				if(max.isLeaf())
				{
					Node<T> parentOfMax = findParent(max.data, toRemove);
					toRemove.data = max.data;
					parentOfMax.right = null;
				}
				else if(min.isLeaf())
				{
					Node<T> parentOfMin = findParent(min.data, toRemove);
					toRemove.data = min.data;
					parentOfMin.left = null;
				}
				else
				{
					Node<T> parentOfMax = findParent(max.data, toRemove);
					toRemove.data = max.data;
					parentOfMax.right = max.left;
				}
			}
		}
	}
	
	private Node<T> findMin(Node<T> start)
	{
		if(start.left == null)
			return start;
		return findMin(start.left);
	}
	
	private Node<T> findMax(Node<T> start)
	{
		if(start.right == null)
			return start;
		return findMax(start.right);
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
	
	public void printTree()
	{
		printTree(root);
	}
	
	private void printTree(Node<T> current)
	{
		if(current == null)
			return;
		printTree(current.left);
		System.out.print(current.data+" ");
		printTree(current.right);
	}
}
