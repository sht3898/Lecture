
public class LinkedStack implements Stack{
	private Node top;
	private int size;
	
	
	// 구현 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public Object removeFromTop(int n){
		// implement here
		if(n<0 || n > this.size-1) return null;		// 예외 처리
		
		Object nValue=null;
		Node p=top;
		
		// Case 1) Top 원소를 삭제하는 경우
		if(n == 0)
		{
			return this.pop();
		}
		// Case 2) Top 이외의 원소를 삭제하는 경우
		else
		{
			for(int i=0; i<n; i++)
			{
				// Top으로 부터 n번째 원소의 값을 저장하고 연결된 구조를 끈는다.
				if(i == n-1)
				{
					nValue = p.next.object;		// 원소값 저장
					p.next = p.next.next;		// 연결구조 수정
					this.size--;						// 삭제되었으므로 스택의 원소 수 감소
//					break;
				}
				p = p.next;		// 연결구조를 순차적으로 접근
			}
		}
		
		return nValue;
	}
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	public boolean isEmpty(){
		return (size==0);
	}
	
	public Object peek(){
		if(size == 0) throw new java.util.NoSuchElementException();
		return top.object;
	}
	
	public Object pop(){
		if(size ==0) throw new java.util.NoSuchElementException();
		Object oldTop = top.object;
		top = top.next;
		--size;
		return oldTop;
	}
	
	public void push(Object object){
		top = new Node(object, top);
		++size;
	}
	
	public int size(){
		return size;
	}

	private static class Node{
		Object object;
		Node next;
		Node(Object object, Node next){
			this.object = object;
			this.next = next;
		}
	}
}
