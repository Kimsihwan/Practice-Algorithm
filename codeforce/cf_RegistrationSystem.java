package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class cf_RegistrationSystem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        while (N-- > 0){
            String s = br.readLine();
            if(map.containsKey(s)){
                Integer i = map.get(s);
                System.out.println(s+i);
                i++;
                map.put(s, i);
            }else{
                map.put(s, 1);
                System.out.println("OK");
            }
        }
    }

}
