# Java Programming 문제 풀이

이 저장소는 Java Programming 실습 문제 풀이를 포함하고 있습니다.

<br>

## 📂 파일 구조

<details>
<summary><strong>📂 </strong></summary>

<br>

<details>
<summary><strong>📂 chap01-literal-and-variable </strong></summary>
  
```
📂 chap01-literal-and-variable
 ├── 📂 level01.basic
 │   ├── Application1.java
 │   ├── Application2.java
 └── 📂 level02.normal
     ├── Application1.java
     └── Application2.java
```

</details>

<br>

<details>
<summary><strong>📂 chap03-method-and-api </strong></summary>

```
📂 chap03-method-and-api
 ├── 📂 level01.basic
 │   ├── Calculator.java
 │   └── Application.java
 └── 📂 level02.normal
     ├── RandomMaker.java
     └── Application.java
```

</details>

<br>

<details>
<summary><strong>📂 chap04-control-flow </strong></summary>
 
```
📂 chap04-control-flow
 ├── 📂 section01
 │   ├── 📂 level02.normal
 │   │   ├── Application1.java
 │   │   └── Application2.java
 │   ├── 📂 level03.hard
 │   │   ├── Application1.java
 │   │   └── Application2.java
 │   └── 📂 level04.advanced
 │       ├── Application1.java
 │       └── Application2.java
 └── 📂 section02
     ├── 📂 level02.normal
     │   ├── Application1.java
     │   ├── Application2.java
     │   └── Application3.java
     ├── 📂 level03.hard
     │   ├── Application1.java
     │   ├── Application2.java
     │   └── Application3.java
     └── 📂 level04.advanced
         └── Application1.java
```

</details>


<br>

<details>
<summary><strong>📂 chap05-array </strong></summary>
 
```
📂 chap05-array
 ├── 📂 section01.array
 │   ├── 📂 level02.normal
 │   │   ├── Application1.java
 │   │   └── Application2.java
 │   ├── 📂 level03.hard
 │   │   └── Application1.java
 │   └── 📂 level04.advanced
 │       ├── Application1.java
 │       └── Application2.java
 └── 📂 section02.demensional_array
     └── 📂 level03.hard
         └── Application1.java
```

</details>

<br>


<details>
<summary><strong>📂 chap06-class-and-object </strong></summary>
 
```

📂 chap06-class-and-object
 ├── 📂 level01.basic
 │   ├── 📂 student.model.dto
 │   │   └── StudentDTO.java
 │   └── 📂 student.run
 │       └── Application.java
 └── 📂 level02.normal
     ├── 📂 book.model.dto
     │   └── bookDTO.java
     └── 📂 book.run
         └── Application.java
```

</details>

<br>


<details>
<summary><strong>📂 chap08-polymorphism </strong></summary>
 
```

📂 chap08-polymorphism
 └── 📂 level01.basic
     ├── Shape.java
     ├── ShapeManager.java
     ├── Resizable.java
     ├── Circle.java
     ├── Rectangle.java
     ├── Triangle.java
     └── Application.java
```

</details>


<br>

<details>
<summary><strong>📂 chap09-api </strong></summary>
 
```

📂 chap09-api
 └── 📂 level01.basic
     ├── Application1.java
     └── Application2.java
```
</details>

<br>

<details>
<summary><strong>📂 chap10-exception </strong></summary>
 
```

📂 chap10-exception
 ├── 📂 level01.basic
 │   └── Application1.java
 └── 📂 level02.normal
     └── Application2.java
```

</details>

<br>

<details>
<summary><strong>📂 chap11-io </strong></summary>
 
```

📂 chap11-io
 ├── 📂 level01.basic
 │   ├── Application1.java
 │   └── Application2.java
 └── 📂 level02.normal
     └── Application.java
```

</details>


<br>

<details>
<summary><strong>📂 chap12-generic </strong></summary>
 
```

📂 chap12-generic
 └── 📂 level01.basic
     ├── Application1.java
     └── Application2.java
```

</details>

<br>

<details>
<summary><strong>📂 chap13-collection </strong></summary>
 
