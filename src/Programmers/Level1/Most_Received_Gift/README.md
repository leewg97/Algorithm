### [코딩테스트 연습 > 2024 KAKAO WINTER INTERNSHIP > 가장 많이 받은 선물](https://school.programmers.co.kr/learn/courses/30/lessons/258712)

**문제 설명**

선물을 직접 전하기 힘들 때 카카오톡 선물하기 기능을 이용해 축하 선물을 보낼 수 있습니다. 당신의 친구들이 이번 달까지 선물을 주고받은 기록을 바탕으로 다음 달에 누가 선물을 많이 받을지 예측하려고 합니다.

두 사람이 선물을 주고받은 기록이 있다면, 이번 달까지 두 사람 사이에 더 많은 선물을 준 사람이 다음 달에 선물을 하나 받습니다.
예를 들어 A가 B에게 선물을 5번 줬고, B가 A에게 선물을 3번 줬다면 다음 달엔 A가 B에게 선물을 하나 받습니다.
두 사람이 선물을 주고받은 기록이 하나도 없거나 주고받은 수가 같다면, 선물 지수가 더 큰 사람이 선물 지수가 더 작은 사람에게 선물을 하나 받습니다.
선물 지수는 이번 달까지 자신이 친구들에게 준 선물의 수에서 받은 선물의 수를 뺀 값입니다.
예를 들어 A가 친구들에게 준 선물이 3개고 받은 선물이 10개라면 A의 선물 지수는 -7입니다. B가 친구들에게 준 선물이 3개고 받은 선물이 2개라면 B의 선물 지수는 1입니다. 만약 A와 B가 선물을 주고받은
적이 없거나 정확히 같은 수로 선물을 주고받았다면, 다음 달엔 B가 A에게 선물을 하나 받습니다.
만약 두 사람의 선물 지수도 같다면 다음 달에 선물을 주고받지 않습니다.
위에서 설명한 규칙대로 다음 달에 선물을 주고받을 때, 당신은 선물을 가장 많이 받을 친구가 받을 선물의 수를 알고 싶습니다.

친구들의 이름을 담은 1차원 문자열 배열 friends 이번 달까지 친구들이 주고받은 선물 기록을 담은 1차원 문자열 배열 gifts가 매개변수로 주어집니다. 이때, 다음달에 가장 많은 선물을 받는 친구가 받을
선물의 수를 return 하도록 solution 함수를 완성해 주세요.

**입출력 예**

| friends                                         | gifts                                                                                                      | result |
|-------------------------------------------------|------------------------------------------------------------------------------------------------------------|--------|
| ["muzi", "ryan", "frodo", "neo"]                | ["muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"] | 2      |
| ["joy", "brad", "alessandro", "conan", "david"] | ["alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"]          | 4      |
| ["a", "b", "c"]                                 | ["a b", "b a", "c a", "a c", "a c", "c a"]                                                                 | 0      |

* 인덱스를 사용한 배열 접근 
* 2차원 배열 사용 : 
  * `record[i][j]` 는 `i` 가 `j` 에게 준 선물의 수
  * `muzi > frodo` 면 `record[map.get("muzi")][map.get("fordo")]`를 통해 배열의 해당 위치 업데이트

---
*친구 목록 인덱스로 매핑*
```java
Map<String, Integer> map = new HashMap<>();
int length = friends.length;
for (int i = 0; i < length; i++) {
    map.put(friends[i], i);
}
```
* 각 친구의 이름을 인덱스와 매핑하는 해시 맵 생성
* `map`의 key는 친구 이름, value는 친구의 인덱스
  * `friends[0]`이 'muzi' 라면 `map.put("muzi", 0)`으로 'muzi'와 0 인덱스를 매핑

*선물 지수 및 기록 배열 초기화*
```java
int[] index = new int[length];
int[][] record = new int[length][length];
```
* index: 각 친구의 선물 지수를 기록하는 배열. 선물 지수는 친구가 준 선물의 수에서 받은 선물의 수를 뺀 값.
* record: 친구 간에 주고받은 선물의 수를 기록하는 2차원 배열. `record[i][j]`는 친구 i가 친구 j에게 준 선물의 수.

*선물 기록 처리*
```java
for (String gift : gifts) {
    String[] part = gift.split(" ");
    String giver = part[0];
    String receiver = part[1];

    index[map.get(giver)]++;
    index[map.get(receiver)]--;
    record[map.get(giver)][map.get(receiver)]++;
}
```
* 각 선물 기록 처리 및 giver와 receiver 업데이트

*다음 달 선물 예측*
```java
int answer = 0;
for (int i = 0; i < length; i++) {
    int count = 0;
    for (int j = 0; j < length; j++) {
        if (i == j) continue;
        if (record[i][j] > record[j][i]) count++;
        else if (record[i][j] == record[j][i] && index[i] > index[j]) count++;
    }
    answer = Math.max(answer, count);
}
```
* 각 친구에 대해 다른 모든 친구들과 비교하여, 다음 달에 받을 선물의 수를 계산
* `answer`에 최종적으로 가장 많은 선물을 받을 친구의 선물 수 기록
