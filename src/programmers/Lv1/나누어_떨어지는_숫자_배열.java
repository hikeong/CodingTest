package programmers.Lv1;

import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {0};

        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
                count++;
            }
        }

        if (count != 0) {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            Arrays.sort(answer);
        }
        else {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
