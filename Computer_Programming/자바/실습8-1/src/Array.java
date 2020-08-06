
public class Array {
	public static void main(String[] args){
	int [] array1 = {2,3,5,7,11,13,17,19};
	int [] array2 = new int[8];
	int [] array3 = {10,20,30,40,50,60,70,80};
	System.out.println("-초기값");
	System.out.print("array1:");
	printArray(array1);
	System.out.print("\narray2:");
	printArray(array2);
	System.out.print("\narray3:");
	printArray(array3);
	System.arraycopy(array1, 0, array3, 0, 4);
	System.out.println("\n-배열 복사 실행 후");
	System.out.print("\narray1:");
	printArray(array1);
	System.out.print("\narray2:");
	printArray(array2);
	System.out.print("\narray3:");
	printArray(array3);
	for(int i=0;2*i<array1.length;i++){
		array1[2*i]=2*i;
	}
	array2=array1;
	System.out.println("\n-array1 값 변경 후");
	System.out.print("\narray1:");
	printArray(array1);
	System.out.print("\narray2:");
	printArray(array2);
	System.out.print("\narray3:");
	printArray(array3);
	

	}
	public static void printArray(int[] array){
		System.out.print('<');
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
			if((i+1)<array.length){
				System.out.print(", ");
			}
		}
		System.out.print('>');
		
	}
}
