
public class AS01 {

	static int _STACK_SZIE = 5;
	
	public static void main(String[] args) {
		
		/*
		 * Q1. ArrayStack Ŭ������ ������ ��ȯ �޼ҵ带 �߰��ϰ� �׽�Ʈ�϶�.
		 * �� �޼ҵ�� ������ LinkedStack�� �����Ѵ�.
		 * 
		 * 		LinkedStack toLinkedStack();
		 * 
		 * �̹� �����Ǿ� �ִ� ArrayStack Ŭ������ �ʵ� �� �޼ҵ�� �����Ű�� �ʴ´�.
		 * (�ʿ��ϴٸ� �߰� �޼ҵ带 �����Ͽ��� �����ϴ�.)
		 */
		
		// Make stack
		ArrayStack as = new ArrayStack(_STACK_SZIE);
		Z.fillStack(as, _STACK_SZIE);
		
		// after conversion
		System.out.println("Class type : " + as.toLinkedStack().getClass().getSimpleName());
		Z.printStack(as.toLinkedStack());

	}
}

