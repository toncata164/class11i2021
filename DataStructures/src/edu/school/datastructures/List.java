package edu.school.datastructures;

public interface List<T> {
	void add(T element);
	void insertAt(int index, T element);
	void removeAt(int index);
	T get(int index);
	void remove(T element);
	void clear();
	boolean isEmpty();
	int size();//number of elements
}
