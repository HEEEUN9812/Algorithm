import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char ch = keymap[i].charAt(j);
                if(map.containsKey(ch)){
                    int index = map.get(ch);
                    map.put(ch, Math.min(index, j + 1));
                }
                else {
                    map.put(ch, j+1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for(char ch : target.toCharArray()){
                if(map.containsKey(ch)){
                    count += map.get(ch);
                }
                else{
                    flag = false;
                    break;
                }
            }
            
            if(flag == false){
                answer[i] = -1;
            }else{ answer[i] = count;
                 }
        }

        return answer;
    }
}