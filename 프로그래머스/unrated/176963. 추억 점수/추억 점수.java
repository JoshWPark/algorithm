class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];
        for (int i =0; i<photo.length; i++){
            String [] pic = photo[i];
            for(int j=0; j<pic.length; j++){
                String picName = pic[j];
                for(int k = 0; k<name.length; k++){
                    if(picName.equals(name[k])){
                        answer[i] += yearning[k];
                        break;
                    }
                }
            }
        }
        return answer;
    }
}