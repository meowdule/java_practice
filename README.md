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
<summary><strong>📂 Level 01 - Basic</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.level01.basic`
- **구현 클래스:**
  - `Application1.java`
    - 두 개의 정수를 선언하여 사칙연산을 수행하고 결과 출력
  - `Application2.java`
    - 사각형의 넓이와 둘레를 계산하여 출력

**🛠 실행 예시:**
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

<details>
<summary><strong>📂 Level 02 - Normal</strong></summary>

**📌 문제 개요**

- **패키지:** `com.meowdule.level02.normal`
- **구현 클래스:**
  - `Application1.java`
    - 문자 'a'의 유니코드 값을 출력
  - `Application2.java`
    - 국어, 수학, 영어 점수를 저장하고 총점과 평균을 정수로 변환하여 출력

**🛠 실행 예시:**
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

---


<details>
<summary><strong>📁 chap03-method-and-api</strong></summary>


<details>
<summary><strong>📂 Level 01 - Basic</strong></summary>

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

**🛠 실행 예시:**
```
메소드 호출 확인
1부터 10까지의 합 : 55
두 수 중 큰 수는 20이다.
10과 20의 합은 : 30
10과 5의 차는 : 5
```
</details>

<details>
<summary><strong>📂 Level 02 - Normal</strong></summary>

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

**🛠 실행 예시:**
```
-35
SLDIBMELEA
가위
앞면
```
</details>



</details>

---



<br><br><br>

## 📌 참고 사항

- 한화 beyond sw캠프 15기의 java-programming 과정의 실습 과제 제출용 자료 입니다.

