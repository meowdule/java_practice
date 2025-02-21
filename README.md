# Java Programming 문제 풀이

이 저장소는 Java Programming 실습 문제 풀이를 포함하고 있습니다.

<br>

## 📂 파일 구조

<details>
<summary><strong>📂 </strong></summary>
 
```
📂 chap01-literal-and-variable
 ├── 📂 level01.basic
 │   ├── Application1.java
 │   ├── Application2.java
 └── 📂 level02.normal
     ├── Application1.java
     └── Application2.java
     
📂 chap03-method-and-api
 ├── 📂 level01.basic
 │   ├── Calculator.java
 │   └── Application.java
 └── 📂 level02.normal
     ├── RandomMaker.java
     └── Application.java
     
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


<br><br><br>

## 📌 참고 사항

- 한화 beyond sw캠프 15기의 java-programming 과정의 실습 과제 제출용 자료 입니다.

