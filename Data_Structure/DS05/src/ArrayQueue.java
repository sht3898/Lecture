
public class ArrayQueue implements Queue {
	private Object[] a;
	private int size, capacity;
	private int front, rear;

	public ArrayQueue(int capacity) {
		a = new Object[capacity];
		front = rear = -1;
		size = 0;
		this.capacity = capacity;
	}

	public int size() {
		return size;
	}

	public Object first() {
		if (size == 0)
			throw new IllegalStateException("queue is empty");
		return a[front + 1];
	}

	public void add(Object object) {
		if (rear == capacity - 1)
			throw new IllegalStateException("queue is full");
		a[++rear] = object;
		size++;
	}

	public Object remove() {
		if (size == 0)
			throw new IllegalStateException("queue is empty");
		Object object = a[++front];
		a[front] = null;
		size--;
		return object;
	}

	public void print() {
		System.out.print("in ->   ");
		
		// empty space
		for(int i=0; i<capacity-size; i++)
			System.out.print("  -  ");
		// data
		for(int i=rear; i>front; i--)
			System.out.print("|" + a[i] + "| ");
		
		System.out.println("   -> out");
	}
}
