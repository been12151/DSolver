import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<Integer> arr = new ArrayList<>();
        String[] strArr = s.split(" ");
        
        for(String str : strArr){
            arr.add(Integer.parseInt(str));
        }
        
        answer += Collections.min(arr);
        answer += " ";
        answer += Collections.max(arr);
        return answer;
    }
}