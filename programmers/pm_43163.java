package programmers;


public class pm_43163 {
    static int answer = 51;
    static boolean[] visited;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

        return answer == 51 ? 0 : answer;
    }

    void dfs(String begin, String target, String[] words, int cnt) {
        if(begin.equals(target)) {
            answer = Math.min(answer, cnt);
            return;
        }

        for(int i = 0; i < words.length; i++) {
            if(visited[i]) continue;
            if(!compare(begin, words[i])) continue;
            visited[i] = true;
            dfs(words[i], target, words, cnt+1);
            visited[i] = false;
        }
    }

    boolean compare(String str1, String str2) {
        int cnt = 0;
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) cnt++;
        }
        return cnt == 1;
    }
}