```

📂 chap13-collection
 └── 📂 level01.basic
     ├── Application1.java
     ├── Application2.java
     ├── Application3.java
     ├── Application4.java
     ├── Application5.java
     └── Application6.java
```

</details>

<br>

<details>
<summary><strong>📂 chap16-stream </strong></summary>
 
```

📂 chap16-stream
 └── 📂 level01.basic
     ├── Application1.java
     ├── Application2.java
     ├── Application3.java
     ├── Application4.java
     ├── Application5.java
     ├── Employee.java
     ├── Order.java
     ├── Student.java
     ├── Movie.java
     └── Book.java
```

</details>

</details>




<br><br><br>

## 📄 실습 문제 내용


<details>
<summary><strong>📁 chap01-literal-and-variable</strong></summary>


<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.level01.basic`
- **구현 클래스:**
  - `Application1.java`
    - 두 개의 정수를 선언하여 사칙연산을 수행하고 결과 출력
  - `Application2.java`
    - 사각형의 넓이와 둘레를 계산하여 출력
<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Application1 --
더하기 결과  : 50
빼기 결과 : -10
곱하기 결과 : 600
나누기한 몫 : 0
나누기한 나머지 : 20
```
```
-- 출력 예시 - Application2 --
면적 : 455.0
둘레 : 97.8
```

</details>

</details>

<br>

<details>

<summary><strong>📂 - Level 02 - Normal</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.level02.normal`
- **구현 클래스:**
  - `Application1.java`
    - 문자 'a'의 유니코드 값을 출력
  - `Application2.java`
    - 국어, 수학, 영어 점수를 저장하고 총점과 평균을 정수로 변환하여 출력
<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Application1 --
문자 a의 unicode : 97
```
```
-- 출력 예시 - Application1 --
총점 : 201
평균 : 67
```

</details>

</details>



</details>

---


<details>
<summary><strong>📁 chap03-method-and-api</strong></summary>


<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

**📌 문제 개요**

- **패키지:** `com.greedy.level01.basic`
- **구현 클래스:**
  - `Calculator.java`
    - `checkMethod()`: 메서드 호출 확인용
    - `sum1to10()`: 1부터 10까지의 합 반환
    - `checkMaxNumber(a, b)`: 두 수 중 큰 값 출력
    - `sumTwoNumber(a, b)`: 두 수의 합 반환
    - `minusTwoNumber(a, b)`: 두 수의 차 반환
  - `Application.java`
    - `main()`: `Calculator`의 모든 메서드를 호출하여 결과 출력

📄 **[문제 PDF 보기](pdf/chap03-method-and-api-practice-quiestion.com.greedy.level01.basic.pdf)**

<details>
<summary>🛠 실행 예시</summary>

```
메소드 호출 확인
1부터 10까지의 합 : 55
두 수 중 큰 수는 20이다.
10과 20의 합은 : 30
10과 5의 차는 : 5
```

</details>

</details>

<br>

<details>
<summary><strong>📂 - Level 02 - Normal</strong></summary>

**📌 문제 개요**

- **패키지:** `com.greedy.level02.normal`
- **구현 클래스:**
  - `RandomMaker.java`
    - `randomNumber(min, max)`: 최소값~최대값 범위의 난수 반환
    - `randomUpperAlphabet(length)`: 랜덤 대문자 문자열 반환
    - `rockPaperScissors()`: 가위, 바위, 보 중 하나 반환
    - `tossCoin()`: 동전 앞면 또는 뒷면 반환
  - `Application.java`
    - `main()`: `RandomMaker`의 모든 메서드를 호출하여 결과 출력

📄 **[문제 PDF 보기](pdf/chap03-method-and-api-practice-quiestion.com.greedy.level02.normal.pdf)**

<details>
<summary>🛠 실행 예시:</summary>

```
-35
SLDIBMELEA
가위
앞면
```
</details>

</details>



</details>

---

<details>
<summary><strong>📁 chap04-control-flow</strong></summary>

<details>
<summary><strong>📂 - section01.conditional</strong></summary>

