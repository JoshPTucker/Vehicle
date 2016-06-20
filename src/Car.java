
public class Car extends Vehicle {
	private int speed;
	private String color;
	private String model;
	public Car(){
		
	}
	public  Car(int speed, String model, String color ){
		this.color=color;
		this.speed=speed;
		this.model=model;
	}
	public void accelerate(){
		System.out.println("The "+color+" "+model+" is accelerating");
	}
	public void run(){
		System.out.println("The "+color+" "+model+" is going "+speed );
	}
	public void stop(){
		System.out.println("The "+color+" "+model+" has stopped");
	}
	public String getColor(){
		return color;
	}
}
