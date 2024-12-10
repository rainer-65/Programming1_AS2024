package lecture11.examples;

class Vehicle extends Object {	
}
class Bus extends Vehicle{
}
class Car extends Vehicle {
}
class BMW extends Car {
}

public class VehicleCasting {

	public static void main(String[] args) {
		Vehicle v1 = new Car();  
		Vehicle v2 = new Vehicle();
		// Car c0 = v1;  // Wrong compile time error "Type Mismatch" Explicit or downcasting is required
		Car c1 = (Car) v1; // Right. Downcasting or explicit casting. v1 has a knowledge of Car due to line 1		 
		Car c2= (Car) v2;  // Wrong. Runtime exception ClassCastException because v2 has no knowledge of Car.
		// Bus b1 = new BMW();  //Wrong. Compile time error "type mismatch"
		Car c3 = new BMW(); //Right. Upcasting or implicit casting
		Car c4 = (BMW) v1; // Wrong. Runtime exception ClassCastException
		Object o = v1;  // v1 can only be upcast to its parent
		Car c5 = (Car) v1; // v1 can be downcast to Car due to line 1    
	}

}
