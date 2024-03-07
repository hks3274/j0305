package t8_static;

public class T3_final {
	final String nation = "korea";
	String jimin;
	String name;
	
	public T3_final() {}
	
//	T3_final(String nation){
//		this.nation = nation;
//	} //final 때문에 안됨
	
	T3_final(String jimin){
		this.jimin = jimin;
	}
	
	public String getNation() {
		return nation;
	}
	
}
