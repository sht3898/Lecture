
public class m {
	private static final int _TEST_SIZE = 9;

	public static void main(String[] args) {
		java.util.List arrayList = new java.util.ArrayList<Object>();
		
		// fill & print List
		fillList(arrayList, _TEST_SIZE);
		System.out.print("Test Number : ");	printList(arrayList);
		
		// test frequency
		System.out.println("Frequency : ");
		for(int i=1; i<=_TEST_SIZE; i++)
			System.out.println(i + " : " + frequency1(arrayList, i) + ", " + frequency2(arrayList, i));
	}

	///////////////////////////////////////////////////////////////////////////////
	// Implement 1
	/**
	 * for 루프에서 get(i) 메소드를 사용
	 */
	static int frequency1(java.util.List list, Object object)
	{
		// use get(i) method
		int cnt=0;
		
		for(int i=0; i<list.size(); i++)
			if(object.equals(list.get(i)))
				cnt++;
		
		return cnt;
	}
	
	// Implement 2
	/**
	 * for 루프에서 반복자(Iterator) 사용
	 */
	static int frequency2(java.util.List list, Object object)
	{
		// use iterator
		int cnt=0;
		java.util.ListIterator<Object> it = list.listIterator();
		
		for(int i=it.nextIndex(); it.hasNext();)
			if(object.equals(it.next()))
				cnt++;
		
		return cnt;
	}
	///////////////////////////////////////////////////////////////////////////////
	
	
	static void fillList(java.util.List list, int size)
	{
		for(int i=0; i<size; i++)
		{
			int randomValue = (int)(Math.random()*10+1);
			list.add(randomValue);
		}
	}
	static void printList(java.util.List list)
	{
		System.out.print("{ ");
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i));
			if(i != list.size()-1) System.out.print(", ");
			else System.out.println(" }");
		}
	}
}
