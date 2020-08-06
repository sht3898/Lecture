
public class AS01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start = new Node(50);
		
		start = makeList(start, 4);
		printList(start);

		System.out.println("sum = " + sum(start));
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * 과제 1. 리스트의 모든 원소들의 합을 구하라. (p.167 Q4.3)
	 * 예를 들어, 리스트가 {25, 45, 65, 85}라면 sum(list)는 220을 리턴한다.
	 * @param list
	 * @return 명세된 리스트에 있는 정수의 합
	 */
	static int sum(Node list)
	{
		int sum=0;
		for(Node p=list; p!= null; p=p.next)
			sum += p.data;
		
		return sum;
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
