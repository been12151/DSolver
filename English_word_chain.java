import java.util.*;
class Solution {
public int[] solution(int n, String[] words) {
int[] answer = {};
List<String> list = new ArrayList<>();
list.add(words[0]);
String prev = words[0];
for(int i=1;i<words.length;i++){
String curr = words[i];
if(prev.charAt(prev.length()-1) == curr.charAt(0)){
if(list.contains(curr)){
return answer = result(n,i);
}
list.add(curr);
prev = curr;
}else{
return result(n,i);
}
}
return new int[]{0,0};
}
public int[] result(int n, int index){
index+=1;
int num = index%n;
if(num==0){
num=n;
}
int seq = (index-1)/n+1;
return new int[]{num,seq};
}
}
