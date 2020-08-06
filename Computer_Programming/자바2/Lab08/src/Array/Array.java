package Array;

public class Array {
	public static void printArray(int[] array){
		System.out.print('<');
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]);
				
			if((i+1)<array.length){
					System.out.print(", ");
			}
				
		}
		System.out.println('>');
	}
	public static void main(String[] args){
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2 = array1;
		int[] array3 = {10,20,30,40,50,60,70,80};
		System.out.print("-초기값\n");
		printArray(array1);
		printArray(array2);
		printArray(array3);
		System.out.print("-배열 복사 실행 후\n");
		System.arraycopy(array1, 0, array3, 0, 4);
		printArray(array1);
		printArray(array2);
		printArray(array3);
		System.out.print("-array1 값 변경 후\n");
		for(int i=0;2*i<array1.length;i++){
			array1[2*i] = 2*i;
		}
		printArray(array1);
		printArray(array2);
		printArray(array3);
	}
}
