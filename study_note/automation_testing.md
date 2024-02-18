# 자동 테스트
## 단위 테스트
**단위 테스트**란 클래스 또는 메서드를 테스트 하는 용어로 외부 의존성을 필요로 하지 않는 수준에서의 테스트 라고 말한다.

### 단위 테스트의 장점
단위 테스트는 클래스 또는 매서드를 테스트 하기 때문에 통합 테스트 보다 빠르고 안정적이다.

### 테스트 방법
자바에선 JUnit 5 버전을 사용하며, 추가로 AssertJ 라이브러리를 활용하여 테스트를 작성한다.

```groovy
dependencies {
    // test
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```
Spring Boot Starter Test 의존성을 추가하면, JUnit5와 AssertJ 기능을 모두 사용할 수 있다.
**assertThat Import 필요**
```java
import static org.assertj.core.api.Assertions.assertThat;
```
