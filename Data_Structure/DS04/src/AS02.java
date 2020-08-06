
public class AS02 {

	static int _STACK_SZIE = 5;
	
	public static void main(String[] args) {
		
		/*
		 * Q2. 톱으로부터 n번째 원소가 존재할 경우 이를 제거해 리턴하는 메소드를 LinkedStack 클래스에 추가하고 테스트하라.
		 * 존재하지 않을 경우 null을 리턴한다.
		 * 
		 * - 선조건 : 입력되는 n의 값은 0보다 크거나 같다.
		 * - 후조건 : 톱에서 n번째 원소가 존재한다면 스택에서 제거된다. (size 감소 및 경우에 따라서는 top의 위치 변경)
		 * 
		 * 이미 구현되어 있는 LinkedStack 클래스의 필드 및 메소드는 변경시키지 않는다.
		 * (필요하다면 추가 메소드를 구현하여도 무방하다.)
		 * 
		 * 예) 톱으로 부터 1번째인 톱 바로 이전의 원소를 삭제하고자 한다.
		 * 이때 스택이 {1, 2, 3}의 원소를 가지고 톱이 3을 가르키고 있었다면,
		 * 톱에서 1번째 원소인 2의 값을 반환하고 Stack에는 {1, 3}의 원소만 남기도록 한다.
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
