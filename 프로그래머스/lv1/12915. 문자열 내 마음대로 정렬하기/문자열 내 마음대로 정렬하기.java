import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> arr = new ArrayList <String>();
        String[] order= new String[strings.length];
        //n번째 글자 구하기
        for (int i =0; i<strings.length; i++ ){
            order[i]=Character.toString(strings[i].charAt(n));
        }
        //n번째 글자 정렬
        Arrays.sort(order);
        //입력값 정렬
        Arrays.sort(strings);
        //리스트 정렬
        for (int i =0; i<order.length; i++ ){
            for (int j=0; j<strings.length; j++){
                if(arr.contains(strings[j])){
                    continue;
                }else {
                    if (order[i].charAt(0)==strings[j].charAt(n)){
                        arr.add(strings[j]);
                        break;
                    }
                }
            }
        }
        String[] answer= new String[arr.size()];
        for(int i =0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}