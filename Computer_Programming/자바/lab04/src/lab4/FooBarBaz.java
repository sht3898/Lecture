package lab4;

public class FooBarBaz {
	public static void main(String[] args) {
		for( int i = 0; i < 50; i++ ){
			System.out.print( (i+1) + ": ");
			if( (i+1) % 3 == 0 ) System.out.print("foo ");
			if( (i+1) % 5 == 0 ) System.out.print("bar ");
			if( (i+1) % 7 == 0 ) System.out.print("baz ");
			System.out.println();
		}
	}
}
