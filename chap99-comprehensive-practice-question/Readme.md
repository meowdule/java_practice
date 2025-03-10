# 📝 자가진단 테스트 시스템

## 1️⃣ 개요
🔹 다양한 **자가진단 테스트**를 제공하는 콘솔 기반 애플리케이션

✅ 사용자는 각 테스트에서 질문에 응답하고, 점수에 따라 자동으로 결과를 받을 수 있습니다.  
✅ 이 프로젝트는 **IntelliJ IDEA**에서 실행되며, 별도의 외부 실행 환경 없이 IDE 내부에서만 동작합니다.

---

<br>

## 2️⃣ 주요 기능

###  **1) 회원 관리**
-  사용자는 회원가입을 통해 개인 계정을 생성하고 로그인 가능
-  로그인한 사용자만 테스트를 실행하고 결과를 조회 가능
-  회원 정보는 JSON 기반의 데이터 저장소(`user_data.json`)에서 관리됨

###  **2) 테스트 진행**
-  사용자는 제공된 테스트 목록에서 원하는 테스트를 선택하여 진행
-  각 테스트는 고유한 질문 목록과 응답 기준을 포함
-  사용자가 응답한 점수를 기반으로 결과 자동 계산

###  **3) 결과 분석 및 해석**
-  응답 점수를 바탕으로 `ScoreEvaluator`에서 결과 해석 후 출력
-  각 테스트별 점수 기준을 정렬하여 보기 쉽게 출력
-  결과 해석 기준(`Score Criteria`)을 함께 제공

###  **4) 검사 기록 관리**
-  사용자는 자신의 검사 기록을 조회 가능
-  테스트 완료 후 기록이 `user_data.json`에 자동 저장됨
-  사용자가 탈퇴하면 해당 기록도 삭제됨

###  **5) 확장 가능성 고려**
-  **팩토리 패턴 (`TestFactory`)** 활용하여 새로운 테스트를 쉽게 추가 가능
-  질문 목록 및 응답 매핑을 **JSON 파일**로 관리하여 데이터 변경 용이
-  **역할별 클래스 분리** (`TestService`, `ScoreEvaluator`, `TestDataLoader` 등)로 유지보수성 향상

---

<br>

## 3️⃣ 설계 및 구조

### 📂 **1) 프로젝트 구조**

<details>
 <summary>📂 파일 트리</summary>

```
📂 com.meowdule.practice.comprehensive
 ├── 📂 db
 │   ├── test_questions.json
 │   ├── user_data.json
 ├── 📂 domain
 │   ├── TestType.java
 │   ├── Question.java
 │   ├── TestResult.java
 ├── 📂 repository
 │   ├── TestDataLoader.java
 │   ├── TestFactory.java
 │   ├── UserRepository.java
 │   ├── UserStorage.java
 │   ├── AUDITTest.java
 │   ├── BAITest.java
 │   ├── PHQTest.java
 ├── 📂 service
 │   ├── TestService.java
 │   ├── ScoreEvaluator.java
 │   ├── UserService.java
 │   ├── UserManagementService.java
 │   ├── UserTestHistoryService.java
 └── 📂 ui
     └── Application.java
```

</details>

<br>

### 🏗 **2) 클래스 설명**
#### 📌 **db (데이터 저장소)**
|  클래스명 |  설명 |
|----------|------------------------------------------------|
| `test_questions.json` | 자기진단 검사의 질문과 배점, 점수기준이 포함된 파일 |
| `user_data.json` | 사용자 정보와 검사 기록을 저장하는 파일 |

#### 📌 **domain (도메인 계층)**
|  클래스명 |  설명 |
|----------|------------------------------------------------|
| `TestType` | 테스트 유형을 관리하고 동일한 테스트 유형이 중복 생성되지 않도록 함 |
| `Question` | 각 테스트의 질문과 최대 점수를 저장하는 클래스 |
| `TestResult` | 테스트 수행 후 결과(총 점수, 평가 결과, 최대 점수)를 저장 |

#### 📌 **repository (저장소 계층)**
|  클래스명 |  설명 |
|----------|------------------------------------------------|
| `TestDataLoader` | JSON 파일에서 테스트 질문과 응답 매핑을 로드하는 클래스 |
| `TestFactory` | 자동으로 테스트를 등록하고 관리하는 팩토리 클래스 |
| `UserRepository` | 사용자 정보를 JSON 파일에서 불러오고 저장하는 클래스 |
| `UserStorage` | 사용자 데이터를 저장 및 관리하는 인터페이스 |
| `AUDITTest` | AUDIT-K(알코올 의존) 테스트 정보를 제공하는 클래스 |
| `BAITest` | BAI(불안 장애) 테스트 정보를 제공하는 클래스 |
| `PHQTest` | PHQ-9(우울증 테스트) 정보를 제공하는 클래스 |

#### 📌 **service (서비스 계층)**
|  클래스명 |  설명 |
|----------|------------------------------------------------|
| `TestService` | 테스트 실행 및 사용자 입력을 처리하는 서비스 클래스 |
| `ScoreEvaluator` | 사용자의 점수를 평가하고 결과를 반환하는 클래스 |
| `UserService` | 사용자 로그인, 로그아웃, 회원 관리 로직 담당 |
| `UserManagementService` | 회원가입, 로그인, 탈퇴 기능 제공 |
| `UserTestHistoryService` | 사용자의 검사 기록을 관리하는 서비스 |

#### 📌 **ui (콘솔 UI 계층)**
|  클래스명 |  설명 |
|----------|------------------------------------------------|
| `Application` | 사용자 입력을 받아 테스트를 실행하는 메인 클래스 |

---

<br>

## 4️⃣ 유지보수성 고려 사항

###  **1) 확장 가능성**
-  새로운 테스트 유형 추가 시, `TestFactory`에만 등록하면 자동 적용됨
-  JSON 파일을 수정하여 질문과 응답 매핑을 쉽게 변경 가능

###  **2) 코드 중복 최소화**
-  공통 기능(`TestType`, `ScoreEvaluator`, `TestDataLoader`)을 분리하여 재사용성을 극대화
-  `default` 메서드를 활용하여 중복 코드 제거 (`TestScoreInterpretation.getQuestionCount()` 등)

###  **3) 역할별 명확한 분리**
-  `domain`: 데이터 객체 관리
-  `repository`: 데이터 로드 및 테스트 유형 관리
-  `service`: 테스트 실행 및 결과 평가
-  `ui`: 사용자 입력 및 콘솔 출력

###  **4) 테스트 자동화**
-  `JUnit 5`와 `Mockito`를 활용하여 주요 기능을 단위 테스트
-  `Scanner`를 모킹하여 사용자 입력 없이 테스트 실행 가능

---

<br>

## 5️⃣ 실행 방법

 **1) 프로젝트 열기**
-  IntelliJ IDEA에서 `File -> Open`을 선택하여 프로젝트 디렉터리를 엽니다.

 **2) 실행**
-  `Application` 클래스의 `main` 메서드를 실행하면 콘솔에서 테스트 시작 가능

 **3) 테스트 실행**
-  `test` 패키지에서 JUnit 테스트 실행

---

