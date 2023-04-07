class Solution {
    public boolean solution(String s) {
    // boolean answer = true;

        if (s.length()!=4 && s.length()!=6){
            return false;
        }
        else{
            try{
                Long.parseLong(s);
                return true;
            }
                catch (NumberFormatException ex){
                return false;
            }
        }
    }
}