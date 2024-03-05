import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        
        for(int i : reserve){
            reserveList.add(i);
        }
        for(int i : lost){
            if(reserveList.contains(i)){
                answer += 1;
                reserveList.remove(Integer.valueOf(i));
                lostList.remove(Integer.valueOf(i));
            }else{
                lostList.add(i);
            }
        }
        
        Collections.sort(reserveList);
        Collections.sort(lostList);
        
        // for(int i : lostList){
        //     if(reserveList.contains(i)){
        //         answer += 1;
        //         reserveList.remove(Integer.valueOf(i));
        //         lostList.remove(Integer.valueOf(i));
        //     }
        // }
        
        for(int i : lostList){
            if(reserveList.contains(i-1)){
                answer += 1;
                reserveList.remove(Integer.valueOf(i-1));
            }else if(reserveList.contains(i+1)){
                answer += 1;
                reserveList.remove(Integer.valueOf(i+1));
            }
        }
        return answer;
    }
}