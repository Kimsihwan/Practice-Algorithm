package codility.lesson.Iterations;

public class BinaryGap {
    public int solution(int N) {
        String binary = Integer.toString(N, 2); // == toBinaryString(N);
        char[] arr = binary.toCharArray();

        int size = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '0') {
                size++;
            } else {
                max = Math.max(max, size);
                size = 0;
            }
        }

        return max;
    }
}
