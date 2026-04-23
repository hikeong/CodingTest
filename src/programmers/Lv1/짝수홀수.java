package programmers.Lv1;

class 짝수홀수 {
    public String solution(int num) {
        String answer = "Odd";

        if(num % 2 == 0){
            answer = "Even";
        }
        return answer;
    }
}
