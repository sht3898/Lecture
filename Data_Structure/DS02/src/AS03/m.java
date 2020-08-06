package AS03;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		print(reverse(a));
		
	}

	public static int[] reverse(int[] a){
		int[] b = a.clone();
		for(int i=0; i<a.length; i++)
		{
			b[i] = a[a.length-1-i];
		}
		return b;
	}
	
	public static void print(int[] a){
		System.out.print("{" + a[0]);
		for(int i=1; i<a.length; i++)
			System.out.print("," + a[i]);
		System.out.print("}");
	}
}
