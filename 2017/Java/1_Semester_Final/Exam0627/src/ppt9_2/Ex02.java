package ppt9_2;
class Car{
	String name = "��";
	String print(){
		return "[���� "+name+"�̴�.]";
	}
}
class Bus extends Car{
	String name = "����";
	String print(){
		return "[���� ������ "+name+"�̴�.]";
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
