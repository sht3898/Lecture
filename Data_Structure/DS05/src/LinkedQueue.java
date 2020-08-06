
public class LinkedQueue implements Queue {
	private Node head = new Node(null);
	private int size;

	public int size() {
		return size;
	}

	public Object first() {
		if (size == 0)
			throw new IllegalStateException("the queue is empty");
		return head.next.object;
	}

	/*
	 * public boolean isEmpty() { return size == 0; }
	 */

	public void add(Object object) {
		head.prev = head.prev.next = new Node(object, head.prev, head);
		++size;
	}

	public Object remove() {
		if (size == 0)
			throw new IllegalStateException("the queue is  empty");
		Object object = head.next.object;
		head.next = head.next.next;
		head.next.prev = head;
		--size;
		return object;
	}

	public void print() {
		System.out.print("in ->   ");

		for (Node p = this.head.prev; p != this.head; p = p.prev)
			System.out.print("|" + p.object + "| ");

		System.out.println("   -> out");
	}

	ArrayQueue toArrayQueue() {
		ArrayQueue aq = new ArrayQueue(size);
		for (Node p = this.head.next; p != this.head; p = p.next) {
			aq.add(p.object);
		}

		return aq;
	}

	private static class Node {
		Object object;
		Node prev = this, next = this;

		Node(Object object) {
			this.object = object;
		}

		Node(Object object, Node prev, Node next) {
			this.object = object;
			this.prev = prev;
			this.next = next;
		}
	}
}
