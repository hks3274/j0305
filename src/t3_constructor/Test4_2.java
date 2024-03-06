package t3_constructor;

public class Test4_2 {
	
	String model;
	String color = "검정색";
	int speed;
	
	
	Test4_2(String model){
		this(model,null,250);
	}
	
	Test4_2(String model, String color){
		this(model,color,0); // 세개 변수의 타입이 같은 것을 찾는다. this. = 매개변수를 찾는다. 
	}
	
	Test4_2(String model, String color,int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

	
}
