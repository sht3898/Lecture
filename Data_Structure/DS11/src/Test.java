
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6, 5, 8, 3, 2, 7, 4, 9};
		int b[] = { 9, 8, 5, 6, 2, 7, 4, 3};
		Heap h = new Heap();
		
		
		// no heapified
		for(int i : a){ System.out.print(i + " "); } System.out.println("-> isHeap : " + h.isHeap(a, a.length));
		for(int i=0; i<a.length; i++){
			System.out.print(h.isHeapForSubTree(a, i, a.length) + " ");
		}
		
		System.out.println("\n");
		
		// heapified
		h.buildHeap(a, 0, a.length);
		for(int i : a){ System.out.print(i + " "); } System.out.println("-> isHeap : " + h.isHeap(a, a.length));
		for(int i=0; i<a.length; i++){
			System.out.print(h.isHeapForSubTree(a, i, a.length) + " ");
		}
		
		System.out.println("\n");
		for(int i : b){ System.out.print(i + " "); } System.out.println("-> isHeap : " + h.isHeap(b, b.length));
		for(int i=0; i<b.length; i++){
			System.out.print(h.isHeapForSubTree(b, i, b.length) + " ");
		}
	}
}
 