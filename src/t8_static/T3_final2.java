package t8_static;

public class T3_final2 {
	final String nation = "korea";
	final String jimin;  
	String name;
	
//	public T3_final2() {} 
	//final을 사용하려면 처음 값을 하나 주어야 한다. ==> 생성자로 주어야 한다. 주지 않아서 오류가 난다.
	
//	T3_final(String nation){
//		this.nation = nation;
//	} //final 때문에 안됨
	
	T3_final2(String jimin){
		this.jimin = jimin;
	}
	
	public String getNation() {
		return nation;
	}
	
}
