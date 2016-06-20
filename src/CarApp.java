
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car(25,"jetta", "red");
		Car car2 = new Car (40,"camaro","blue");
		
		car1.accelerate();
		car2.accelerate();
		car1.run();
		car2.run();
		car1.stop();
		car2.stop();	
	}

}
