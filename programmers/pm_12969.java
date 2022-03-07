package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 직사각형 별찍기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12969
 * 
 * @author kimsihwan
 *
 */
public class pm_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
