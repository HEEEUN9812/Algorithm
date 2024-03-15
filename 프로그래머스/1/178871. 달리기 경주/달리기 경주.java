import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String [players.length];
        Map<String, Integer> playerMap = new HashMap<>();
        int index = 0;
        String temp = "";
        for(int i = 0; i < players.length; i++){
            playerMap.put(players[i],i);
        }
        
        for(String calling : callings){
            index = playerMap.get(calling);
            temp = players[index - 1];
            playerMap.replace(temp, index);
            playerMap.replace(calling, index - 1);
            players[index] = temp;
            players[index - 1] = calling;
        }
        answer = players;
        // List<String> playerList = new ArrayList<>();
        // int index = 0;
        // String temp = "";
        // for(String player : players){
        //     playerList.add(player);
        // }
        // for(String calling : callings){
        //     index = playerList.indexOf(calling);
        //     temp = playerList.get(index - 1);
        //     playerList.set(index - 1, calling);
        //     playerList.set(index, temp);
        // }
        // for(int i = 0; i < players.length; i++){
        //     answer[i] = playerList.get(i);
        // }
        return answer;
    }
}