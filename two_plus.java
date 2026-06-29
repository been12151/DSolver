import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int num = numbers[i]+numbers[j];
                treeSet.add(num);
            }
        }
        int[] answer = treeSet.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
