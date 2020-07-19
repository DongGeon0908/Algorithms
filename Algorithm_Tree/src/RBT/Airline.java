package RBT;

public class Airline {
	private String code;
	private String name;
	
	public Airline(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	//code ����;��
	public int compareTo(Airline that) {
		return this.code.compareTo(that.code);
	}
	
	public String toString() {
		return "----( " + code + " )	" + name;
	}
}
