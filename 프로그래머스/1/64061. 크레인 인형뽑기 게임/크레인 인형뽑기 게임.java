import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int pick = 0;
        Stack<Integer> basket = new Stack<>();
        basket.push(0);
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                pick = board[j][moves[i]-1];
                if(pick > 0){
                    if(basket.peek() == pick){
                        basket.pop();
                        answer += 2;
                    }else{
                        basket.push(pick);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}