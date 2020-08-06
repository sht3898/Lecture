package Pracitce7;

public class Vehicle {
	private double kiloToNewts(double weight){
		return (weight*9.8);
	}
	private double newtsToKilo(double weight){
		return (weight/9.8);
	}
	private double load;
	private double maxLoad;
	
	public Vehicle(double max_load){
		maxLoad = kiloToNewts(max_load);
	}
	public double getLoad(){
		return newtsToKilo(load);
	}
	public double getMaxLoad(){
		return newtsToKilo(maxLoad);
	}
	public boolean addBox(double weight){
		load+=kiloToNewts(weight);
		if(load<=maxLoad){
			return true;
		}
		else load-=kiloToNewts(weight); 
		return false;
	}
}
