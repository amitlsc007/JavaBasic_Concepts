package OOPS_Concepts;

public class TestCar {
	
public static void main(String[] args) {


	BMW b = new BMW();
	
	b.start(); //compile time polymorphism
	b.stop();
	b.refuel();
	b.theftSafety();
	
	Car c = new Car();
	c.start();
	c.stop();
	c.refuel();
	
	//top casting:
	Car c1 = new BMW(); //child class object can be referred by parent class ref variable
	c1.start(); //run time polymorphism
	c1.stop();
	c1.refuel();
	
}
	}

