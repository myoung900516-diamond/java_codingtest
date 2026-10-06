package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//java collection framework 중 Set 의 예시를 들고 이해하기 
public class SetExample {
	public static void main(String[] args) {
		
	
	
	//저장소 생성
	Set<String> a = new TreeSet<>();//트리 구조를 사용하는 저장소
	Set<String> b = new HashSet<>();//해시 구조를 사용하는 저장소
	
	//구조가 달라도 보관은 set에 하기 때문에 명령은 set명령을 사용
	//작은거 왼쪽 큰거 오른쪽
	//내가 추가한 순서는 의미가 없다. 
	//트리는 정렬하면서 저장을 하고, 해시는 해시테이블에 분류하면서 저장을 함 
	//트리는 순서가 바뀌지 않지만, 해시는 약간은 바뀔 수 있음. 
	//인덱스가 없다. 
	//순서가 의미가 없다. 
	//추가
	a.add("피카츄");
	a.add("라이츄");
	a.add("파이리");
	a.add("이상해씨");
	
	
	b.add("피카츄");
	b.add("라이츄");
	b.add("파이리");
	b.add("이상해씨");
	
	//개수확인
	System.out.println("a의 개수 = " + a.size());
	System.out.println("b의 개수 = " + b.size());
	
	//검색
	System.out.println("피카츄? = " + a.contains("피카츄"));
	System.out.println("뮤츠? = " + b.contains("뮤츠"));
	
	
	
	//출력
	System.out.println("a = " + a);
	System.out.println("b = " + b);

	//트리구조 
	//초기 용량이 없음. 연결구조를 가짐. 
	//해시구조는 데이터가 없어도 테이블이 있어야함. 초기용량(16개)이랑 로드팩터(증가비율, 75%)이 있음. 
	//(중요) 트리와 해시는 구조적으로 동일(중복)데이터 저장이 안됨. 
	
	a.add("피카츄");
	System.out.println("a = " + a);
	
	//삭제
	//-리스트와 같은 명령을 사용하지만 "위치"로 지우는 명령은 없다. (위치란 개념이 없다)
	a.remove("파이리");
	System.out.println("a = " + a);
	
	
	//(중요) 위치란 개념이 없기 때문에 리스트의 get()은 존재하지 않는다. 
	//검색이 엄청 빠르다.(리스트보다)
	//유무파악 : 팔로우 했을가 아닐까 좋아요 눌렀냐 안눌렸냐. 상품을 구매한적이 있냐 없냐, 단축키 누른 것도 set으로 관리 
	
	
	//Set 주 사용 목적
	// - 전체에 대한 아주 빠른 접근을 위한 저장소 
	
	
	}
}
