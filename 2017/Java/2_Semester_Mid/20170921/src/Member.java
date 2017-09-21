import java.io.Serializable;

public class Member implements Serializable {
	private String name;
	private String secretInfo;
	
	public Member(String name) {
		this.name = name;
		this.secretInfo = "ºñ¹Ð";
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", secretInfo=" + secretInfo + "]";
	}

}
