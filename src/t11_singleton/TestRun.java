package t11_singleton;

public class TestRun {
	public static void main(String[] args) {
		Singleton mbc = Singleton.getInstance();
		Singleton kbs = Singleton.getInstance();
		//두개는 같은 객체이다.
		
		if(mbc == kbs) System.out.println("kbs와 mbc는 서로 같은 객체를 가리키고 있습니다");
		else System.out.println("kbs와 mbc는 서로 다른 객체를 가리키고 있습니다");
	}
}
