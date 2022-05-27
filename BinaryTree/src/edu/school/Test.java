package edu.school;

public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> bt = new BinaryTree<>();
		bt.add(17);
		bt.add(91);
		bt.add(62);
		bt.add(13);
		bt.add(-5);
		bt.add(18);
		bt.add(1);
		bt.add(12);
		bt.add(2);
		//bt.add(18);
		bt.add(-7);
		bt.add(72);
		bt.add(65);
		bt.printTree();
		bt.remove(-7);
		System.out.println();
		bt.printTree();
		bt.remove(1);
		System.out.println();
		bt.printTree();
		bt.remove(91);
		System.out.println();
		bt.printTree();
		bt.remove(-7);
		System.out.println();
		bt.printTree();
		bt.remove(17);
		System.out.println();
		bt.printTree();
		System.out.println();
		System.out.println(bt.getRootData());
	}

}
