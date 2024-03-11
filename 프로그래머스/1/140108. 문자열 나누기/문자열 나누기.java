class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int same = 0;
        int diff = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(same == diff){
                answer ++;
                first = s.charAt(i);
            }
            if(s.charAt(i) == first){
                same ++;
            }else{
                diff ++;
            }
        }
        return answer;
    }
}