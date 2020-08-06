
public interface Queue {

	/**
	 * Returns the number of elements in this queue.
	 * @return the number of elements in this queue.
	 * */ 
	public int size();


	/**
	 * Returns the element at the front of this queue. 
	 * @return the element at the front of this queue. 
	 * @throws IllegalStateException if this queue is empty
	 * */ 
	public Object first();
	
	
	/**
	 * Adds the specified element to the back of this queue. 
	 * @param object the element to be added to this queue.
	 * */
	public void add(Object object);
	
	
	/**
	 * Removes and returns the element at the front of this queue.
	 * @return the element at the front of this queue.
	 * @throws IllegalStateException if this queue is empty
	 * */ 
	public Object remove();
  
	
	/**
	 * print element from front to rear.
	 */
	public void print();
}
