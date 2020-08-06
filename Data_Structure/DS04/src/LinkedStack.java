
public class LinkedStack implements Stack{
	private Node top;
	private int size;
	
	
	// ���� @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public Object removeFromTop(int n){
		// implement here
		if(n<0 || n > this.size-1) return null;		// ���� ó��
		
		Object nValue=null;
		Node p=top;
		
		// Case 1) Top ���Ҹ� �����ϴ� ���
		if(n == 0)
		{
			return this.pop();
		}
		// Case 2) Top �̿��� ���Ҹ� �����ϴ� ���
		else
		{
			for(int i=0; i<n; i++)
			{
				// Top���� ���� n��° ������ ���� �����ϰ� ����� ������ ���´�.
				if(i == n-1)
				{
					nValue = p.next.object;		// ���Ұ� ����
					p.next = p.next.next;		// ���ᱸ�� ����
					this.size--;						// �����Ǿ����Ƿ� ������ ���� �� ����
//					break;
				}
				p = p.next;		// ���ᱸ���� ���������� ����
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
