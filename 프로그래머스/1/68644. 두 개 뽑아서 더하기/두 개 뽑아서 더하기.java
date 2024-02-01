import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> intList = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++){
            int j = i + 1;
            while(j < numbers.length){
                intList.add(numbers[i] + numbers[j]);
                j++;
            }
        }
        Set<Integer> set = new HashSet<Integer>(intList);
        List<Integer> newList =new ArrayList<Integer>(set);
        Collections.sort(newList);
        int[] answer = new int[newList.size()];
        for(int i = 0; i < newList.size(); i++){
        answer[i] = newList.get(i);
        }
        return answer;
    }
}