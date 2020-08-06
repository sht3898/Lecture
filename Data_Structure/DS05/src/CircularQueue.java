
public class CircularQueue implements Queue {
	private Object a[];
	private int size, capacity;
	private int front, rear;

	public CircularQueue(int capacity) {
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
		return a[(front + 1) % capacity];
	}

	public void add(Object object) {
		if (size == capacity)
			throw new IllegalStateException("queue is full");

		rear = (rear + 1) % capacity;
		a[rear] = object;
		size++;
	}

	public Object remove() {
		if (size == 0)
			throw new IllegalStateException("queue is empty");

		front = (front + 1) % capacity;
		Object object = a[front];
		a[front] = null;
		size--;

		return object;
	}

	public void print() {
		System.out.print("in ->   ");

		// empty space
		for (int i = 0; i < capacity - size; i++)
			System.out.print("  -  ");
		// data
		for (int i = 0; i < size; i++)
			System.out.print("|" + a[(rear - i + capacity) % capacity] + "| ");

		System.out.println("   -> out");
	}
}
