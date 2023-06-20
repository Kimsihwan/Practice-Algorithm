import java.io.*;
import java.util.*;

public class BOJ_10814 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            int age = Integer.parseInt(arr[0]);
            String name = arr[1];
            list.add(new Person(age, name, i));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(Person p : list) {
            sb.append(p.age+" "+p.name);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static class Person implements Comparable<Person> {
        int age;
        String name;
        int day;

        Person(int age, String name, int day) {
            this.age = age;
            this.name = name;
            this.day = day;
        }

        public int compareTo(Person o) {
            if(this.age < o.age) {
                return -1;
            } else if(this.age == o.age) {
                if(this.day < o.day) {
                    return -1;
                } else if(this.day == o.day) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }
    }
}