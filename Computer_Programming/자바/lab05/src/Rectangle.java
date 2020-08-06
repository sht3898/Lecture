
public class Rectangle {
	
	static int count = 0;
//	가로값
//	세로값
	double width;
	double height;
	/**
	 * 직사각형의 넓이 구하는 함수
	 * @return 넓이
	 */
	public double area(){
		return width*height;
	}
	/**
	 * 직사각형의 둘레 구하는 함수
	 * @return 둘레
	 */
	public double perimeter(){
		return width*2 + height*2;
	}
}
