### [보호소에서 중성화한 동물](https://school.programmers.co.kr/learn/courses/30/lessons/59045?language=mysql)

## 문제 설명

`ANIMAL_INS` 테이블은 동물 보호소에 들어온 동물의 정보를 담고 있습니다. 테이블의 구조는 다음과 같습니다:

| NAME               | TYPE      | NULLABLE |
|--------------------|-----------|----------|
| ANIMAL_ID          | VARCHAR(N)| FALSE    |
| ANIMAL_TYPE        | VARCHAR(N)| FALSE    |
| DATETIME           | DATETIME  | FALSE    |
| INTAKE_CONDITION   | VARCHAR(N)| FALSE    |
| NAME               | VARCHAR(N)| TRUE     |
| SEX_UPON_INTAKE    | VARCHAR(N)| FALSE    |

각 열의 의미는 다음과 같습니다:
- `ANIMAL_ID`: 동물의 아이디
- `ANIMAL_TYPE`: 생물 종
- `DATETIME`: 보호 시작일
- `INTAKE_CONDITION`: 보호 시작 시 상태
- `NAME`: 동물의 이름
- `SEX_UPON_INTAKE`: 성별 및 중성화 여부

`ANIMAL_OUTS` 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담고 있습니다. 테이블의 구조는 다음과 같습니다:

| NAME               | TYPE      | NULLABLE |
|--------------------|-----------|----------|
| ANIMAL_ID          | VARCHAR(N)| FALSE    |
| ANIMAL_TYPE        | VARCHAR(N)| FALSE    |
| DATETIME           | DATETIME  | FALSE    |
| NAME               | VARCHAR(N)| TRUE     |
| SEX_UPON_OUTCOME   | VARCHAR(N)| FALSE    |

각 열의 의미는 다음과 같습니다:
- `ANIMAL_ID`: 동물의 아이디 (ANIMAL_INS의 ANIMAL_ID 외래 키)
- `ANIMAL_TYPE`: 생물 종
- `DATETIME`: 입양일
- `NAME`: 동물의 이름
- `SEX_UPON_OUTCOME`: 성별 및 중성화 여부

보호소에서 중성화 수술을 거친 동물 정보를 알아보려 합니다. 보호소에 들어올 당시에는 중성화되지 않았지만, 보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종, 이름을 조회하는 SQL 문을 작성해주세요.

### 예시

다음은 `ANIMAL_INS` 테이블과 `ANIMAL_OUTS` 테이블의 예시 데이터입니다:

**ANIMAL_INS**

| ANIMAL_ID | ANIMAL_TYPE | DATETIME           | INTAKE_CONDITION | NAME    | SEX_UPON_INTAKE |
|-----------|-------------|--------------------|------------------|---------|-----------------|
| A367438   | Dog         | 2015-09-10 16:01:00| Normal           | Cookie  | Spayed Female   |
| A382192   | Dog         | 2015-03-13 13:14:00| Normal           | Maxwell 2 | Intact Male     |
| A405494   | Dog         | 2014-05-16 14:17:00| Normal           | Kaila   | Spayed Female   |
| A410330   | Dog         | 2016-09-11 14:09:00| Sick             | Chewy   | Intact Female   |

**ANIMAL_OUTS**

| ANIMAL_ID | ANIMAL_TYPE | DATETIME           | NAME    | SEX_UPON_OUTCOME |
|-----------|-------------|--------------------|---------|------------------|
| A367438   | Dog         | 2015-09-12 13:30:00| Cookie  | Spayed Female    |
| A382192   | Dog         | 2015-03-16 13:46:00| Maxwell 2 | Neutered Male    |
| A405494   | Dog         | 2014-05-20 11:44:00| Kaila   | Spayed Female    |
| A410330   | Dog         | 2016-09-13 13:46:00| Chewy   | Spayed Female    |

- Cookie는 보호소에 들어올 당시에 이미 중성화되어 있었습니다.
- Maxwell 2는 보호소에 들어온 후 중성화되었습니다.
- Kaila는 보호소에 들어올 당시에 이미 중성화되어 있었습니다.
- Chewy는 보호소에 들어온 후 중성화되었습니다.

따라서 SQL문을 실행하면 다음과 같은 결과를 얻을 수 있어야 합니다:

| ANIMAL_ID | ANIMAL_TYPE | NAME    |
|-----------|-------------|---------|
| A382192   | Dog         | Maxwell 2 |
| A410330   | Dog         | Chewy   |

**본 문제는 Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"에서 제공하는 데이터를 사용하였으며 ODbL의 적용을 받습니다.**

중성화를 거치지 않은 동물은 성별 및 중성화 여부에 `Intact`, 중성화를 거친 동물은 `Spayed` 또는 `Neutered`라고 표시되어 있습니다. ↩

---
