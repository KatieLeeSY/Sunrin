package ppt9_3;
class Person{
	private String phone;
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
}
class Teacher extends Person{
	public String getPhone(){
		return "선생님 전화번호: "+super.getPhone();
	}
}
public class Ex03 {

	public static void main(String[] args) {
		Person p = new Teacher();
		p.setPhone("010-1234-5678");
		System.out.println(p.getPhone());
	}

}
