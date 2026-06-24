class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num==1){
            return answer;
        }
        
        long n = num;
        while(answer<=500){
            if(n==1){
                break;
            }
            
            if(n%2==0){
                n = n / 2;
            }
            else{
                n = n*3 + 1;
            }
            answer++;
        }
        
        if(n!=1){
            answer = -1;
        }
        
        return answer;
    }
}