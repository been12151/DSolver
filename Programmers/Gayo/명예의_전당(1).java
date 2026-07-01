import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            if(arr.size()==k){
                Integer currMin = Collections.min(arr);
                if(currMin<score[i]){
                    arr.remove(currMin);
                    arr.add(score[i]);
                }
            answer[i] = Collections.min(arr);
            }
            else{
                arr.add(score[i]);
                answer[i] = Collections.min(arr);
            }
        }
        
        return answer;
    }
}