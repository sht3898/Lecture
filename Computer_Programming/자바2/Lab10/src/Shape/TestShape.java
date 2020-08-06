package Shape;

import java.util.Arrays;

public class TestShape {

	public static void main(String[] args) {
		Shape[] arrayOfShape = new Shape[5];
		arrayOfShape[0] = new Rectangle(10,2);
		arrayOfShape[1] = new Triangle(4,5);
		arrayOfShape[2] = new Circle(3);
		arrayOfShape[3] = new Rectangle(20,5);
		arrayOfShape[4] = new Triangle(20,20);
		System.out.println("수정 전=============================");
		for(int i=0; i<arrayOfShape.length;i++){
			System.out.println("도형의 넓이: "+arrayOfShape[i].area());
		}
		System.out.println("수정 후=============================");
		Arrays.sort(arrayOfShape);
		for(int i=0; i<arrayOfShape.length;i++){
			System.out.println("도형의 넓이: "+arrayOfShape[i].area());
		}
	}

}
