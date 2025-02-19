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
 └── 📂 section01
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




<br><br><br>

## 📌 참고 사항

- 한화 beyond sw캠프 15기의 java-programming 과정의 실습 과제 제출용 자료 입니다.

