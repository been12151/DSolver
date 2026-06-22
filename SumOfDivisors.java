import java.lang.*;
class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<=(int)(Math.sqrt(n));i++){
            if(n%i==0){
                if(i==n/i){
                    answer=answer+i;
                }else{
                    answer=answer+i+(n/i);
                }
            }
        }
        return answer;
    }
}
cat > SumOfDivisors.java << 'EOF'
import java.lang.*;
class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<=(int)(Math.sqrt(n));i++){
            if(n%i==0){
                if(i==n/i){
                    answer=answer+i;
                }else{
                    answer=answer+i+(n/i);
                }
            }
        }
        return answer;
    }
}
