
public class Stock {
	private int good_Num;
	private int good_Count;
		public void goodUp(int good_Num, int good_Count){
			this.good_Num = good_Num;
			this.good_Count+=good_Count;
			System.out.println("��ǰ��ȣ�� "+this.good_Num+"������ "+this.good_Count);
		}

}
