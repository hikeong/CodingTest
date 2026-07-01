package programmers.Lv1;

class 추억점수 {

    static int[] answer;
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        getAnswerArray(name, yearning, photo);

        return answer;
    }

    public int[] getAnswerArray(String[] name,
                                int[] yearning,
                                String[][] photo){
        answer = new int[photo.length];

        for(int i=0; i<photo.length; i++){
            answer[i] = getPhotoScore(name, yearning, photo[i]);
        }
        return answer;
    }

    public int getPhotoScore(String[] name,
                             int[] yearning,
                             String[] names){
        int sum =0;
        for(int i=0; i<names.length; i++){
            sum += getPersonScore(names[i], name, yearning);
        }
        return sum;
    }

    public int getPersonScore(String oneName,
                              String[] name,
                              int[] yearning){
        for(int j=0; j<name.length; j++){
            if(name[j].equals(oneName)) return yearning[j];
        }

        return 0;

    }

}