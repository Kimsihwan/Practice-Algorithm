package programmers;

/**
 * 이름 : 내적
 * url : https://programmers.co.kr/learn/courses/30/lessons/70128
 * 
 * @author kimsihwan
 *
 */
public class pm_70128 {


	public static void main(String[] args) {

		System.out.println(solution(11, new int[] { 4, 11 }, 1) == 3);
		System.out.println(solution(16, new int[] { 9 }, 2) == 3);
	}

    static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int leftStart = 1;

        for (int sub : stations) {
            if (leftStart < sub - w) {
                int leftEnd = sub - w;

                int length = leftEnd - leftStart;

                // left ~ right 구간의 기지국 개수
                int count = length / (w * 2 + 1);
                if (length % (w * 2 + 1) != 0)
                    count++;

                answer += count;
            }

            leftStart = sub + w + 1;
        }

        if(stations[stations.length-1] + w < n){
            leftStart = stations[stations.length-1] + w + 1;

            int leftEnd = n + 1;

            int length = leftEnd - leftStart;

            // left ~ right 구간의 기지국 개수
            int count = length / (w * 2 + 1);
            if (length % (w * 2 + 1) != 0)
                count++;

            answer += count;
        }

        return answer;
    }

}
