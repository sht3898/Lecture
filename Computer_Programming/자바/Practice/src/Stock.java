
public class Stock {
	private int good_Num;
	private int good_Count;
		public void goodUp(int good_Num, int good_Count){
			this.good_Num = good_Num;
			this.good_Count+=good_Count;
			System.out.println("상품번호는 "+this.good_Num+"수량은 "+this.good_Count);
		}

}
