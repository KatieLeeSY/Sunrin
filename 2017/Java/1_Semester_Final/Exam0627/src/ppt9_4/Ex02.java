package ppt9_4;
class Car{}
class Ambulance extends Car{}
public class Ex02 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Ambulance();
		Ambulance am = (Ambulance)c2;
		if(c1 instanceof Ambulance)
			System.out.println("c1: Ambulance 按眉");
		if(c1 instanceof Car)
			System.out.println("c1: Car 按眉");
		if(c1 instanceof Object)
			System.out.println("c1: 按眉");
		System.out.println();
		if(c2 instanceof Ambulance)
			System.out.println("c2: Ambulance 按眉");
		if(c2 instanceof Car)
			System.out.println("c2: Car 按眉");
		if(c2 instanceof Object)
			System.out.println("c2: 按眉");
	}

}
