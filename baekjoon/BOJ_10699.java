package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 이름 : 오늘 날짜
 * url : https://www.acmicpc.net/problem/10699
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10699 {

	public static void main(String[] args) throws IOException {
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
	}
}
