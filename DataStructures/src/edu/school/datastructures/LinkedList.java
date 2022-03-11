package edu.school.datastructures;

class Node<T>
{
	private T data;
	private Node<T> next;
	
	public Node(T data, Node<T> next)
	{
		this.data = data;
		this.next = next;
	}
	
	public Node(T data)
	{
		this(data, null);
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
	public T getData()
	{
		return data;
	}
	
	public Node<T> getNext()
	{
		return next;
	}
}

public class LinkedList<T> implements List<T> {
	private Node<T> start;
	private Node<T> end;
	private int size;
	
	
	public LinkedList()
	{
		clear();
	}
	
	
		
	@Override
	public void add(T element) {
		if(isEmpty())
		{
			start = new Node<T>(element);
			end = start;
			size++;
			return;
		}
		end.setNext(new Node<T>(element));
		end = end.getNext();
		size++;
	}

	@Override //5
	public void insertAt(int index, T element) {
		if(index > size() || index < 0)
			throw new IndexOutOfBoundsException();
		
		Node<T> currentNode = start;
		Node<T> previousNode = null;
		while(index > 0)
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
			index--;
		}
		if(previousNode != null)
		{
			previousNode.setNext(new Node<T>(element, currentNode));
		}
		else
		{
			start = new Node<T>(element, start);
		}
		size++;
	}

	@Override
	public void removeAt(int index) {
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException();
		
		Node<T> currentNode = start;
		Node<T> previousNode = null;
		while(index > 0)
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
			index--;
		}
		if(previousNode == null)
		{
			start = start.getNext();
			if(start == null)
				end = null;
			size--;
		}
		else
		{
			previousNode.setNext(currentNode.getNext());
			if(previousNode.getNext() == null)
				end = previousNode;
			size--;
		}
	}

	@Override
	public T get(int index) {
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException();
		Node<T> oldStack = start;
		while(index > 0)
		{
			oldStack = oldStack.getNext();
			index--;
		}
		return oldStack.getData();
	}

	@Override
	public void remove(T element) {
		Node<T> currentNode = start;
		Node<T> previousNode = null;
		while(currentNode != null &&
				!currentNode.getData().equals(element))
		{
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if(currentNode != null)
		{
			if(previousNode == null)
			{
				start = start.getNext();
				if(start == null)
					end = null;
			}
			else
			{
				previousNode.setNext(currentNode.getNext());
				if(previousNode.getNext() == null)
				{
					end = previousNode;
				}
			}
			size--;
		}
	}

	@Override
	public void clear() {
		start = end = null;
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return start == null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