<details>
<summary><strong>📂 - - Level 02 - Normal</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section01.conditional.level02.normal`
- **구현 클래스:**
  - `Application1.java`
    - 1~10 사이의 정수 입력 후 홀짝 판별
  - `Application2.java`
    - BMI(신체질량지수) 계산 후 결과 출력

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
1 ~ 10 사이 홀수의 경우 "홀수다."
1 ~ 10 사이 짝수의 경우 "짝수다."

단 1 ~ 10 이외의 정수의 경우 "반드시 1~10 사이의 정수를 입력해야 합니다."
```
```
-- 출력 예시 - Applicatoin2 --
저체중(20 미만)인 경우 "당신은 저체중 입니다.",
정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
비만(30이상)인 경우 "당신은 비만 입니다."
```

</details>



</details>

<br>

<details>
<summary><strong>📂 - - Level 03 - Hard</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section01.conditional.level03.Hard`
- **구현 클래스:**
  - `Application1.java`
    - 두 개의 정수와 연산 기호를 입력받아 연산 수행
  - `Application2.java`
    - 입력한 과일 이름에 따른 가격 출력

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
4 + 3 = 7

단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다."
```
```
-- 출력 예시 - Applicatoin2 --
바나나의 가격은 3000원 입니다.

단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다."
```

</details>

</details>

<br>

<details>
<summary><strong>📂 - - Level 04 - Advanced</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section01.conditional.level04.Advanced`
- **구현 클래스:**
  - `Application1.java`
    - 3과목 점수를 입력받아 합격 여부 판단 및 이유 출력
  - `Application2.java`
    - 영업사원의 급여 계산 프로그램 구현

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
평균 점수 미달로 불합격입니다.
영어 점수 미달로 불합격입니다.
수학 점수 미달로 불합격입니다.
```
```
-- 출력 예시 - Applicatoin2 --
======================
매출액 : 20000000
보너스율 : 1%
월 급여 : 3000000
보너스 금액 : 200000
======================
총 급여 : 3200000
```

</details>

</details>

</details>

<br>

<details>
<summary><strong>📂 - section02.looping_and_branching</strong></summary>

<details>
<summary><strong>📂 - - Level 02 - Normal</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section02.looping_and_branching.level02.Normal`
- **구현 클래스:**
  - `Application1.java`
    - 입력된 문자열을 한 글자씩 출력
  - `Application2.java`
    - 알파벳 'a'부터 'z'까지 차례로 출력
  - `Application3.java`
    - 정수를 입력받아 홀짝에 따라 '수박수박' 패턴 출력

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
0 : a
1 : p
2 : p
3 : l
4 : e
```
```
-- 출력 예시 - Applicatoin2 --
abcdefghijklmnopqrstuvwxyz
```
```
-- 출력 예시 - Applicatoin2 --
수박수박수
```

</details>

</details>

<br>

<details>
<summary><strong>📂 - - Level 03 - Hard</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section02.looping_and_branching.level03.Hard`
- **구현 클래스:**
  - `Application1.java`
    - 입력한 정수가 소수인지 판별
  - `Application2.java`
    - 1~100 사이 난수 맞추기 게임 구현
  - `Application3.java`
    - 문자열과 검색할 문자 입력 후 해당 문자의 개수 출력

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
소수인 경우 "소수다."
소수가 아닌 경우 "소수가 아니다."

단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요."
```
```
-- 출력 예시 - Applicatoin2 --
정수를 입력하세요 : 5
입력하신 정수보다 작습니다.
정수를 입력하세요 : 3
입력하신 정수보다 큽니다.
정수를 입력하세요 : 4
정답입니다. 3회만에 정답을 맞추셨습니다.
```
```
-- 출력 예시 - Applicatoin2 --
포함된 갯수 : 2개

단, 문자열에 영문자가 아닌 문자가 섞여 있는 경우에는
    검색할 문자를 입력받지 않고 "영문자가 아닌 문자가 포함되어 있습니다."
```

</details>


</details>

<br>

<details>
<summary><strong>📂 - - Level 04 - Advanced</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section02.looping_and_branching.level04.Advanced`
- **구현 클래스:**
  - `Application1.java`
    - 시저 암호 알고리즘 구현
      - 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
e F d
```


</details>

</details>

</details>

</details>

---

<details>
<summary><strong>📁 chap05-array</strong></summary>

<details>
<summary><strong>📂 - section01.array</strong></summary>

