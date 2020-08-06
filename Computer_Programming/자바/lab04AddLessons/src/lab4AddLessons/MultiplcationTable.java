package lab4AddLessons;

public class MultiplcationTable {
	public static void main(String[] args) {
		int i,j;
		for( i = 0; i < 10; i++ ){
			for( j = 0; j < 9; j++ )
				if( i == 0 ) System.out.printf("%3d´Ü\t",(j+1));
				else System.out.printf("%4d\t",i*(j+1));
			System.out.println();
		}
	}
}
