package t6_exam;

public class Test1_Service {

	public void print(Test1_VO vo) {
		
		baseSalary(vo.getCode(), vo);
		vo.setSudang(vo.getOverTime()*25000);
		vo.setGonngje((int)(vo.getBonbong()+vo.getSudang()*0.1));
		vo.setNetpay(vo.getBonbong()+vo.getSudang()-vo.getGonngje());
		
		System.out.println("사원코드: "+vo.getNo()+", 성명:"+vo.getName()+", 직급:"+vo.getPosition()+", 초과시간:"+vo.getOverTime()+", 실수령액: "+vo.getNetpay());
	}

	void baseSalary(String code, Test1_VO vo) {
		if(vo.getCode().toUpperCase().equals("B")) {
			vo.setBonbong(5000000);
			vo.setPosition("부장");
		}
		else if(vo.getCode().toUpperCase().equals("K")) {
			vo.setBonbong(4000000);
			vo.setPosition("과장");
		}
		else if(vo.getCode().toUpperCase().equals("D")) {
			vo.setBonbong(3000000);
			vo.setPosition("대리");
		}
		else if(vo.getCode().toUpperCase().equals("S")) {
			vo.setBonbong(2000000);
			vo.setPosition("사원");
		}
		else {
			vo.setBonbong(0);
			vo.setPosition("비사원");
		}
	}

}
