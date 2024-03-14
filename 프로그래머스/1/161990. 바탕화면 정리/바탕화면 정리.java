import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        
        int row = wallpaper.length;
        int column = wallpaper[0].length();
        
        int luy = column;
        int rdy = 0;
        int lux = row;
        int rdx = 0;
        
        for (int i = 0 ; i < row ; i++ ) {
            for (int j = 0 ; j < column ; j++ ) {
                char c = wallpaper[i].charAt(j);
                
                if (c == '#') {
                    if (j < luy) 
                        luy = j;
                    if (rdy < j)
                        rdy = j;
                    
                    if(i < lux)
                        lux = i;
                    if(rdx < i)
                        rdx = i;
                    }
            } 
        }
        int[] answer = {lux, luy, rdx+1, rdy+1};
        return answer;
    }
}