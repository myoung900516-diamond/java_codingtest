package collection;

import java.util.ArrayList;
import java.util.List;

//java collection framework 중 List예시 들어 이해하기 
public class ListExample {

	//컬렉션 프레임워크는 대용량 저장소이다 사용빈도가 높다 
	//자바에서는 하나의 시스템을 구축을 할 때 인터페이스로 구축을 한다. 특징으로 구축한다. 
	//List는 인터페이스이다. 
	//순서를 보존하는 저장소 
	
	
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
		
		
		
		//LinkedList와 ArrayList의 차이
		// 선형구조 : 시작과 끝이 정해져 있는 저장소 , 양쪽 끝이 있는 것. 
		// ArrayList는 데이터가 배열처럼 붙어있다. = 복도식 아파트 같은 구조
		// 장점 ? 같은 양을 돌릴 때 압도적으로 빨리 끝남. 빠른 접근 및 조회 속도 
		//    - 개수가 변하지 않을 때 좋음 
		// 단점 ? 중간에 추가 혹은 삭제가 발생하면 대량 변화 발생. 성능 저하 발생
		// LinkedList는 데이터 간 거리가 일정하지 않다. = 단독주택 단지같은 구조 
		// 장점 ? 손쉬운 변화. 추가 및 삭제가 쉬움 
		// 단점 ? ArrayList에 비해 느린 접근 속도 
		
		
		
		
		
		
	}
	
}