<details>
<summary><strong>📂 - - Level 02 - Normal</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section01.array.level02.normal`
- **구현 클래스:**
  - `Application1.java`
    - 문자열을 입력받아 문자 배열로 변환한 후 특정 문자의 개수를 찾는 프로그램
  - `Application2.java`
    - 주민등록번호를 입력받아 성별 자리 이후부터 *로 마스킹하는 프로그램

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
문자열을 하나 입력하세요 : helloworld 
검색할 문자를 입력하세요 : l 
입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
```
```
-- 출력 예시 - Applicatoin2 --
주민등록번호를 입력하세요 : 990101-1234567 
990101-1******
```

</details>



</details>

<br>

<details>
<summary><strong>📂 - - Level 03 - Hard</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowule.section01.array.level03.hard`
- **구현 클래스:**
  - `Application1.java`
    - 홀수인 양의 정수를 입력받아 배열을 할당하고 대칭 형태의 값을 저장 후 출력

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
홀수인 양의 정수를 입력하세요 : 7 
1 2 3 4 3 2 1

단, 홀수가 아닌 수를 입력할 경우 "양수 혹은 홀수만 입력해야 합니다."
```
```
-- 출력 예시 - Applicatoin2 --

```

</details>

</details>

<br>

<details>
<summary><strong>📂 - - Level 04 - Advanced</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section01.array.level04.advanced`
- **구현 클래스:**
  - `Application1.java`
    - 중복되지 않는 1~45 사이의 랜덤한 6개 숫자를 생성하고 정렬하여 출력하는 로또 번호 생성기
  - `Application2.java`
    - 숫자 야구게임 구현 (4자리 중복 없는 숫자를 맞추는 게임)

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
3 7 15 21 35 42
```
```
-- 출력 예시 - Applicatoin2 --
10회 남으셨습니다. 
4자리 숫자를 입력하세요 : 1234 
아쉽네요 0S 2B 입니다. 
9회 남으셨습니다. 
4자리 숫자를 입력하세요 : 7416 
정답입니다.

단, 4자리 숫자 이외 입력의 경우 "4자리 숫자를 입력해야 합니다."
```

</details>

</details>

</details>

<br>

<details>
<summary><strong>📂 - section02.demensional_array</strong></summary>


<details>
<summary><strong>📂 - - Level 03 - Hard</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.section02.demensional_array.level03.hard`
- **구현 클래스:**
  - `Application1.java`
    - 가로, 세로 길이를 입력받아 랜덤한 알파벳 대문자로 채운 2차원 배열을 생성 후 출력

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin1 --
 가로 행의 수를 입력하세요 : 5 
 세로 열의 수를 입력하세요 : 4

F H Z G W F O T O R X V W H J X W S S J

단 1 ~ 10 이외의 정수 입력의 경우 " 반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요."
```


</details>


</details>

<br>

</details>

</details>

---

<details>
<summary><strong>📁 chap06-class-and-object</strong></summary>

<details>
<summary><strong>📂 - level01.basic-student</strong></summary>

**📌 문제 개요**

- **패키지:** `com.greedy.level01.basic.student`
- **구현 클래스:**
  - `StudentDTO.java`
    - `StudentDTO()`: 기본 생성자
    - `StudentDTO(grade, classroom, name, kor, eng, math)`: 학생 정보 초기화 생성자
    - `getInformation()`: 학생 정보 및 평균 점수 출력
  - `Application.java`
    - `main()`: 최대 10명의 학생 정보를 입력받아 출력

📄 **[문제 PDF 보기](pdf/chap06-class-and-object-practice-2.pdf)**

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin --
학년 : 1 
반 : 5 
이름 : 홍길동 
국어점수 : 40 
영어점수 : 60 
수학점수 : 70 
계속 추가할 겁니까 ? (y/n) : y

학년 : 2 
반 : 1 
이름 : 김말똥 
국어점수 : 70 
영어점수 : 80 
수학점수 : 100 
계속 추가할 겁니까 ? (y/n) : y

