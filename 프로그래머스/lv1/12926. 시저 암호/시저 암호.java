class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] small = {"a" ,"b", "c", "d", "e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] big = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (int i =0; i<s.length();i++){        
            char a = s.charAt(i);
            int pos = 0;
            if (a>='A' && a<= 'Z'){
                pos = (a-'A'+n)%26; 
                answer += big[pos];
            }
            else if (a>='a' && a<='z'){
                pos = (a-'a'+n)%26; 
                answer += small [pos];
            }else {
                answer += " ";
            }
        }
        return answer;
    }
}