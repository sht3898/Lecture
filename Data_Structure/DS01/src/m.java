
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

		if(BG instanceof ArrayBag)	// instanceof : 객체의 클래스를 검사하기위해 사용
		{
			Object bagObj = ((ArrayBag)BG).getFirst();	// BG는 인터페이스이기 때문에 구현된 ArrayBag을 사용하기 위해 형변환(type casting)을 한다.

			// Bag에서 매번 원소의 존재여부를 확인하고 출력한 뒤 다음 원소에 대한 확인을 진행한다.
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

			// Bag은 중복되는 원소가 있기 때문에 백의 모든 원소에 대해서 순차적으로 저장된 값을 입력받은 object값과 비교하여 삭제를 진행한다.
			// 순차 접근은 print() 메소드에서 사용한 방법과 동일하다.
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
			// Set은 중복되는 원소가 없으므로 하나의 원소에 대해서만 삭제를 진행한다.
			((ArraySet)BG).remove(object);
		}
		else
		{

		}
	}

	public static void removeDifferentElements(BS b1, BS b2)
	{
		Object b1obj = b1.getFirst();

		// b1의 원소에 대해서 b2에 존재하는지 확인
		while(b1obj != null) 
		{
			// Case 1) b2에 존재하는 경우 -> b1에서 해당 원소를 모두 삭제[this.remove(...) 메소드]하고 검사할 다음 원소를 첫번째 원소로 지정한 후 검사를 계속 진행한다.
			if(!b2.contains(b1obj))
			{
				remove(b1, b1obj);
				b1obj = b1.getFirst();
				continue;
			}
			
			// Case 2) b2에 존재하지 않는 경우 -> b1의 다음 원소에 대해서 검사를 진행한다.
			b1obj = b1.getNext();
		}
	}
}

