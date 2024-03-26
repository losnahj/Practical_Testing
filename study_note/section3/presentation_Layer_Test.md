# Presentataion Layer 테스트
## 테스트 중점
* 사용자 요청을 가장 먼저 받는 레이어
* 요청 파라미터 검증
* 그 외 Business Layer / Persitence Layer 는 Mock 처리하여 테스트

## 어떻게?
### Mockito
Mockito는 Mock 테스트를 지원하는 테스트 프레임 워크로 테스트가 어려운 의존성 객체들을 가짜 객체로 만들어준다.

### 💡Tip) 얇은 기능(로직이 간단한) 테스트는 겹치는 부분이 많더라도, 꼼꼼히 작성하자.
추후 여러 기능들이 추가되기 때문에 처음에 잘 짜놓아야한다.

### 💡Tip) 증감에 따른 동시성 이슈
* DB 상에서 해당 컬럼을 유니크 타입으로 변경
* UUID 사용
 
## 📑인프런 강의 질문 정리
### 📌데이터 클렌징 작업은 @BeforEach 보다 @AfterEach 추천
아무래도 본인이 작성한 테스트 코드에서 사용하는 데이터를 테스트 후 클렌징 하는 것이 확실하다는 것이다.</br>
**만약** 테스트 이전에 데이터 클렌징을 한다면, 본인이 필요하다고 생각하는 데이터만 클렌징 할 것이지만 다른 부분에서 영향을 끼칠 수 있기 때문이다.</br></br>
**즉, 본인이 테스트 한 데이터는 본인이 클렌징 하는 것이 좀 더 확실한 방법이라 생각한다.**

### 📌private 접근 제어자와 @Builder 같이 쓰는 이유
외부에서 직접 생성자를 호출 하지 못하도록 막아 Builder를 직접 호출하여 생성하도록 만들어주기위함

### 📌@Transactional(readOnly = true) 사용 이점
Service Class에 @Transcation(readOnly = true) 작성 후 CUD 작업이 필요한 매서드에 @Transcation 어노테이션을 추가한다.

### 📌CQRS 성능 이점 