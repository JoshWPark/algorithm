
class Solution {
    public int[] solution(String[] wallpaper) {
        int luy = 0;
        int lux = wallpaper[0].length();
        int rdy = wallpaper.length;
        int rdx = 0;
        //luy
        for(int i=0; i<wallpaper.length; i++){
            String line = wallpaper[i];
            if(!(line.contains("#"))){
                luy ++;
                continue;
            }
            else{
                break;
            }
        }
        //lux, rdx
        for(int j=0; j<wallpaper.length; j++){
            String line = wallpaper[j];
            if(line.contains("#")){
                for(int k = 0; k< line.length();k++){
                    char x = line.charAt(k);
                    if(x=='#'){
                        lux = Math.min(lux,k);
                        break;
                    }
                }
                for(int l = line.length()-1; l>=0;l--){
                    char y = line.charAt(l);
                    if(y=='#'){
                        rdx = Math.max(rdx,l+1);
                        break;
                    }
                }
            }
        }
        //rdy
        for(int i=wallpaper.length-1; i>=0; i--){
            String line = wallpaper[i];
            if(!(line.contains("#"))){
                rdy --;
                continue;
            }
            else{
                break;
            }
        }
        
        int[] answer = {luy,lux,rdy,rdx};
        return answer;
    }
}