class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int count = 0;
        int [] dh = {0, 1, -1, 0};
        int [] dw = {1, 0, 0, -1};
        int hCheck = 0;
        int wCheck = 0;
        
        for(int i = 0; i < 4; i++){
            hCheck = h + dh[i];
            wCheck = w + dw[i];
            if(hCheck >= 0 && hCheck < n 
               && wCheck >= 0 && wCheck < n){
               if(board[h][w].equals(board[hCheck][wCheck])){
                   count += 1;
               }
            }
        }
        answer = count;
        return answer;
    }
}