package programmers;

public class pm_118666 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int R = 0; //
        int T = 0;

        int C = 0;
        int F = 0;

        int J = 0;
        int M = 0;

        int A = 0;
        int N = 0;

        for(int i = 0; i < survey.length; i++) {
            String[] arr = survey[i].split("");

            int choice = choices[i];
            if(choice == 4) continue;

            String surv = "";

            int tmp = choice;
            choice -= 4;
            if(tmp < 4) {
                choice = Math.abs(choice);
                surv = arr[0];
            } else if(tmp > 4) {
                surv = arr[1];
            }

            switch(surv) {
                case "R": R+=choice; break;
                case "T": T+=choice; break;
                case "C": C+=choice; break;
                case "F": F+=choice; break;
                case "J": J+=choice; break;
                case "M": M+=choice; break;
                case "A": A+=choice; break;
                case "N": N+=choice; break;
            }
        }

        if(R >= T) {
            answer += "R";
        } else  {
            answer += "T";
        }

        if(C >= F) {
            answer += "C";
        } else  {
            answer += "F";
        }

        if(J >= M) {
            answer += "J";
        } else  {
            answer += "M";
        }

        if(A >= N) {
            answer += "A";
        } else  {
            answer += "N";
        }

        return answer;
    }
}
