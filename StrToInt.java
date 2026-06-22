class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 1;
        if(s.charAt(1)=='-'){
            sign = -1;   
        }
        answer = Integer.parseInt(s) * (sign);
        return answer;
    }
}
cat > StrToInt.java << 'EOF'
class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 1;
        if(s.charAt(1)=='-'){
            sign = -1;   
        }
        answer = Integer.parseInt(s) * (sign);
        return answer;
    }
}
