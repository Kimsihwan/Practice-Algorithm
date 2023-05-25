package programmers;

public class pm_142086 {
    public String solution(int[] food) {
        int[] newFood = new int[food.length-1];
        for(int i = 0; i < newFood.length; i++) {
            newFood[i] = food[i+1]/2;
        }

        String answer = "";
        for(int i = 0; i < newFood.length; i++) {
            int cnt = newFood[i];
            while(cnt-- > 0) {
                answer+= String.valueOf(i+1);
            }
        }

        return answer+"0"+new StringBuilder(answer).reverse().toString();
    }
}
