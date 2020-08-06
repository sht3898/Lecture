
public class AS01 {
	static final int _TEST_SIZE = 5;

	public static void main(String[] args) {
		/**
		 * AS01) Queue interface로부터 ArrayQueue, LinkedQueue, CircularQueue를 구현하여라.
		 */
		
		// create Queue
		Queue aq = new ArrayQueue(_TEST_SIZE);
		Queue lq = new LinkedQueue();
		Queue cq = new CircularQueue(_TEST_SIZE);
		
		// Add test
		System.out.println("Add test");
		fillQueue(aq, _TEST_SIZE);	aq.print();
		fillQueue(lq, _TEST_SIZE);		lq.print();
		fillQueue(cq, _TEST_SIZE);	cq.print();
				
		System.out.println();

		// Remove and Size test
		System.out.println("Remove and Size test");
		emptyQueue(aq);		aq.print();	// aq.add("f");  // boundary error
		emptyQueue(lq);		lq.add("f");		lq.print();
		emptyQueue(cq);		cq.add("f");		cq.print();
		
		System.out.println();
		
		// First test
		System.out.println("First Test");
		lq.add(1);		System.out.println(lq.first());
		cq.add(1);		System.out.println(cq.first());
		
	}
	
	static void fillQueue(Queue q, int n){
		for(int i=1; i<=n; i++)
			q.add(i);
	}
	
	static void emptyQueue(Queue q){
		for(int i=q.size(); i>0; i--)
			q.remove();
	}
}

