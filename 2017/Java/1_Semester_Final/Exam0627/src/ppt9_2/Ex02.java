package ppt9_2;
class Car{
	String name = "차";
	String print(){
		return "[나는 "+name+"이다.]";
	}
}
class Bus extends Car{
	String name = "버스";
	String print(){
		return "[차의 종류는 "+name+"이다.]";
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Car myCar = new Car(), yourCar;
		Bus myBus = new Bus(), yourBus;
		
		System.out.println(myCar.print());
		System.out.println(myBus.print());
		yourCar = myBus;
		yourBus = (Bus)yourCar;
		System.out.println(yourBus.print());

	}

}
