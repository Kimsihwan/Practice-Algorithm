import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 이름 : 2007년
 * url : https://www.acmicpc.net/problem/1924
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int m = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		LocalDate date = LocalDate.of(2007, m, d);

		DayOfWeek day = date.getDayOfWeek();

		System.out.println(day.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase());
	}

}
