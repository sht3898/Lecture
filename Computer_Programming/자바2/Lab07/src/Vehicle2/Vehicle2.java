package Vehicle2;

public class Vehicle2 {
	private double load;
	private double maxLoad;
	
	public Vehicle2(double max_load){
		maxLoad = max_load;
	}
	public double getLoad(){
		return load;
	}
	public double getMaxLoad(){
		return maxLoad;
	}
	public boolean addBox(double weight){
		load+=weight;
		if(load<=maxLoad){
			return true;
		}else {
			load-=weight;
			return false;
		}
	}
}
