package exam02;
class Car{ }
class Bus extends Car{ }
class Truck extends Car{ }
public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		Bus myBus = new Bus();
		Truck myTruck = new Truck();
		
		// ��ĳ���� (�ڵ�����ȯ : �θ���������->�ڽİ�ü : �θ�ó�� �ൿ)
//		myCar = myBus;//������ ����,���� ����

		// �ڽ����� ����-> �θ�ü (X)
//		myBus = myCar; //������ ����
		
		// ���� ���þ��� Ŭ����Ÿ�� ����ȯ? (X)
//		myBus = myTruck; //������ ����
		
		// �θ�ü �״�� �ִ� ���¿���, �ڽ� Ÿ������ ��������ȯ (X)
//		myBus = (Bus)myCar; // �ٿ�ĳ����: ������ ����, ���� ����
		
		myCar = myBus; // ��ĳ���� : �θ��������� -> �ڽİ�ü (o)
		Bus myBus2 = (Bus)myCar; // �ٿ�ĳ����: ������, ���� O
	}
}