학년=1, 반=5, 이름=홍길동, 국어=40, 영어=60, 수학=70, 평균=56 
학년=2, 반=1, 이름=김말똥, 국어=70, 영어=80, 수학=100, 평균=83 
학년=3, 반=3, 이름=강경순, 국어=100, 영어=75, 수학=86, 평균=87
```

</details>



</details>

<br>

<details>
<summary><strong>📂 - level02.normal-book</strong></summary>


**📌 문제 개요**

- **패키지:** `com.greedy.level02.normal.book`
- **구현 클래스:**
  - `BookDTO.java`
    - `BookDTO()`: 기본 생성자
    - `BookDTO(title, publisher, author)`: 3개 필드 초기화 생성자
    - `BookDTO(title, publisher, author, price, discountRate)`: 모든 필드 초기화 생성자
    - `setters / getters`: 필드 값 수정 및 반환
    - `printInformation()`: 필드 값 출력
  - `Application.java`
    - `main()`: `BookDTO`의 모든 메서드를 호출하여 결과 출력

📄 **[문제 PDF 보기](pdf/chap06-class-and-object-practice-1.pdf)**

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Applicatoin --
null, null, null, 0, 0.0 
자바의 정석, 도우출판, 남궁성, 0, 0.0 
홍길동전, 활빈당, 허균, 5000000, 0.5

```


</details>


</details>

<br>

</details>


---

<details>
<summary><strong>📁 chap08-polymorphism </strong></summary>


<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.level01.basic`
- **구현 클래스:**
  - `Shape.java`
    - `calculateArea()`: 도형의 넓이 계산 메소드 (추상 메소드)
    - `calculatePerimeter()`: 도형의 둘레 계산 메소드 (추상 메소드)
  - `Resizable.java`
    - `resize(double factor)`: 도형의 모든 속성을 인자만큼 곱해 크기를 조정하는 메소드
  - `Circle.java`
    - Shape 추상 클래스를 상속받고 Resizable 인터페이스를 구현하는 클래스
    - 속성: `radius` (반지름)
  - `Rectangle.java`
    - Shape 추상 클래스를 상속받고 Resizable 인터페이스를 구현하는 클래스
    - 속성: `width` (너비), `height` (높이)
  - `Triangle.java`
    - Shape 추상 클래스를 상속받고 Resizable 인터페이스를 구현하는 클래스
    - 속성: `base` (밑변), `height` (높이), `side1` (첫 번째 변), `side2` (두 번째 변), `side3` (세 번째 변)
  - `ShapeManager.java`
    - `addShape(Shape shape)`: 배열에 도형 추가 (배열 크기가 부족하면 2배로 확장하여 추가)
    - `removeShape(Shape shape)`: 배열에서 도형을 찾아 제거하고, 빈 인덱스를 없애기 위해 뒤쪽 도형을 앞으로 당김
    - `printAllShapes()`: 저장된 모든 도형의 이름, 넓이, 둘레를 출력
    - `getTotalArea()`: 저장된 모든 도형의 넓이 총합을 반환
    - `getTotalPerimeter()`: 저장된 모든 도형의 둘레 총합을 반환
  - `Application.java`
    - `main()`: 도형 객체(Circle, Rectangle, Triangle)를 생성 및 추가하고, 도형 정보 출력, 크기 조정 후 재출력, 도형 삭제 후 재출력하여 결과를 확인

<details>
<summary>🛠 실행 예시</summary>

```
===== 모든 도형 출력 =====
Shape: Circle
Area: 78.53981633974483
Perimeter: 31.41592653589793
Shape: Rectangle
Area: 20.0
Perimeter: 18.0
Shape: Triangle
Area: 6.0
Perimeter: 12.0
총 넓이 출력 : 104.53981633974483
총 둘레 출력 : 61.41592653589793
===== 크기 조정 후 모든 도형 출력 =====
Shape: Circle
Area: 314.1592653589793
Perimeter: 62.83185307179586
Shape: Rectangle
Area: 80.0
Perimeter: 36.0
Shape: Triangle
Area: 24.0
Perimeter: 24.0
총 넓이 출력 : 418.1592653589793
총 둘레 출력 : 122.83185307179586
===== Circle 삭제 후 모든 도형 출력 =====
Shape: Rectangle
Area: 80.0
Perimeter: 36.0
Shape: Triangle
Area: 24.0
Perimeter: 24.0
총 넓이 출력 : 104.0
총 둘레 출력 : 60.0
```

</details>

</details>

</details>

---

<details>
<summary><strong>📁 chap09-api</strong></summary>


<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.level01.basic`
- **구현 클래스:**
- **구현 클래스:**
  - `Application1.java`
    - 사용자로부터 입력받은 텍스트에서 공백을 기준으로 단어를 분리한 후, <br> 각 단어의 첫 글자를 대문자로 변환하여 변환된 문자열과 전체 단어 개수를 출력 <br>(String과 StringBuilder 활용)
  - `Application2.java`
    - 사용자로부터 입력받은 텍스트에서 영문자만 대소문자 구분 없이 단어의 빈도를 계산한 후, <br>각 단어의 빈도와 가장 자주 등장하는 단어(및 등장 횟수)를 출력 <br>(String과 StringBuilder 활용)

