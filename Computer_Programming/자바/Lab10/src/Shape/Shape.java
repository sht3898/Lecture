package Shape;

public abstract class Shape implements Comparable{
	int x, y;
	Shape s[] = new Shape[5];
	public void draw(){
		
	}
	public double area(){
		return x;
			
	}
	public int compareTo(Object otherObject){
		Shape other = (Shape) otherObject;
		if(this.area()<other.area()) return -1;
		else if (this.area()>other.area()) return 1;
		else return 0;
	}
}