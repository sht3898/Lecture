
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
	 * 과제 3. 두 개의 리스트를 입력받아 하나의 리스트로 만들어라. (p.167 Q4.7)
	 * 예를 들어, list1이 {22, 33, 44, 55}이고 list2가 {66, 77, 88, 99}라면, append(list1, list2)는
	 * list1을 {22, 33, 44, 55, 66, 77 ,88, 99}로 변경한다. 이 메소드는 새로운 노드를 생성하지 않음에 유의하라.
	 * [ new Node(...) 사용 안됨 !!!!!!!!!!!!!!!!!!!!! ]
	 * 
	 * 선조건 : list1은 최소한 1개의 노드를 가짐;
	 * 후조건 : list1의 뒤에 list2가 부착됨;
	 * @param list1
	 * @param list2
	 */
	static void append(Node list1, Node list2){
		Node p = list1;				// list1를 순회하기 위해 start 노드를 참조한다.
		while(p.next != null)	// list1을 순회하면서 끝을 찾는다.
			p=p.next;
		p.next = list2;				// list1의 마지막 노드 다음을 list2를 참조하도록 한다.
	}
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	// @ 추가 구현 @
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////

	// List에 난수값 추가
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
