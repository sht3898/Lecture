import java.util.ArrayList;
import java.util.List;

public class Test {
	private static final int A = 0;
	private static final int B = 1;
	private static final int C = 2;
	private static final int D = 3;
	private static final int E = 4;
	private static final int F = 5;
	private static final int G = 6;
	static List<Object> aryQueue = new ArrayList<>();

	public static void main(String[] args) {

		// AS01. Setter
		BinaryTree[] trees = new BinaryTree[7];
		trees[D] = new BinaryTree("D");
		trees[G] = new BinaryTree("G");
		trees[F] = new BinaryTree("F");
		trees[B] = new BinaryTree("B");
		trees[B].setRight(trees[D]);
		trees[E] = new BinaryTree("E");
		trees[E].setLeft(trees[G]);
		trees[C] = new BinaryTree("C", trees[E], trees[F]);
		trees[A] = new BinaryTree("A", trees[B], trees[C]);

		BinaryTree[] trees2 = new BinaryTree[7];
		trees2[D] = new BinaryTree("D");
		trees2[G] = new BinaryTree("G");
		trees2[F] = new BinaryTree("F");
		trees2[B] = new BinaryTree("b");
		trees2[B].setRight(trees2[D]);
		trees2[E] = new BinaryTree("E");
		trees2[E].setLeft(trees2[G]);
		trees2[C] = new BinaryTree("C", trees2[E], trees2[F]);
		trees2[A] = new BinaryTree("A", trees2[B], trees2[C]);
		
		BinaryTree[] trees3 = new BinaryTree[7];
		trees3[D] = new BinaryTree("D");
		trees3[G] = new BinaryTree("G");
		trees3[F] = new BinaryTree("F");
		trees3[B] = new BinaryTree("B");
		trees3[B].setLeft(trees3[D]);
		trees3[E] = new BinaryTree("E");
		trees3[E].setLeft(trees3[G]);
		trees3[C] = new BinaryTree("C", trees3[E], trees3[F]);
		trees3[A] = new BinaryTree("A", trees3[B], trees3[C]);

		// ����1 �׽�Ʈ
		System.out.println("����1) Reverse");
		{
			System.out.println("Original : " + trees[A]);
			trees[A].reverse();
			System.out.println("Reversed : " + trees[A]);
			trees[A].reverse(); // ���� �׽�Ʈ�� ���� ����
		}
		System.out.println();

		// ����2 �׽�Ʈ
		System.out.println("����2) Equals");
		{
			System.out.println(trees[A].equals(trees2[A])); // false : trees[B]�� ���� �ٸ���.
			System.out.println(trees[A].equals(trees3[A])); // false : tree[B]�� �ڽ� ��ġ�� �ٸ���.
			System.out.println(trees[C].equals(trees2[C])); // true
		}
		System.out.println();

		// ����3 �׽�Ʈ
		System.out.println("����3) Pre/Post-Order");
		{
			System.out.println("Inorder : " + trees[0]);
			System.out.println("PreOrder : " + preOrderPrint(trees[0]));
			System.out.println("PostOrder : " + postOrderPrint(trees[0]));
		}
		System.out.println();

		// ����4 �׽�Ʈ
		System.out.println("����4) LevelOrder");
		{
			System.out.print("LevelOrder : ");
			levelOrderPrint(trees[0]);
		}
		System.out.println();

	}

	// Assignment03 ----------------------------------------------------
	static String preOrderPrint(BinaryTree tree) {
		String strGraph = "(" + tree.getRoot();

		// check left side
		if (tree.getLeft() != null) {
			strGraph += ", " + preOrderPrint(tree.getLeft());
		}

		// check right side
		if (tree.getRight() != null) {
			strGraph += ", " + preOrderPrint(tree.getRight());
		}

		return strGraph + ")";
	}

	static String postOrderPrint(BinaryTree tree) {
		String strGraph = "(";

		// check left side
		if (tree.getLeft() != null) {
			strGraph += postOrderPrint(tree.getLeft()) + ", ";
		}

		// check right side
		if (tree.getRight() != null) {
			strGraph += postOrderPrint(tree.getRight()) + ", ";
		}

		strGraph += (String) tree.getRoot();

		return strGraph + ")";
	}

	// Assignment04 ----------------------------------------------------
	/**
	 * �˰��� : Ʈ���� ��Ʈ�� ���������� ť�� ������ ��, �Ź� ť���� �ϳ��� ���Ҹ� �̾� ��� �� ��
	 * ������ �ڽĳ����� ť�� �ִ� �۾��� ť�� �������� �ݺ��Ѵ�.
	 * ť�� ���Լ���� �����ϱ� ������ Ʈ���� ���������� �߰��ϰ�, ��������� ���� �ڽĵ鸸��
	 * ť�� �߰��ϴ� �� ������ �˰����� �ݺ������ν�, Ʈ���� �ܰ躰��(Level) ����� �� �ִ�.
	 * 
	 * ��) 1, 2, 3������ ������ Ʈ���� ���� ����
	 * 1) 1����(��Ʈ)�� ť�� �߰�.
	 * 2) ť�� ���� �ϳ� ����/��� ���� ���ŵ� ������ �ڽĵ�(2����) �߰�.
	 * 3) �ݺ� -> ť�� ���� �ϳ�(2����) ����/��� ���� ���ŵ� ������ �ڽĵ�(3����) �߰�.
	 * 4) �ݺ� -> ť�� ���� �ϳ�(3����) ����/��� ���� ���ŵ� ������ �ڽĵ�(����) �߰�.
	 * 5) �ڽ��� �����Ƿ� ť���� ���Ұ� �߰����� �ʰ�, ���ǹ��� ���� ��ȸ ����.
	 * @param tree
	 */
	static void levelOrderPrint(BinaryTree tree) {
		aryQueue.add(tree);		// add root of tree
		while (!aryQueue.isEmpty()) {	// check the queue until empty
			// print
			BinaryTree bt = (BinaryTree) aryQueue.remove(0);
			System.out.print(bt.getRoot() + " ");
			
			// add child's info. to the queue
			if (bt.getLeft() != null) aryQueue.add(bt.getLeft());
			if (bt.getRight() != null) aryQueue.add(bt.getRight());
		}
	}
}
