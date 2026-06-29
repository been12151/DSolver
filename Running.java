import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        for(String name : callings){
            int index = map.get(name);
            String prev = players[index-1];
            map.put(name,index-1);
            map.put(prev,index);
                    
            players[index-1]=name;
            players[index]=prev;
        }
        return players;
    }
}
