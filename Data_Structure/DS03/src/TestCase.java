
public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Case 1) Insert Ascending	[Lucky Case]
		Node start1 = new Node(22);
		Node p1 = start1;
		for(int i=1; i<5; i++)	
			p1 = insert(start1, 22+11*i);
		System.out.print("Case1) ");	printList(p1);		// expect result : {22, 33, 44, 55, 66}
	
		
		
		// Case 2) Insert Descending	[Bad Case]
		Node start2 = new Node(66);
		Node p2 = start2;
		for(int i=1; i<5; i++)
			p2 = insert(start2, 66-11*i);
		System.out.print("Case2) ");	printList(p2);		// expect result : {66, 55, 44, 33, 22}
		
		
		
		// Case 3) Insert Descending
		Node start3 = new Node(66);
		for(int i=1; i<5; i++)
			start3 = insert(start3, 66-11*i);
		System.out.print("Case3) ");	printList(start3);	// expect result : {66, 55, 44, 33, 22}
	}
	
	
	// p.147
	static void printList(Node start){
		for(Node p=start; p != null; p=p.next)
		{
			System.out.print(p.data);
			if(p.next != null) System.out.print(" -> ");
		}
		System.out.println();
	}
	
	// p.154
	static Node insert(Node start, int x){
		if(start == null || start.data > x){
			start = new Node(x, start);
			return start;
		}
		
		Node p = start;
		while(p.next != null){
			if(p.next.data > x) break;
			p = p.next;
		}
		
		p.next = new Node(x, p.next);
		return start;
	}
	
	// p.156
	static Node delete(Node start, int x){
		if(start == null || start.data > x)
			return start;
		if(start.data == x)
			return start.next;
		for(Node p = start; p.next != null; p = p.next)
		{
			if(p.next.data > x) break;
			if(p.next.data == x){
				p.next = p.next.next;
				break;
			}
		}
		return start;
	}
}
