import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 이름 : 다이얼
 * url : https://www.acmicpc.net/problem/5622
 * 
 * @author kimsihwan
 *
 */
public class BOJ_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while (N-- > 0) {
			char beforeChar = '0';
			Map<Character, Integer> map = new HashMap<>();
			String str = br.readLine();
			boolean flag = true;
			for (char v : str.toCharArray()) {
				if (beforeChar != v && !map.isEmpty() && map.containsKey(v)) {
					flag = false;
					break;
				}
				map.put(v, 1);
				beforeChar = v;
			}
			if (flag) cnt++;
		}

		System.out.println(cnt);

	}

}
