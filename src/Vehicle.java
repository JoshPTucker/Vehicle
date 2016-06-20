
public abstract class Vehicle {
		private int speed;
	
		public int getSpeed(int s){
			return s;
		}
		public void accelerate(){
			System.out.println("The vehicle is accelerating");
		}
		public void run(){
			System.out.println("The vehicle is going");
		}
		public void stop(){
			System.out.println("The vehicle has stopped");
		}
}