<details>
<summary>🛠 실행 예시</summary>

```
-- 출력 예시 - Application1 --
문자열 입력 : I will be a good developer.
변환된 문자열: I Will Be A Good Developer.
총 단어 개수: 6
```
```
-- 출력 예시 - Application2 --
문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
===== 단어 빈도 =====
hello: 2
world: 1
everyone: 1
가장 빈도 높은 단어 : hello (2 번)
```

</details>

</details>

</details>

---

<details>
<summary><strong>📁 chap10-exception</strong></summary>

<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

### 📌 여러 예외 처리

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application1.java`
    - 사용자로부터 두 개의 정수를 입력받아 나눗셈을 수행하는 프로그램을 작성
    - 정수가 아닌 값을 입력받을 경우와 나누는 수가 0일 경우의 예외 처리
    - 마지막에는 항상 실행되는 메시지를 출력

<details>
<summary>🛠 실행 예시</summary>

```
----- 입출력 예시 1 -----
분자 입력 : 10
분모 입력 : 2

결과 : 5
실행이 완료되었습니다.

----- 입출력 예시 2 -----
분자 입력 : 십

오류 : 유효한 정수를 입력하세요.
실행이 완료되었습니다.

----- 입출력 예시 3 -----
분자 입력 : 10
분모 입력 : 0

오류 : 0으로 나누는 것은 허용되지 않습니다.
실행이 완료되었습니다.
```

</details>

</details>

<br>

<details>
<summary><strong>📂 - Level 02 - Normal</strong></summary>

### 📌 사용자 정의 예외

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application2.java`
    - 생년월일을 입력 받아 만 20세 미만일 경우 `InvalidAgeException` 사용자 정의 예외 발생

<details>
<summary>🛠 실행 예시</summary>

```
----- 입출력 예시 1 -----
생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05

만 20세 미만은 입장 불가입니다.

----- 입출력 예시 2 -----
생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05

입장하셔도 됩니다.

----- 입출력 예시 3 -----
생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15

날짜 양식을 잘못 입력하셨습니다.
```

</details>

</details>

</details>

---

<details>
<summary><strong>📁 chap11-io</strong></summary>

<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

### 📌 파일 읽기 예외 처리

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application1.java`
    - 사용자로부터 파일 이름을 입력받아 해당 파일을 읽고 내용을 출력하는 프로그램 작성
    - 파일이 존재하지 않을 경우 예외 처리
  - `Application2.java`
    - 사용자로부터 입력받은 파일의 내용을 읽어 새로운 파일에 복사하는 프로그램 작성
    - 원본 파일이 존재하지 않을 경우 예외 처리

<details>
<summary>🛠 실행 예시</summary>

```
----- Application1 입출력 예시 -----
----- 입출력 예시 1 -----
파일 이름을 입력하세요 : hello.txt

===== 파일 내용 출력 =====
안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.

----- 입출력 예시 2 -----
파일 이름을 입력하세요 : unknown.txt

오류 : 해당 이름을 가진 파일이 없습니다.
```
```
----- Application2 입출력 예시 -----
----- 입출력 예시 1 -----
원본 파일의 이름을 입력하세요 : origin.txt
복사 파일의 이름을 입력하세요 : copy.txt

파일 복사가 성공적으로 완료 되었습니다.

