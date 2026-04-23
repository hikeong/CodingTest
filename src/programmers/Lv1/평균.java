package programmers.Lv1;

class 평균 {
    public double solution(int[] arr) {
        int sum = 0;
        int len = arr.length;

        for(int num : arr){
            sum += num;
        }

        double answer = (double) sum / len;
        return answer;
    }
}
