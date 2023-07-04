import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        // 참여자 명단을 HashMap에 추가
        for (String name : participant) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        // 완주자 명단을 HashMap에서 제거
        for (String name : completion) {
            if (map.get(name) > 1) {
                map.put(name, map.get(name) - 1);
            } else {
                map.remove(name);
            }
        }

        // HashMap에 남은 이름이 미완주자 이름
        for (String name : map.keySet()) {
        answer = name;
        }

        return answer;
    }
}