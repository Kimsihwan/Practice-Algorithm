package programmers;

public class pm_159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < goal.length; i++) {
            if(x < cards1.length) {
                String card1 = cards1[x];
                if(card1.equals(goal[i])) {
                    x++;
                    continue;
                }
            }

            if(y < cards2.length) {
                String card2 = cards2[y];
                if(card2.equals(goal[i])) {
                    y++;
                    continue;
                }
            }

            return "No";
        }

        return "Yes";
    }
}
