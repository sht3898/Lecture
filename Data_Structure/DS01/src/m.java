
public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AS01, 03
/*		BS bag = new ArrayBag();
		bag.add("CA");
		bag.add("US");
		bag.add("MX");
		bag.add("RU");
		bag.add("US");
		bag.add("MX");

		remove(bag, "US");
		print(bag);*/


		// AS02, 03
/*		BS set = new ArraySet();
		set.add("CA");
		set.add("US");
		set.add("MX");
		set.add("RU");
		set.add("US");
		set.add("MX");
		
		remove(set, "US");
		print(set);*/
		
		
		
		// AS 04
/*		BS bag = new ArrayBag();
		bag.add("CA");
		bag.add("US");
		bag.add("MX");
		bag.add("RU");
		bag.add("US");
		bag.add("MX");
		bag.add("KR");

		BS bag2 = new ArrayBag();
		bag2.add("CA");
		bag2.add("US");
		bag2.add("RU");
		bag2.add("US");
		bag2.add("UK");

		removeDifferentElements(bag, bag2);
		print(bag);*/

	}


	public static void print(Object BG){

		if(BG instanceof ArrayBag)	// instanceof : ��ü�� Ŭ������ �˻��ϱ����� ���
		{
			Object bagObj = ((ArrayBag)BG).getFirst();	// BG�� �������̽��̱� ������ ������ ArrayBag�� ����ϱ� ���� ����ȯ(type casting)�� �Ѵ�.

			// Bag���� �Ź� ������ ���翩�θ� Ȯ���ϰ� ����� �� ���� ���ҿ� ���� Ȯ���� �����Ѵ�.
			while(bagObj != null)
			{
				System.out.println(bagObj);
				bagObj = ((ArrayBag)BG).getNext();
			}
		}
		else if(BG instanceof ArraySet)
		{
			Object setObj = ((ArraySet)BG).getFirst();

			while(setObj != null)
			{
				System.out.println(setObj);
				setObj = ((ArraySet)BG).getNext();
			}
		}
		else
		{

		}
	}


	public static void remove(Object BG, Object object){
		if(BG instanceof ArrayBag)
		{
			Object bagObj = ((ArrayBag)BG).getFirst();

			// Bag�� �ߺ��Ǵ� ���Ұ� �ֱ� ������ ���� ��� ���ҿ� ���ؼ� ���������� ����� ���� �Է¹��� object���� ���Ͽ� ������ �����Ѵ�.
			// ���� ������ print() �޼ҵ忡�� ����� ����� �����ϴ�.
			while(bagObj != null)
			{
				if(bagObj == object){
					((ArrayBag)BG).remove(object);
				}

				bagObj = ((ArrayBag)BG).getNext();
			}
		}
		else if(BG instanceof ArraySet)
		{
			// Set�� �ߺ��Ǵ� ���Ұ� �����Ƿ� �ϳ��� ���ҿ� ���ؼ��� ������ �����Ѵ�.
			((ArraySet)BG).remove(object);
		}
		else
		{

		}
	}

	public static void removeDifferentElements(BS b1, BS b2)
	{
		Object b1obj = b1.getFirst();

		// b1�� ���ҿ� ���ؼ� b2�� �����ϴ��� Ȯ��
		while(b1obj != null) 
		{
			// Case 1) b2�� �����ϴ� ��� -> b1���� �ش� ���Ҹ� ��� ����[this.remove(...) �޼ҵ�]�ϰ� �˻��� ���� ���Ҹ� ù��° ���ҷ� ������ �� �˻縦 ��� �����Ѵ�.
			if(!b2.contains(b1obj))
			{
				remove(b1, b1obj);
				b1obj = b1.getFirst();
				continue;
			}
			
			// Case 2) b2�� �������� �ʴ� ��� -> b1�� ���� ���ҿ� ���ؼ� �˻縦 �����Ѵ�.
			b1obj = b1.getNext();
		}
	}
}

