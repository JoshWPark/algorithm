class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean id_correct = false;
        boolean pw_correct = false;        
        for (String [] i : db){
            if(id_pw[0].equals(i[0])){
                id_correct = true;
                if(id_pw[1].equals(i[1])){
                    pw_correct = true;
                }
                break;
            }
        }
        if(id_correct && pw_correct)
            answer = "login";
        else if (id_correct && !pw_correct)
            answer = "wrong pw";
        else
            answer = "fail";
        return answer;
    }
}