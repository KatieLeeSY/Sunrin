package exam03_�ǽ�����2;
class Car{
	String name = "��";
	String print(){
		return "���� "+name+"�̴�";
	}
}
class Bus extends Car{
	String name = "����";
	String print(){ // �޼ҵ� �������̵� : �ڽ� �޼ҵ� �켱
		return "���� ������ "+name+"�̴�.";
	}
}
public class CastingExam {
	public static void main(String[] args) {
		Car myCar = new Car(); Car yourCar;
		Bus myBus = new Bus(); Bus yourBus;

		System.out.println(myCar.print());
		System.out.println(myBus.print());
		
//		yourCar = myBus; // ��ĳ���� : �ڽİ�ü -> �θ�ó�� �ൿ�ϱ⶧��
//		yourBus = (Bus)yourCar; // �ٿ�ĳ���� : ��ĳ���� ���� -> �ڽ�Ÿ������ ��ȯ
		
		yourBus = (Bus)myCar; // ��ĳ������ ���� �ٿ�ĳ���� �Ǿ��� ����.
		System.out.println(yourBus.print());		
	}

}





