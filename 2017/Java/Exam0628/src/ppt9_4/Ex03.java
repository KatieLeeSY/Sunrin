package ppt9_4;
class CarA{
	private String name = "�ڵ���";
	void drive(){
		System.out.println(name + "�� �޸��ϴ�.");
	}
}
class AmbulanceA extends CarA{
	private String name = "������";
	void dispatch(){
		System.out.println(name + "�� �⵿�մϴ�.");
	}
}
class Bus extends CarA{
	private String name = "����";
	void run(){
		System.out.println(name + "�� �����մϴ�.");
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