----- 입출력 예시 2 -----
원본 파일의 이름을 입력하세요 : origin2.txt
복사 파일의 이름을 입력하세요 : copy2.txt

오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
```

</details>

</details>

<br>

<details>
<summary><strong>📂 - Level 02 - Normal</strong></summary>

### 📌 파일 병합

- **패키지:** `com.ohgiraffers.level02.normal`
- **구현 클래스:**
  - `Application.java`
    - 여러 개의 텍스트 파일을 하나의 파일로 병합하는 프로그램 작성
    - `BufferedReader`와 `BufferedWriter` 사용

<details>
<summary>🛠 실행 예시</summary>

```
병합할 파일의 개수 입력 : 3
1 번째 파일 이름 입력 : test.txt
2 번째 파일 이름 입력 : test2.txt
3 번째 파일 이름 입력 : test3.txt
병합 될 파일명 입력 : result.txt
파일 병합이 완료 되었습니다.
```
```
병합할 파일의 개수 입력 : 2
1 번째 파일 이름 입력 : test.txt
2 번째 파일 이름 입력 : test4.txt
병합 될 파일명 입력 : result.txt
오류 : test4.txt (지정된 파일을 찾을 수 없습니다)
```

</details>

</details>

</details>

---

<details>
<summary><strong>📁 chap12-generic</strong></summary>


<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

</details>

</details>

</details>



---

<details>
<summary><strong>📁 chap13-collection</strong></summary>


<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

<details>
<summary><strong>-- 📌 점수 평균 구하기</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application1.java`
    - 학생들의 점수를 입력받아 저장한 후, 평균 점수를 계산하여 출력하는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
학생 성적 : 100
추가 입력하려면 y : y
학생 성적 : 95
추가 입력하려면 y : Y
학생 성적 : 66
추가 입력하려면 y : y
학생 성적 : 79
추가 입력하려면 y : n
학생 인원 : 4
평균 점수 : 85.0
```

</details>

</details>

<br>

<details>
<summary><strong> -- 📌 최근 방문한 URL 기록</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application2.java`
    - 사용자가 방문한 웹사이트 URL을 입력받아 저장하고, 최근 5개의 URL을 출력하는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
