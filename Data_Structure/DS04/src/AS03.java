
public class AS03 {

	static int _STACK_SZIE = 5;
	
	public static void main(String[] args) {
		
		/*
		 * Q3. 주어진 스택의 순서를 거꾸로 바꾸기 위해 지역 보조 스택(들)을 사용하는
		 * 외부 클라이언트 메소드를 작성하고 테스트하라.
		 * 
		 * 외부 클라이언트 메소드의 반환형(return type)이나 매개변수(parameter)는 자유롭게 쓴다.
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
		
		Stack tempStack;		// 1) 반환할 스택 생성
		
		// 2) 스택의 종류에 따라 객체 생성
		if(object instanceof ArrayStack)
			tempStack= new ArrayStack(((ArrayStack)object).size());
		else if(object instanceof LinkedStack)
			tempStack = new LinkedStack();
		else
			return null;

		// 3) object 스택의 값을 top으로 부터 순차적으로 저장
		while(((Stack)object).size() != 0)
		{
			tempStack.push(((Stack)object).pop());
		}
		
		// 4) 반환
		return tempStack;
	}
}
