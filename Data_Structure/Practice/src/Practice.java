import java.util.Scanner;
public class Practice{
	public static void main(String args[]){
		Sum_Divisor s = new Sum_Divisor();
		System.out.println(s);
		
	}
}

class Sum_Divisor {
	
	int i;
	public int Sum_Divisor(int n){
		int sum=0;
		for(i=1;i<n;i++){
			if(n%i==0)
				sum+=i;
		}
		return sum;
		
	}
}
