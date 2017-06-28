package exam03_실습예제2;
class Car{
	String name = "차";
	String print(){
		return "나는 "+name+"이다";
	}
}
class Bus extends Car{
	String name = "버스";
	String print(){ // 메소드 오버라이딩 : 자식 메소드 우선
		return "차의 종류는 "+name+"이다.";
	}
}
public class CastingExam {
	public static void main(String[] args) {
		Car myCar = new Car(); Car yourCar;
		Bus myBus = new Bus(); Bus yourBus;

		System.out.println(myCar.print());
		System.out.println(myBus.print());
		
//		yourCar = myBus; // 업캐스팅 : 자식객체 -> 부모처럼 행동하기때문
//		yourBus = (Bus)yourCar; // 다운캐스팅 : 업캐스팅 전제 -> 자식타입으로 변환
		
		yourBus = (Bus)myCar; // 업캐스팅이 없이 다운캐스팅 되었기 때문.
		System.out.println(yourBus.print());		
	}

}





