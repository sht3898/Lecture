package AS01;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] ary = {2, 2, 3, 4, 5, 1, 7, 8, 9, 10};
		System.out.println(findMinValueIndex(ary));

	}
	
	public static int findMinValueIndex(int[] ary){
		int m=0;
		
		for(int i=0; i<ary.length; i++)
		{
			if(ary[i] < ary[m]) m=i; 
		}
		
		return m;
	}
}
