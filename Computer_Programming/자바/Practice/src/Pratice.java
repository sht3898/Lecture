class ParentClass{
	int data=100;
	public void print(){
		System.out.println("���� Ŭ������ print()�޼ҵ�");
	}
}
public class Pratice extends ParentClass{
	int data=200;
	public void print(){
		super.print();
		System.out.println("���� Ŭ������ print() �޼ҵ�");
		System.out.println(this.data);
		System.out.println(super.data);
	}
	public static void main(String[] args){
		Pratice obj = new Pratice();
		obj.print();
	}
}