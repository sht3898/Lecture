
public class AS02 {
	static final int _TEST_SIZE = 5;
	
	public static void main(String[] args) {
		/**
		 * AS02) LinkedQueue 클래스에 대해 다음의 변환 메소드
		 * 				ArrauQueue toArrayQueue()
		 * 를 추가하고 테스트하라. 이 메소드는 동등한 ArrayQueue를 리턴한다.
		 */
		
		// create LinkedQueue
		Queue lq = new LinkedQueue();
		
		// fill Queue
		fillQueue(lq, _TEST_SIZE);
		System.out.println("LinkedQueue"); lq.print();
		
		System.out.println();
		
		// convert LinkedQueue to ArrayQueue
		ArrayQueue aq = ((LinkedQueue)lq).toArrayQueue();
		aq.remove();
		System.out.println("ArrayQueue"); aq.print();
		
	}
	
	static void fillQueue(Queue q, int n){
		for(int i=1; i<=n; i++)
			q.add(i);
	}
}

