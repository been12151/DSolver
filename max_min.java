import java.util.*;
class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int[] arr = Arrays.stream(answer).mapToInt(Integer::parseInt).toArray();
        int max = arr[0];
        int min = arr[0];
        for(int n : arr){
            if(n>max){
                max = n;
            }
            if(n<min){
                min=n;
            }
        }
        return min + " " + max;
    }
}
