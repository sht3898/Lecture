
public class Yunsueb {
	double width;
	double height;
	
	public double area(){
		return width*height;
	}
	public double perimeter(){
		return 2*(width+height);
	}
}

class Test{
	public static void main(String[] args){
		Yunsueb y = new Yunsueb();
		y.height=10;
		y.width=5;
		System.out.print(y.area());
		System.out.print(y.perimeter());
	}
}