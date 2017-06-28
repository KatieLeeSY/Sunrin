package exam02;
class Car{ }
class Bus extends Car{ }
class Truck extends Car{ }
public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		Bus myBus = new Bus();
		Truck myTruck = new Truck();
		
		// 업캐스팅 (자동형변환 : 부모참조변수->자식객체 : 부모처럼 행동)
//		myCar = myBus;//컴파일 가능,실행 가능

		// 자식참조 변수-> 부모객체 (X)
//		myBus = myCar; //컴파일 에러
		
		// 서로 관련없는 클래스타입 형변환? (X)
//		myBus = myTruck; //컴파일 에러
		
		// 부모객체 그대로 있는 상태에서, 자식 타입으로 강제형변환 (X)
//		myBus = (Bus)myCar; // 다운캐스팅: 컴파일 가능, 실행 에러
		
		myCar = myBus; // 업캐스팅 : 부모참조변수 -> 자식객체 (o)
		Bus myBus2 = (Bus)myCar; // 다운캐스팅: 컴파일, 실행 O
	}
}






