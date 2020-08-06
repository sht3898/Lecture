
public class AS03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node list1 = new Node(50);
		Node list2 = new Node(50);
		
		list1 = makeList(list1, 5);
		list2 = makeList(list2, 5);
		System.out.print("List1 : ");	printList(list1);
		System.out.print("List2 : ");	printList(list2);
		
		append(list1, list2);
		System.out.print("Appended : ");	printList(list1);
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * ���� 3. �� ���� ����Ʈ�� �Է¹޾� �ϳ��� ����Ʈ�� ������. (p.167 Q4.7)
	 * ���� ���, list1�� {22, 33, 44, 55}�̰� list2�� {66, 77, 88, 99}���, append(list1, list2)��
	 * list1�� {22, 33, 44, 55, 66, 77 ,88, 99}�� �����Ѵ�. �� �޼ҵ�� ���ο� ��带 �������� ������ �����϶�.
	 * [ new Node(...) ��� �ȵ� !!!!!!!!!!!!!!!!!!!!! ]
	 * 
	 * ������ : list1�� �ּ��� 1���� ��带 ����;
	 * ������ : list1�� �ڿ� list2�� ������;
	 * @param list1
	 * @param list2
	 */
	static void append(Node list1, Node list2){
		Node p = list1;				// list1�� ��ȸ�ϱ� ���� start ��带 �����Ѵ�.
		while(p.next != null)	// list1�� ��ȸ�ϸ鼭 ���� ã�´�.
			p=p.next;
		p.next = list2;				// list1�� ������ ��� ������ list2�� �����ϵ��� �Ѵ�.
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
