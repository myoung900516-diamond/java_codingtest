package collection;

import java.util.ArrayList;
import java.util.List;

//java collection framework 중 List예시 들어 이해하기 
public class ListExample {

	//컬렉션 프레임워크는 대용량 저장소이다 사용빈도가 높다 
	//자바에서는 하나의 시스템을 구축을 할 때 인터페이스로 구축을 한다. 특징으로 구축한다. 
	//List는 인터페이스이다. 
	//순서를 보존하는 저장소 
	
	//ArrayList
	public static void main(String[] args) {
		
		//객체 생성
		//ArrayList는 택배상자이다. 그 상자 안에 무엇이 들어있을지 말해줘야 한다(제네릭타입 Generic Type)
		//제네릭타입에는 반드시 클래스만 가능(즉, 원시형은 불가)
		ArrayList<String> a = new ArrayList<String>();
		
		//업캐스팅
		//왼쪽은 보관하는 곳, 오른쪽은 실제 물건 
		List<String> d = new ArrayList<String>();
		List<String> e = new ArrayList<>();//자료형 생략 
		
		//저장소 사용(데이터 추가, 확인, 삭제 등...)
		e.add("피카츄");
		e.add("뮤츠");
		e.add("이상해씨");
		e.add("파이리");
		
		//출력
		System.out.println("e = " + e);
		
		System.out.println(e.get(0));
		
		//데이터 개수 확인
		System.out.println(e.size());
		
		//데이터검색
		System.out.println(e.contains("뮤츠"));
		
		//데이터 삭제
		e.remove(1);//1번 위치 데이터 삭제(뮤츠)
		System.out.println("e = " + e);
		
		e.remove("이상해씨");
		System.out.println("e = " + e);
		
		
		//List 주 사용 목적
		// - 전체에 대한 접근 및 인덱스를 활용한 개별 접근 모두 가능한 저장소 
		// - 하이브리드
		// - 전체 조회도 어느정도, 개별 조회도 어느정도 
		
		
		
	}
	
}
