package programmers;

import java.util.*;

public class pm_17677 {
    public int solution(String str1, String str2) {
        int answer = 0;

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        for(int i = 0; i < arr1.length-1; i++) {
            char first = arr1[i];
            char second = arr1[i+1];

            if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
                list1.add(String.valueOf(first+""+second));
            }
        }

        for(int i = 0; i < arr2.length-1; i++) {
            char first = arr2[i];
            char second = arr2[i+1];

            if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
                list2.add(String.valueOf(first+""+second));
            }
        }

        for(String str : list1) {
            if(list2.remove(str)) {
                intersection.add(str);
            }
            union.add(str);
        }

        for(String str : list2) {
            union.add(str);
        }

        double jakard = 0;

        if(union.size() == 0) {
            jakard = 1;
        } else {
            jakard = (double) intersection.size() / (double) union.size();
        }


        return (int)(jakard * 65536);
    }
}
