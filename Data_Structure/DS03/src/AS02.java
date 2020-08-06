
public class AS02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list1 = new Node(50);
		Node shallowCopiedList;
		Node deepCopiedList;
		
		shallowCopiedList = list1 = makeList(list1, 4);
		System.out.print("Orginal\t:\t");	printList(list1);
		
		// Deep copy
		deepCopiedList = copy(list1);
		System.out.print("Shallow\t:\t");	printList(shallowCopiedList);
		System.out.print("Deep\t\t:\t");	printList(deepCopiedList);
		
		
		// Test
		System.out.println("-------------------------------------------");
		System.out.println("Change : " + list1.data + " -> 1000, " + list1.next.data + " -> 2000");
		list1.data = 1000;
		list1.next.data = 2000;
		System.out.println("-------------------------------------------");
		
		
		// Result
		System.out.print("Orginal\t:\t");	printList(list1);
		System.out.print("Shallow\t:\t");	printList(shallowCopiedList);
		System.out.print("Deep\t\t:\t");	printList(deepCopiedList);
		
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	/** 
	 * ���� 2. �Է¹��� ����Ʈ�� ���Ͽ� �������� �ƴ� data ���� �����Ͽ� ���ο� ����Ʈ �ϳ��� �����϶�. (p.167 Q4.5)
	 * �� ����Ʈ�� ���� ����Ʈ�� ������ �������� ���ӿ� �����϶�.
	 * �� ����Ʈ�� ������ �ٸ� ����Ʈ�� ���� ������ ��ġ�� �ʴ´�.
	 * @param list 
	 * @return ���� ����Ʈ�� ������ ���ο� ����Ʈ
	 */
	static Node copy(Node list){
		Node newList = new Node();
		Node newListHead = newList;		// ���ΰ� ������ ����Ʈ�� head Node(ù ���)�� �����Ѵ�. (���� ����Ʈ�� start �κ��� ��ȯ�ϱ� ���ؼ� ����Ѵ�.)
		
		// ����� ���ۺ��� (���Է� -> ������� ���� -> �������� �̵�)�� ���� �������� list�� ������ �ݺ�
		for(Node p=list; p!=null; p=p.next)
		{
			newList.data = p.data;									//1) ������ �� ���� (���ο� ��带 �����ϱ� ���Ͽ� ���� new Node(...)���� ���� �����ϱ� ���� ���� �κ�)
			if(p.next != null) newList.next = new Node();	//2) ���ο� ��� ���� (���� list�� ������ ����� �� �̻� �������� �ʴ´�.)
			newList = newList.next;									//3) ���� ����� ���� �����ϱ� ���� �̵�
		}
		
		return newListHead;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	// @ �߰� ���� @
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// List�� ������ �߰�
	static Node makeList(Node start, int cnt){
		for(int i=0; i<cnt; i++)
		{
			int random = (int)(Math.random()*10)*10;
			start = insert(start, random);
		}

		return start;
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
