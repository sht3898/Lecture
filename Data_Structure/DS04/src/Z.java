
public class Z {
	
	static void printStack(Object object){
		if(object instanceof Stack)
		{
			Stack stack = (Stack)object;
			Stack copyStack;
			
			if(object instanceof ArrayStack)
				copyStack= new ArrayStack(((ArrayStack)object).size());
			else if(object instanceof LinkedStack)
				copyStack = new LinkedStack();
			else
				copyStack = null;
				
			for(int i=0; i<stack.size(); i++)
			{
				System.out.print(":::::::");
			}
			System.out.println();
			
			while(stack.size() != 0)
			{
				copyStack.push(stack.pop());
			}
			while(copyStack.size() != 0)
			{
				Object element = copyStack.pop();
				System.out.print(":: " + element + " ");
				stack.push(element);
			}
			System.out.println(" <- Peek");
			for(int i=0; i<stack.size(); i++)
			{
				System.out.print(":::::::");
			}
			System.out.println();
		}
		else
		{
			return;
		}
	}
	
	
	
	static void fillStack(Object object, int size){
		if(object instanceof ArrayStack)
		{
			ArrayStack as = (ArrayStack) object;
			
			for(int i=0; i<size; i++)
			{
				int randomValue = (int)(Math.random()*10)*10;
				as.push(randomValue);
			}
		}
		else if(object instanceof LinkedStack)
		{
			LinkedStack ls = (LinkedStack) object;
			
			for(int i=0; i<size; i++)
			{
				int randomValue = (int)(Math.random()*10)*10;
				ls.push(randomValue);
			}
		}
		else
		{
			return;
		}
	}
}
