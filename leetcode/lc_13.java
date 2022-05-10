package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 이름 : Roman to Integer
 * url : https://leetcode.com/problems/roman-to-integer/
 * 
 * @author kimsihwan
 *
 */
public class lc_13 {

	public int romanToInt(String s) {

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);


		Integer answer = 0;

		char[] chars = s.toCharArray();
		for (int i = 0 ; i < chars.length; i++){

			char v = chars[i];

			if(i == chars.length - 1){
				answer += map.get(v);
				break;
			}

			switch (v){
				case 'I':;
					if(chars[i+1] == 'V'){
						answer += 4;
						i++;
					}else if(chars[i+1] == 'X'){
						answer += 9;
						i++;
					}else {
						answer += map.get(v);
					}
					break;
				case 'X':
					if(chars[i+1] == 'L'){
						answer += 40;
						i++;
					}else if(chars[i+1] == 'C'){
						answer += 90;
						i++;
					}else {
						answer += map.get(v);
					}
					break;
				case 'C':
					if(chars[i+1] == 'D'){
						answer += 400;
						i++;
					}else if(chars[i+1] == 'M'){
						answer += 900;
						i++;
					}else {
						answer += map.get(v);
					}
					break;
				default:
					answer += map.get(v);
			}
		}

		return answer;
	}
}
