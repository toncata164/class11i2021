package edu.school.datastructures;

public class ArrayList<T> implements List<T> {

	private Object[] content;
	private int index;
	
	public ArrayList()
	{
		content = new Object[20];
		index = 0;
	}
	
	@Override
	public void add(T element) {
		content[index++] = element;
		if(index == content.length)
		{
			extendArray();
		}
	}
	
	private void extendArray()
	{
		Object[] old = content;
		content = new Object[old.length*2];
		for(int i = 0; i < index; i++)
		{
			content[i] = old[i];
		}
	}
	
	@Override
	public T get(int index)
	{
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException();
		return (T)content[index];
	}

	@Override
	public void insertAt(int index, T element) {
		if(index > size() || index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		for(int i = size(); i>index; i--)
		{
			content[i] = content[i-1];
		}
		content[index] = element;
		this.index++;
		if(this.index == content.length)
		{
			extendArray();
		}
	}

	@Override
	public void removeAt(int index) {
		for(int i = index; i<this.index-1; i++)
		{
			content[i] = content[i+1];
		}
	}

	@Override
	public void remove(T element) {
		for(int i = 0; i<this.index; i++)
		{
			if(content[i].equals(element))
			{
				removeAt(i);
				break;
			}
		}
	}

	@Override
	public void clear() {
		index = 0;
	}

	@Override
	public boolean isEmpty() {
		return index == 0;
	}

	@Override
	public int size() {
		return index;
	}

}
