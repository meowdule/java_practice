# Java 메서드 및 API 연습 문제 풀이

이 저장소는 **Greedy 문제집 Chap03**의 메서드 및 API 실습 문제 풀이를 포함하고 있습니다.


📂 chap03-method-and-api-practice-question.src
 ├── 📂 com.greedy.level01.basic
 │   ├── Calculator.java
 │   └── Application.java
 ├── 📂 com.greedy.level02.normal
 │   ├── RandomMaker.java
 │   └── Application.java

---

<details>
<summary><strong>📁 chap03</strong></summary>

<details>
<summary><strong>📂 level01 - Basic</strong></summary>

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
<summary><strong>📂 level02 - Normal</strong></summary>

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
