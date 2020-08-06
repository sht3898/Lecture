
public class ArrayStack implements Stack{
	private Object[] a;
	private int size;

	
	public ArrayStack(int capacity){
		a = new Object[capacity];
	}
	
	// 구현 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public LinkedStack toLinkedStack(){
		
		LinkedStack ls = new LinkedStack();	// 1) 반환할 연결스택 생성
		
		for(int i=0; i<size; i++)
			ls.push(this.a[i]);							// 2) 연결스택의 값 입력
		
		return ls;										// 3) 반환
	}
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	public boolean isEmpty(){
		return (size == 0);
	}
	
	public Object peek() {
		if(size == 0) throw new IllegalStateException("stack is empty");
		return a[size-1];
	}
	
	public Object pop() {
		if(size == 0) throw new IllegalStateException("stack is empty");
		Object object = a[--size];
		a[size] = null;
		return object;
	}
	
	public void push(Object object) {
		if(size == a.length) resize();
		a[size++] = object;
	}
	
	public int size() {
		return size;
	}
	
	private void resize(){
		Object[] aa = a;
		a = new Object[2*aa.length];
		System.arraycopy(aa, 0, a, 0, size);
	}
	
}
