// class Solution {
//     public int solution(String t, String p) {
//         int answer = 0;
//         int p_length = p.length();
//         int t_length = t.length();
//         while (t_length >= p_length){
//             String cut = t.substring(0,p_length);
//             if(Integer.parseInt(cut)<=Integer.parseInt(p)){
//                 answer++;
//             }
//             t = t.substring(1);
//             t_length--;
//         }
//         return answer;
//     }
// }

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        long pNum = Long.parseLong(p);

        for(int i = 0; i <= t.length()-pLen; i++) {
            long sliceNum = Long.parseLong(t.substring(i, i+pLen));
            if(sliceNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}

// class Solution {
//     public int solution(String t, String p) {
//         int answer = 0;
//         double p_int = Double.parseDouble(p);
//         double t_int = Double.parseDouble(t);
//         int p_log10 = (int) (Math.log10(p_int));
//         int t_log10 = (int) (Math.log10(t_int));
//         double p_pow = (double)Math.pow(10,p_log10);
//         double p_pow1 = (double)Math.pow(10,p_log10+1);
//         while (t_int >= p_pow){
//             double cut = (t_int)%(p_pow1);
//             int cut_int = (int)cut;
//             if(cut_int<=p_int){
//                 answer ++;
//             }
//             t_int/=10;
//         }
//         return answer;
//     }
// }