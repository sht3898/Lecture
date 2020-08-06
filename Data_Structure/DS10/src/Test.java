
public class Test {
	public static void main(String[] args) {

		// create BST
		BinarySearchTree bst = new BinarySearchTree(9);
		fillBST(bst);
		
		// test remove(1)
		System.out.println(11 + " - " + bst.remove(bst, 11) + " -> " + bst);
		System.out.println(0 + " - " + bst.remove(bst, 0) + " -> " + bst);
		System.out.println();
		for(int i=10; i>0; i--)
			System.out.println(i + " - " + bst.remove(bst, i) + " -> " + bst);
		System.out.println();

		System.out.println("--------------------------------------------------");
		
		// test remove(2)
		fillBST(bst);
		// deleteMinimum
		System.out.println(2 + " - " + bst.remove(bst, 2) + " -> " + bst);
		System.out.println(3 + " - " + bst.remove(bst, 3) + " -> " + bst);
		System.out.println(4 + " - " + bst.remove(bst, 4) + " -> " + bst);
		// root
		System.out.println(9 + " - " + bst.remove(bst, 9) + " -> " + bst);
		System.out.println(10 + " - " + bst.remove(bst, 10) + " -> " + bst);
		System.out.println(5 + " - " + bst.remove(bst, 5) + " -> " + bst);
		// leaf
		System.out.println(1 + " - " + bst.remove(bst, 1) + " -> " + bst);
		System.out.println(8 + " - " + bst.remove(bst, 8) + " -> " + bst);
		System.out.println(7 + " - " + bst.remove(bst, 7) + " -> " + bst);
		// empty
		System.out.println(6 + " - " + bst.remove(bst, 6) + " -> " + bst);
		
		System.out.println();
		
		System.out.println("--------------------------------------------------");
		
		// test remove(3)
		fillBSTForMaxTest(bst);
		// deleteMaximum
		System.out.println(16 + " - " + bst.remove(bst, 16) + " -> " + bst);
		System.out.println(15 + " - " + bst.remove(bst, 15) + " -> " + bst);
		System.out.println(14 + " - " + bst.remove(bst, 14) + " -> " + bst);
		// root
		System.out.println(9 + " - " + bst.remove(bst, 9) + " -> " + bst);
		System.out.println(8 + " - " + bst.remove(bst, 8) + " -> " + bst);
		System.out.println(13 + " - " + bst.remove(bst, 13) + " -> " + bst);
		// leaf
		System.out.println(17 + " - " + bst.remove(bst, 17) + " -> " + bst);
		System.out.println(10 + " - " + bst.remove(bst, 10) + " -> " + bst);
		System.out.println(11 + " - " + bst.remove(bst, 11) + " -> " + bst);
		// empty
		System.out.println(12 + " - " + bst.remove(bst, 12) + " -> " + bst);
		
		System.out.println();
	}
	
	public static void fillBST(BinarySearchTree bst){
		System.out.println(bst.add(bst, 9));
		System.out.println(bst.add(bst, 2));
		System.out.println(bst.add(bst, 1));
		System.out.println(bst.add(bst, 6));
		System.out.println(bst.add(bst, 4));
		System.out.println(bst.add(bst, 7));
		System.out.println(bst.add(bst, 3));
		System.out.println(bst.add(bst, 5));
		System.out.println(bst.add(bst, 10));
		System.out.println(bst.add(bst, 8));
		System.out.println("Original : " + bst);
		System.out.println();
	}
	
	public static void fillBSTForMaxTest(BinarySearchTree bst){
		System.out.println(bst.add(bst, 9));
		System.out.println(bst.add(bst, 16));
		System.out.println(bst.add(bst, 17));
		System.out.println(bst.add(bst, 12));
		System.out.println(bst.add(bst, 14));
		System.out.println(bst.add(bst, 11));
		System.out.println(bst.add(bst, 15));
		System.out.println(bst.add(bst, 13));
		System.out.println(bst.add(bst, 8));
		System.out.println(bst.add(bst, 10));
		System.out.println("Original : " + bst);
		System.out.println();
	}
}
