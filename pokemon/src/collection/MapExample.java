package collection;

import java.util.HashMap;
import java.util.Map;

//java collection framework 중 Map의 예시를 들고 이해하기
public class MapExample {
	
	public static void main(String[] args) {
		
	
	
	//키 밸류 저장소
	//개별 데이터에 대한 매우 빠른 접근을 위한 저장소. 
	//비선형구조, `이름=값`을 세트로 저장하는 저장소
	// - `HashMap<K, V>` : `해시`알고리즘에 의해서 `이름`이 관리되는 데이터 저장소
	// - `TreeMap<K, V>` : `트리`알고리즘에 의해서 `이름`이 관리되는 데이터 저장소
	
	//Map을 이용해서 이름(key)과 값(value)을 세트로 저장 
	// - 포켓몬의 "몬스터명"과 "몬스터속성"을 저장
	// - 이름은 중복이 불가능하다 값은 중복이 가능하다. 
	// - 이름(key)은 "몬스터명"을 사용, 값(value)에는 "몬스터속성"을 사용
	
	//저장소 생성
//	Map<몬스터명, 몬스터속성> pokemon = new HashMap<>();
	Map<String, String> pokemon = new HashMap<>();
	
	//데이터추가 - Map에서는 put(k, v)를 사용
	pokemon.put("이상해씨", "풀");
	pokemon.put("피카츄", "전기");
	pokemon.put("라이츄", "전기");
	pokemon.put("파이리", "불꽃");
	
	//같은 key를 넣으면 value가 수정됨
	pokemon.put("이상해씨", "독");
	
	//데이터개수
	System.out.println("데이터개수 = " + pokemon.size());
	
	//출력
	System.out.println("pokemon = " + pokemon);
	
	//데이터 검색 - 
	System.out.println("피카츄? " + pokemon.containsKey("피카츄"));
	System.out.println("전기? " + pokemon.containsValue("전기"));
	
	//데이터 삭제 - 
	pokemon.remove("피카츄");
	System.out.println("pokemon = " + pokemon);
	
	//데이터추출
	System.out.println("피카츄 = " + pokemon.get("피카츄"));
	System.out.println("라이추 = " + pokemon.get("라이츄"));
	
	}
}
