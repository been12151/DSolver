# DSolver
금융권 코딩테스트 대비 알고리즘 스터디 🏦
# 🔥 코딩 테스트 스터디 🔥

프로그래머스 문제 풀이를 통한 코딩 테스트 대비 스터디입니다.

매주 ✔ **월요일 23:59** 까지 문제를 풀고 PR을 올리며, ✔ **수요일 23:59** 까지 코드 리뷰를 완료합니다.

---

## 🔸 진행 방식

- 매주 스터디원들이 함께 **알고리즘/자료구조 주제와 문제**를 선정합니다.
- 각자 해당 주제를 학습하고, 관련 문제를 풀어 PR을 올립니다.
- 나머지 스터디원들이 코드 리뷰를 진행합니다.
- 주 1회 목요일날 위클리 스크럼에서 풀이를 공유하고 피드백을 나눕니다. 

> 💡 **모의 코딩테스트** — 하반기 코테 시작 전 기출 문제로 실전 감각을 익히는 모의 테스트를 진행할 예정입니다.
(자격증 시험 빼고)
---

## 🔸 참여 방법

[### 🔹 문제 신청
Issues에 풀고 싶은 문제를 등록해 주세요.

### 🔹 소스 코드 업로드 및 리뷰 요청
1. Main branch에서 새 branch를 생성한다.
2. 해결한 문제의 소스 코드를 본인 branch에 push한다.
3. Pull Request를 통해 [코드 리뷰](https://github.com/been12151/DSolver/pulls)를 요청한다.
4. 리뷰를 받고 수정이 완료되면 Label을 변경한다.
---

## 🔹 Code Review 규칙

- 자유롭게 의견을 제시한다.
  - 잘한 부분은 칭찬하기 👍 피드백할 게 없어도 칭찬은 필수!
  - 다른 풀이 방법이 있다면 공유하기 (코드 전체보다는 키워드나 힌트 위주로)
  - 개선이 필요한 부분은 이유를 충분히 설명하기
  - 정답을 바로 알려주기보다, 스스로 고민할 수 있도록 방향을 제시하기
  - 궁금한 부분은 편하게 물어보기
- 코드 작성자가 아닌, **코드 자체**를 피드백한다는 마음으로 리뷰한다.
- 말투 예시: `~ 하는 게 어떨까요?` / `~ 방법도 있을 것 같아요!` / `~ 부분이 궁금한데 설명해 주실 수 있나요?`

---

## 🔹 Pull Request 규칙

- PR 템플릿에 맞게 작성한다.
  - 문제를 푸는 과정에서 본인이 생각한 내용을 작성한다.
  - 코드 설명을 작성한다. (단, 주석으로 작성한 경우 생략 가능)
  - 특히 리뷰받고 싶은 부분을 Markdown Codeblock으로 발췌해서 작성한다.
  - 리뷰어가 빠르게 이해할 수 있도록 본인 코드를 충분히 설명해 주세요.
- Reviewer는 본인을 제외한 **2명**을 추가한다.
- Label은 `Review Request`로 설정한다.
- 모든 스터디원에게 리뷰를 받고 수정이 완료되면 Label을 `Merge Request`로 변경한다.
- Main branch에 병합되면 해당 branch는 삭제한다.

---

## 🔹 Commit Message 컨벤션

```
type : subject

body (optional)
```

### ✔ Type

| Type | 설명 |
|------|------|
| `Add` | 소스 코드 파일 추가 |
| `Refactor` | 소스 코드 수정 |
| `Style` | 포맷 수정, 변수명 변경, 주석 추가/삭제 등 코드 동작에 영향 없는 수정 |
| `Chore` | 그 외 기타 작업 |

### ✔ Subject

- 50자 이하로 간결하게 작성한다.
- ex) `Add: 두_수의_합.py` / `Add: 두_수의_합.java` / `Add: 두_수의_합.cpp`
- ex) `Refactor: 완전 탐색 -> 이분 탐색`
- ex) `Style: 함수명 변경`

### ✔ Body (optional)

- 변경 이유나 방식을 간략히 설명한다.
- 한 줄에 72자를 넘기지 않는다.
- ex) 배열이 오름차순으로 정렬되어 있다는 특징을 이용해 탐색 알고리즘을 이분 탐색으로 수정했습니다. 시간 복잡도가 O(n²) → O(nlogn)으로 개선되었습니다.

---

## 🔹 Branch Naming 컨벤션

- 형식: `영어이니셜/이슈번호`
  - ex) `hgd/1`
- ⭐ 이름은 반드시 **영어 이니셜**로 (한글 브랜치명은 오류 발생)
- ⭐ 문제 번호가 아닌 **이슈 번호**로 생성
- 문제마다 새 branch를 생성해서 push 후 리뷰 요청

---

## 🔹 File Naming 컨벤션

`문제이름.확장자` 형식으로 작성한다.

| 언어 | 예시 |
|------|------|
| Python | `두_수의_합.py` |
| Java | `두_수의_합.java` |
| C++ | `두_수의_합.cpp` |

---

## 🔹 Directory 구조

```
└── 📂 PGS
      ├── 📂 김원빈
      │     ├── 💾 두_수의_합.py
      │     └── 💾 문제이름.py
      ├── 📂 양예은
      │     ├── 💾 두_수의_합.java
      │     └── 💾 문제이름.java
      └── 📂 손가영
            ├── 💾 두_수의_합.cpp
            └── 💾 문제이름.cpp
```

---

## 🔹 불참 및 지각 규칙

- PR 기한(월요일 23:59)을 지키지 못할 경우, 미리 스터디원들에게 공유한다.
- 코드 리뷰 기한(수요일 23:59)도 동일하게 적용한다.
- 부득이한 사정은 언제든지 편하게 말해주세요 🙂

🔸 참여자

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/been12151">
        <img src="https://avatars.githubusercontent.com/been12151" width="110px;" alt=""/><br />
        <sub><b>김원빈</b></sub></a><br />
        <a href="https://github.com/been12151" title="Code">💻</a>
    </td>
    <td align="center">
      <a href="https://github.com/yangyeeeun">
        <img src="https://avatars.githubusercontent.com/yangyeeeun" width="110px;" alt=""/><br />
        <sub><b>양예은</b></sub></a><br />
        <a href="https://github.com/yangyeeeun" title="Code">💻</a>
    </td>
    <td align="center">
      <a href="https://github.com/gayo73">
        <img src="https://avatars.githubusercontent.com/gayo73" width="110px;" alt=""/><br />
        <sub><b>손가영</b></sub></a><br />
        <a href="https://github.com/gayo73" title="Code">💻</a>
    </td>
  </tr>
</table>
