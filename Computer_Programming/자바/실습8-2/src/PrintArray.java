
public class PrintArray {
	public void printArray(int array[]) {
		int i;
		System.out.print('<');
		for(i = 0;i<array.length;i++){
			System.out.print(array[i]);
		
			if ((i+1)<array.length){
				System.out.print(", ");
			}
		}
		System.out.println('>');
	}
	public void printArray(int array[][]) {
		int i,j;
		
		for(i = 0;i<6;i++){
			System.out.print('<');
			
			for(j=0;j<6;j++){
					System.out.print(array[i][j]);
			
					if ((j+1)<array[i].length){
					System.out.print(", ");
					}
				}
			System.out.println('>');	
		}
			
		}
}
