package Shape;

public abstract class Shape implements Comparable{
	private int x,y;
	
	public void draw(){
		
	}
	public double area(){
		return x*y;
	}
	public int compareTo(Object obj){
		Shape other = (Shape) obj;
		if(this.area()<other.area())
			return 1;
		else if(this.area()>other.area())
			return -1;
		else 
			return 0;
	}
	
}
