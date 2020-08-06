
public class AS03 {

	static int _STACK_SZIE = 5;
	
	public static void main(String[] args) {
		
		/*
		 * Q3. �־��� ������ ������ �Ųٷ� �ٲٱ� ���� ���� ���� ����(��)�� ����ϴ�
		 * �ܺ� Ŭ���̾�Ʈ �޼ҵ带 �ۼ��ϰ� �׽�Ʈ�϶�.
		 * 
		 * �ܺ� Ŭ���̾�Ʈ �޼ҵ��� ��ȯ��(return type)�̳� �Ű�����(parameter)�� �����Ӱ� ����.
		 */
		
		// Make stack
		ArrayStack as = new ArrayStack(_STACK_SZIE);
		Z.fillStack(as, _STACK_SZIE);
		
		LinkedStack ls = new LinkedStack();
		Z.fillStack(ls, _STACK_SZIE);
		
		System.out.println("ArrayStack");
		Z.printStack(as);
		as = (ArrayStack)reverseStack(as);
		Z.printStack(as);

		System.out.println();
		
		System.out.println("LinkedStack");
		Z.printStack(ls);
		ls = (LinkedStack)reverseStack(ls);
		Z.printStack(ls);
	}
	
	public static Object reverseStack(Object object){
		
		Stack tempStack;		// 1) ��ȯ�� ���� ����
		
		// 2) ������ ������ ���� ��ü ����
		if(object instanceof ArrayStack)
			tempStack= new ArrayStack(((ArrayStack)object).size());
		else if(object instanceof LinkedStack)
			tempStack = new LinkedStack();
		else
			return null;

		// 3) object ������ ���� top���� ���� ���������� ����
		while(((Stack)object).size() != 0)
		{
			tempStack.push(((Stack)object).pop());
		}
		
		// 4) ��ȯ
		return tempStack;
	}
}
