package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

/**
 * 이름 : 오늘의 날짜는?
 * url : https://www.acmicpc.net/problem/16170
 * 
 * @author kimsihwan
 *
 */
public class BOJ_16170 {

	public static void main(String[] args) throws IOException {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("UTC"));
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
	}
}
