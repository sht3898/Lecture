
public class AS01 {

	static int _STACK_SZIE = 5;
	
	public static void main(String[] args) {
		
		/*
		 * Q1. ArrayStack 클래스에 다음의 변환 메소드를 추가하고 테스트하라.
		 * 이 메소드는 동등한 LinkedStack을 리턴한다.
		 * 
		 * 		LinkedStack toLinkedStack();
		 * 
		 * 이미 구현되어 있는 ArrayStack 클래스의 필드 및 메소드는 변경시키지 않는다.
		 * (필요하다면 추가 메소드를 구현하여도 무방하다.)
		 */
		
		// Make stack
		ArrayStack as = new ArrayStack(_STACK_SZIE);
		Z.fillStack(as, _STACK_SZIE);
		
		// after conversion
		System.out.println("Class type : " + as.toLinkedStack().getClass().getSimpleName());
		Z.printStack(as.toLinkedStack());

	}
}

