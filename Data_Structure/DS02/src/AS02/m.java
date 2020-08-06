package AS02;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,5,4,9,2,4,3,1,1,6,1,3,5,3,2,4,2,9,2,1,1,4,8,4,3,2,1,1};
		
		System.out.println(frequency(a, 1));
		System.out.println(frequency(a, 2));
	}
	
	public static int frequency(int[] a, int value)
	{
		int cnt = 0;
		
		for(int num : a)
		{
			if(num == value) cnt++;
		}
		return cnt;
	}

}

