
public class Test {

	public static void main(String[] args) {
		int[] ary1={88, 55, 22, 77, 11, 44, 33, 99, 66};
		int[] ary2={88, 55, 22, 77, 11, 44, 33, 99, 66};
		int[] ary3={88, 55, 22, 77, 11, 44, 33, 99, 66};
		
		System.out.println("����");
		print(ary1); System.out.println();

		// �κ� ����
		Sort.bubble(ary1, 6, 8);
		Sort.bubble(ary1, 0, 2);
		Sort.bubble(ary1, 3, 4);
		Sort.selection(ary2, 6, 8);
		Sort.selection(ary2, 0, 2);
		Sort.selection(ary2, 3, 4);
		Sort.insertion(ary3, 6, 8);
		Sort.insertion(ary3, 0, 2);
		Sort.insertion(ary3, 3, 4);

		System.out.println("�κ� ����");
		System.out.print("���� : "); print(ary1);
		System.out.print("���� : "); print(ary2);
		System.out.print("���� : "); print(ary3);
		System.out.println();
		
		// ��ü ����
		Sort.bubble(ary1, 0, 8);
		Sort.selection(ary2, 0, 8);
		Sort.insertion(ary3, 0, 8);
		
		System.out.println("��ü ����");
		System.out.print("���� : "); print(ary1);
		System.out.print("���� : "); print(ary2);
		System.out.print("���� : "); print(ary3);
		
	}

	static void print(int[] a){
		for(int t : a) System.out.print(t + " ");
		System.out.println();
	}
}

