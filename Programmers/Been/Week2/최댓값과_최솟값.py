def solution(s):
    answer = s.split(" ")
    result = list(map(int, answer))
    min_val = min(result)
    max_val = max(result)
    return f"{min_val} {max_val}"