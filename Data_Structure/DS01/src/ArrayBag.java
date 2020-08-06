

public class ArrayBag implements BS{

	private Object[] objects = new Object[1000];
	private int size, i;
	
	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub
		this.objects[size++] = object;
	}

	@Override
	public boolean contains(Object object) {
		// TODO Auto-generated method stub
		for(int i=0; i<size; i++)
			if(objects[i] == object) return true;
		return false;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		this.i=0;
		return objects[this.i++];
	}

	@Override
	public Object getNext() {
		// TODO Auto-generated method stub
		return objects[this.i++];
	}

	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		for(int i=0; i<size; i++)
		{
			if(objects[i]==object){
				System.arraycopy(objects, i+1, objects, i, size-i-1);
				objects[--this.size] = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	
}
