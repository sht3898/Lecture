
public class AS02 {

	static int _STACK_SZIE = 5;
	
	public static void main(String[] args) {
		
		/*
		 * Q2. �����κ��� n��° ���Ұ� ������ ��� �̸� ������ �����ϴ� �޼ҵ带 LinkedStack Ŭ������ �߰��ϰ� �׽�Ʈ�϶�.
		 * �������� ���� ��� null�� �����Ѵ�.
		 * 
		 * - ������ : �ԷµǴ� n�� ���� 0���� ũ�ų� ����.
		 * - ������ : �鿡�� n��° ���Ұ� �����Ѵٸ� ���ÿ��� ���ŵȴ�. (size ���� �� ��쿡 ���󼭴� top�� ��ġ ����)
		 * 
		 * �̹� �����Ǿ� �ִ� LinkedStack Ŭ������ �ʵ� �� �޼ҵ�� �����Ű�� �ʴ´�.
		 * (�ʿ��ϴٸ� �߰� �޼ҵ带 �����Ͽ��� �����ϴ�.)
		 * 
		 * ��) ������ ���� 1��°�� �� �ٷ� ������ ���Ҹ� �����ϰ��� �Ѵ�.
		 * �̶� ������ {1, 2, 3}�� ���Ҹ� ������ ���� 3�� ����Ű�� �־��ٸ�,
		 * �鿡�� 1��° ������ 2�� ���� ��ȯ�ϰ� Stack���� {1, 3}�� ���Ҹ� ���⵵�� �Ѵ�.
		 * 
		 */
		
		// Make stack
		LinkedStack ls = new LinkedStack();
		Z.fillStack(ls, _STACK_SZIE);
		Z.printStack(ls);
		
		System.out.println("remove[0] : " + ls.removeFromTop(0));
		Z.printStack(ls);
		
		System.out.println("remove[1] : " + ls.removeFromTop(1));
		Z.printStack(ls);
		
		System.out.println("remove[2] : " + ls.removeFromTop(2));
		Z.printStack(ls);
	}
}
