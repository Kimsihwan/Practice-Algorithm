package programmers;

import java.util.*;

public class pm_42579 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }

        // 1. 속한 노래가 많이 재생된 장르를 먼저 수록하기
        ArrayList<String> genreList = new ArrayList<>();
        while(map.size() > 0) {
            int max = -1;
            String max_key = "";
            for(String key : map.keySet()) {
                if(map.get(key) > max) {
                    max = map.get(key);
                    max_key = key;
                }
            }
            genreList.add(max_key);
            map.remove(max_key);
        }

        // 장르 내에서 많이 재생된 노래를 먼저 수록
        ArrayList<Music> result = new ArrayList<>();
        for(String genre : genreList) {
            ArrayList<Music> list = new ArrayList<>();
            for(int i = 0; i < genres.length; i++) {
                if(genre.equals(genres[i])) {
                    list.add(new Music(genre, plays[i], i));
                }
            }

            // play 기준 내림차순
            Collections.sort(list, (o1,o2) -> o2.play - o1.play);

            result.add(list.get(0));

            // 최대 2개
            if(list.size() > 1) {
                result.add(list.get(1));
            }
        }
        int[] answer = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i).idx;
        }

        return answer;
    }

    class Music {
        String genre;
        int play;
        int idx;
        public Music(String genre,int play,int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
}
