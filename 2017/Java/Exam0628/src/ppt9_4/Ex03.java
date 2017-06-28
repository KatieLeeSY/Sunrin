package ppt9_4;
class CarA{
	private String name = "자동차";
	void drive(){
		System.out.println(name + "가 달립니다.");
	}
}
class AmbulanceA extends CarA{
	private String name = "구급차";
	void dispatch(){
		System.out.println(name + "가 출동합니다.");
	}
}
class Bus extends CarA{
	private String name = "버스";
	void run(){
		System.out.println(name + "가 운행합니다.");
	}
}
public class Ex03 {
	public static void drive(CarA tmp){
		if(tmp instanceof AmbulanceA) ((AmbulanceA)tmp).dispatch();
		else if(tmp instanceof Bus) ((Bus)tmp).run();
		else tmp.drive();
		
	}
	public static void main(String[] args) {
		drive(new CarA());
		drive(new AmbulanceA());
		drive(new Bus());

	}

}
