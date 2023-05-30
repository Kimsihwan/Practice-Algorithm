package programmers;

import java.util.*;


public class pm_178871 {
    public String[] solution(String[] players, String[] callings) {

        int n = players.length;

        HashMap<String, Integer> indexMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            indexMap.put(players[i], i);
        }

        for(String call : callings) {
            int idx = indexMap.get(call);
            if(idx > 0) {
                String tmp = players[idx - 1];
                players[idx - 1] = players[idx];
                players[idx] = tmp;

                indexMap.put(players[idx-1], idx-1);
                indexMap.put(players[idx], idx);
            }
        }

        return players;
    }
}