최근 방문 url : [https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
최근 방문 url : [https://github.com/, https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.notion.so/
최근 방문 url : [https://www.notion.so/, https://github.com/, https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.naver.com/
최근 방문 url : [https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
최근 방문 url : [https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
최근 방문 url : [https://www.google.com/, https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/]
방문 URL을 입력하세요 (단, exit를 입력하면 종료) : exit
```

</details>


</details>


<br>

<details>
<summary><strong> -- 📌 대기 줄 시뮬레이션</strong></summary>


- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application3.java`
    - 대기 고객을 관리하는 큐(queue) 시뮬레이션 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 유관순
유관순 고객님 대기 등록 되었습니다.
대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 홍길동
홍길동 고객님 대기 등록 되었습니다.
대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
유관순 고객님 차례입니다.
대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 신사임당
신사임당 고객님 대기 등록 되었습니다.
대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
홍길동 고객님 차례입니다.
대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
신사임당 고객님 차례입니다.
대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
대기 고객이 없습니다.
대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): exit
```

</details>

</details>


<br>

<details>
<summary><strong> -- 📌 학생 ID 관리</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application4.java`
    - 중복되지 않는 학생 ID를 관리하는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
학생 ID 입력('exit' 입력 시 종료): hello
ID가 추가 되었습니다.
학생 ID 입력('exit' 입력 시 종료): java
ID가 추가 되었습니다.
학생 ID 입력('exit' 입력 시 종료): programmer
ID가 추가 되었습니다.
학생 ID 입력('exit' 입력 시 종료): java
이미 등록 된 ID입니다.
학생 ID 입력('exit' 입력 시 종료): exit
모든 학생의 ID : [java, programmer, hello]
```

</details>


</details>




<br>

<details>
<summary><strong> -- 📌 사전순 단어 정렬</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application5.java`
    - 입력된 단어들을 사전순으로 정렬하는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
단어 입력 ('exit' 입력 시 종료): 안녕
단어 입력 ('exit' 입력 시 종료): java
단어 입력 ('exit' 입력 시 종료): collection
단어 입력 ('exit' 입력 시 종료): 프로그래밍
단어 입력 ('exit' 입력 시 종료): exit
정렬 된 단어 : [collection, java, 안녕, 프로그래밍]
```

</details>


</details>

<br>

<details>
<summary><strong> -- 📌 전화번호부 관리</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Application6.java`
    - 이름을 입력하면 전화번호를 검색할 수 있는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동010-1234-5678
입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>
이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동 010-1234-5678
추가 완료 : 홍길동 010-1234-5678
이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 유관순 010-9876-5432
추가 완료 : 유관순 010-9876-5432
이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
검색 할 이름 : 유관순
유관순씨의 전화번호 : 010-9876-5432
이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
검색 할 이름 : 이순신
이순신씨의 번호는 등록 되어 있지 않습니다.
이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): exit
```



</details>

</details>


</details>

</details>




---

<details>
<summary><strong>📁 chap16-strea</strong></summary>


<details>
<summary><strong>📂 - Level 01 - Basic</strong></summary>

<details>
<summary><strong>-- 📌 직원 데이터 처리</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Employee.java`
    - 직원 정보를 저장하는 클래스
  - `Application1.java`
    - 직원 데이터를 처리하는 프로그램 작성 

<details>
<summary>🛠 실행 예시</summary>

```
직원 이름 목록 
: 홍길동, 김철수, 이영희, 박민수, 최지현, 한석봉

IT 부서의 급여 순 직원 목록 
: [이영희, 홍길동, 한석봉]

부서별 평균 급여 
: {HR=3250.0, IT=6000.0, 영업=4000.0}
```

</details>

</details>

<br>

<details>
<summary><strong> -- 📌 온라인 주문 처리 시스템</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Order.java`
    - 주문 정보를 저장하는 클래스
  - `Application2.java`
    - 주문 데이터를 분석하는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
배송 완료 상태인 주문번호 목록 
: [O001, O003]

고객별 총 주문 금액 
: {홍길동=1200.0, 박민수=300.0, 이영희=600.0, 김철수=800.0}

가장 많이 구매한 구매자 
: 홍길동
```

</details>


</details>


<br>

<details>
<summary><strong> -- 📌 학생 성적 처리</strong></summary>


- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Student.java`
    - 학생 정보를 저장하는 클래스
  - `Application3.java`
    - 학생 성적 데이터를 처리하는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
학생들의 평균 점수 
: {철수=87.5, 영희=90.5, 민수=86.5}

수학에서 90점 이상 점수를 받은 학생 목록 
: [철수, 영희]

가장 높은 평균 점수를 받은 학생 
: 영희
```

</details>

</details>


<br>

<details>
<summary><strong> -- 📌 영화 데이터 분석</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Movie.java`
    - 영화 정보를 저장하는 클래스
  - `Application4.java`
    - 영화 데이터를 분석하는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
평점 8점 이상의 액션 영화 리스트 
: [인셉션, 다크 나이트]

평균 영화 상영 시간 
: 157.2

장르별 최고 평점 영화 제목 
: {SF=인터스텔라, 드라마=쇼생크 탈출, 액션=다크 나이트}
```

</details>


</details>




<br>

<details>
<summary><strong> -- 📌 도서 관리 시스템</strong></summary>

- **패키지:** `com.ohgiraffers.level01.basic`
- **구현 클래스:**
  - `Book.java`
    - 도서 정보를 저장하는 클래스
  - `Application6.java`
    - 도서 데이터를 관리하는 프로그램 작성

<details>
<summary>🛠 실행 예시</summary>

```
J.K. 롤링의 도서 목록 
: [해리포터와 마법사의 돌, 해리포터와 비밀의 방]

2000년 대 가장 비싼 도서 제목 
: 다빈치 코드

출판년도별 출판 도서 수 
: {2000=1, 1937=1, 2003=1, 1997=1, 1998=1}
```

</details>


</details>

</details>

</details>





<br><br><br>

## 📌 참고 사항

- 한화 beyond sw캠프 15기의 java-programming 과정의 실습 과제 제출용 자료 입니다.

