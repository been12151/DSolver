    public String solution(int[] food) {
        int len = 1;
        int count = 0;
        for(int i=1;i<food.length;i++){
            if(food[i]%2!=0){
                len = len + food[i] - 1;
                food[i] = food[i] - 1;
            }else{
                len+=food[i];   
            }
        }
         int[] answer = new int[len];
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                answer[count] = i;
                count++;
            }
        }
        answer[count] = 0;
        count++;
        for(int i=food.length-1;i>0;i--){
            for(int j=0;j<food[i]/2;j++){
                answer[count] = i;
                count++;
            }
        }
        String s="";
        for( int i=0;i<answer.length;i++){
            s+=answer[i];
        }
        return s;
    }
}
cat > FoodFight.java << 'EOF'
    public String solution(int[] food) {
        int len = 1;
        int count = 0;
        for(int i=1;i<food.length;i++){
            if(food[i]%2!=0){
                len = len + food[i] - 1;
                food[i] = food[i] - 1;
            }else{
                len+=food[i];   
            }
        }
         int[] answer = new int[len];
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                answer[count] = i;
                count++;
            }
        }
        answer[count] = 0;
        count++;
        for(int i=food.length-1;i>0;i--){
            for(int j=0;j<food[i]/2;j++){
                answer[count] = i;
                count++;
            }
        }
        String s="";
        for( int i=0;i<answer.length;i++){
            s+=answer[i];
        }
        return s;
    }
}
