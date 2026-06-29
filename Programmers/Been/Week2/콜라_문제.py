def solution(a, b, n):
    answer = 0
    num = n
    while num >= a:
        time = num // a       
        num_cola = time * b      
        answer += num_cola
        num = num % a + num_cola  

    return answer