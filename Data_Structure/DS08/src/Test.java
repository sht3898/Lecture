
public class Test {
	private static final int A = 0;
	private static final int B = 1;
	private static final int C = 2;
	private static final int D = 3;
	private static final int E = 4;
	
	public static void main(String[] args) {
		
		
		// AS01. Setter
		BinaryTree[] trees = new BinaryTree[5];
		trees[B] = new BinaryTree("B");
		trees[D] = new BinaryTree("D");
		trees[E] = new BinaryTree("E");
		trees[C] = new BinaryTree("C", trees[D], trees[E]);
		trees[A] = new BinaryTree("A", trees[B], trees[C]);

		
		// AS02. isLeaf
		System.out.println("Test isLeaf() --------------------");
		for(int i=0; i<trees.length; i++)
			if(trees[i].isLeaf()) System.out.println(trees[i] + " is a leaf node");
		System.out.println();

		
		// AS03. Contains
		System.out.println("Test contains() --------------------");
		for(int i=0; i<trees.length; i++)
			for(int j=0; j<trees.length; j++)
				if( trees[i].contains(trees[j].getRoot()) )
					System.out.println(trees[i].getRoot() + " contains " + trees[j].getRoot());
		System.out.println();
		
		
		// AS04. toString
		System.out.println("Test toString() --------------------");
		for(int i=0; i<trees.length; i++)
			System.out.println(trees[i].getRoot() + " -> " + trees[i]);

	}
}
