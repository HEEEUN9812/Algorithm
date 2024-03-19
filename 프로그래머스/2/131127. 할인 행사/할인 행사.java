import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length - 9; i++){
            Map<String, Integer> map = new HashMap<>();
            
            for(int j = 0; j < 10; j++){
             map.put(discount[i + j],
                   map.getOrDefault(discount[i + j], 0) + 1);   
            }
            boolean exist = true;
            
            for(String key : wantMap.keySet()){
                if(wantMap.get(key) != map.get(key)){
                    exist = false;
                    break;
                }
            }
            if(exist){
                answer++;
            }
        }
//         for(int i = 9; i < number.length, i++){
//             map.put(discount[i],
//                    map.getOrDefault(discount[i], 1) + 1);
            
//             if()
//         }
        return answer;
    }
}