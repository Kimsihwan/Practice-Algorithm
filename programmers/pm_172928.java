package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pm_172928 {
    public int[] solution(String[] park, String[] routes) {
        int sx = 0;
        int sy = 0;
        int xMAX = park.length;
        int yMAX = park[0].length();

        char[][] parkArr = new char[xMAX][yMAX];

        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[0].length(); j ++){
                if(park[i].charAt(j) == 'S') {
                    sx = i;
                    sy = j;
                }
                parkArr[i][j] = park[i].charAt(j);
            }
        }

        for(String route : routes) {
            String[] routeArr = route.split(" ");
            String direction = routeArr[0];
            int cnt = Integer.parseInt(routeArr[1]);
            if(direction.equals("E")) {
                if(sy+cnt >= yMAX) continue;
                int tmp = sy;
                while(cnt -- > 0) {
                    if(tmp > yMAX) continue;
                    if(parkArr[sx][tmp+1] == 'X') continue;
                    tmp++;
                }
                if(sy+Integer.parseInt(routeArr[1]) != tmp) continue;
                sy+=Integer.parseInt(routeArr[1]);
            }

            else if(direction.equals("W")) {
                if(sy-cnt < 0) continue;
                int tmp = sy;
                while(cnt -- > 0) {
                    if(tmp < 0) break;
                    if(parkArr[sx][tmp-1] == 'X') break;
                    tmp--;
                }
                if(sy-Integer.parseInt(routeArr[1]) != tmp) continue;
                sy-=Integer.parseInt(routeArr[1]);
            }
            else if(direction.equals("S")) {
                if(sx+cnt >= xMAX) continue;
                int tmp = sx;
                while(cnt -- > 0) {
                    if(tmp > xMAX) continue;
                    if(parkArr[tmp+1][sy] == 'X') continue;
                    tmp++;
                }
                if(sx+Integer.parseInt(routeArr[1]) != tmp) continue;
                sx+=Integer.parseInt(routeArr[1]);
            }

            else if(direction.equals("N")) {
                if(sx-cnt < 0) continue;
                int tmp = sx;
                while(cnt -- > 0) {
                    if(tmp < 0) continue;
                    if(parkArr[tmp-1][sy] == 'X') continue;
                    tmp--;

                }
                if(sx-Integer.parseInt(routeArr[1]) != tmp) continue;
                sx-=Integer.parseInt(routeArr[1]);
            }
        }

        return new int[]{sx, sy};
    }
}
