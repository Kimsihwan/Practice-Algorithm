package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 이름 : 신고 결과 받기
 * url : https://programmers.co.kr/learn/courses/30/lessons/92334
 * 
 * @author kimsihwan
 *
 */
public class pm_12901 {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, Integer> index = new HashMap<String, Integer>();
		Map<String, List<Integer>> list = new HashMap<String, List<Integer>>();

		for (int i = 0; i < id_list.length; i++) {
			index.put(id_list[i], i);
		}

		for (String rep : report) {
			StringTokenizer st = new StringTokenizer(rep);
			String fromId = st.nextToken();
			String toId = st.nextToken();
			if (!list.containsKey(toId))
				list.put(toId, new ArrayList<Integer>());
			List<Integer> tmp = list.get(toId);
			if (!tmp.contains(index.get(fromId))) {
				tmp.add(index.get(fromId));

			}
		}

		for (int i = 0; i < id_list.length; i++) {
			String id = id_list[i];
			if (list.containsKey(id) && list.get(id).size() >= k) {
				for (int idx : list.get(id)) {
					answer[idx]++;
				}
			}
		}

		return answer;
	}

}
