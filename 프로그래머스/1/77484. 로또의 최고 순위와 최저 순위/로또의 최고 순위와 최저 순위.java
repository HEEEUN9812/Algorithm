class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int magicNum = 0;
        int exist = 0;
        for(int i = 0; i < 6; i++){
                if(lottos[i] == 0){
                    magicNum++;
                }
            for(int j = 0; j < 6; j++){
                if(lottos[i] == win_nums[j]){
                    exist++;
                }
            }
        }
        int maxRank = 7 - (exist + magicNum);
        int minRank = 7 - exist;
        if (maxRank > 6){
            maxRank = 6;
        }
        if (minRank > 6){
            minRank = 6;  
        } 
        return new int[]{maxRank, minRank};
    }
}