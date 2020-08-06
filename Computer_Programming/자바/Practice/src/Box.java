
public class Box {
	private double width, height, length;
	
	public void setWidth(double w){
		width=w;
	}
	public double getWidth(){
		return width;
	}
	public void setHeight(double h){
		height=h;
	}
	public double getHeight(){
		return height;
	}
	public void setLength(double l){
		length=l;
	}
	public double getLength(){
		return length;
	}
	public double getVolume(){
		return width*height*length;
	}
	

}
