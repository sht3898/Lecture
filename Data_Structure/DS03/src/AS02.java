
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
	 * 과제 2. 입력받은 리스트에 대하여 참조값이 아닌 data 값을 복사하여 새로운 리스트 하나를 생성하라. (p.167 Q4.5)
	 * 새 리스트는 명세된 리스트와 완전히 독립적인 것임에 유의하라.
	 * 한 리스트의 변경은 다른 리스트에 전혀 영향을 미치지 않는다.
	 * @param list 
	 * @return 명세된 리스트를 복제한 새로운 리스트
	 */
	static Node copy(Node list){
		Node newList = new Node();
		Node newListHead = newList;		// 새로게 생성된 리스트의 head Node(첫 노드)를 참조한다. (이후 리스트의 start 부분을 반환하기 위해서 사용한다.)
		
		// 노드의 시작부터 (값입력 -> 다음노드 생성 -> 다음노드로 이동)과 같은 패턴으로 list의 끝까지 반복
		for(Node p=list; p!=null; p=p.next)
		{
			newList.data = p.data;									//1) 원소의 값 수정 (새로운 노드를 생성하기 위하여 사용된 new Node(...)에서 값을 수정하기 위해 사용된 부분)
			if(p.next != null) newList.next = new Node();	//2) 새로운 노드 생성 (만약 list의 마지막 노드라면 더 이상 생성하지 않는다.)
			newList = newList.next;									//3) 다음 노드의 값을 복사하기 위해 이동
		}
		
		return newListHead;
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
