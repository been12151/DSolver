import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] answer={};
        int len = arr.length;
        int index = 0;
        if(len==1){
            return new int[]{-1};
        }else{
            int min = arr[index];
            list.add(Integer.valueOf(min));
            for(int i=1;i<len;i++){
                list.add(Integer.valueOf(arr[i]));
                if(arr[i]<min){
                    min = arr[i];
                    index =i;
                }
            }
            list.remove(Integer.valueOf(arr[index]));
            answer = list.stream().mapToInt(i->i).toArray();
        }
        return answer;
    }
}
