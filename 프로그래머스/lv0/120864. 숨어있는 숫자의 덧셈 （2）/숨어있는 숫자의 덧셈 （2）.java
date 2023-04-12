class Solution {
    public int solution(String my_string) {
        int answer = 0;
        if(!isIntIncluded(my_string)){
            return 0;
        }
        my_string = my_string.replaceAll("[a-zA-Z]","-");
        my_string = my_string.replaceAll("[-]{2,}","-");
        my_string = my_string.replaceAll("^[-]","");
        my_string = my_string.replaceAll("[-]$","");
        String [] num = my_string.split("-");
        for (int i=0; i<num.length; i++){
            answer += Integer.parseInt(num[i]);
        }
        return answer;
    }
    
    public boolean isIntIncluded (String x){
        x = x.replaceAll("[^\\d]"," ");
        x = x.trim();
        x = x.replaceAll(" ", "");

        if (x.equals(""))
            return false;
        else
            return true;
    } 
}