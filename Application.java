package Rishada;
import Modal.*;

public class Application {
public static void main(String[] args) {
	System.out.println("Hello Java");
	
	Vehicle car = new Car();
	car.move();
	car.stop();
	
	Airplane airplane = new Airplane();
	airplane.move();
	airplane.stop();
			
	
	
			}
}
