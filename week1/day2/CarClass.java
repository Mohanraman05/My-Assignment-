package week1.day2;

public class CarClass {
		
	public void  printCar() {
		System.out.println("Audi");
	}
public int printCarReg(){
	int regno=4242;
 return regno;
	}
public boolean isPuncture() {
	return false;
	}
public int multiplication(int a, int b, int c) {
	int  d =a*b*c;
	return d;
	}
public String carModel() {
	String model="A3";
	return model;
}
public static void main(String[] args) {
	CarClass obj =new CarClass();
	obj.printCar();
	int regno = obj.printCarReg();
	System.out.println(regno);
	boolean isPuncture = obj.isPuncture();
	System.out.println("Tyre Puncture " + isPuncture);
	int multiplication = obj.multiplication(4, 5, 6);
	System.out.println(multiplication);
	String model=obj.carModel();
	System.out.println(model);
	
	
}
}