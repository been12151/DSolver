from itertools import combinations
def solution(numbers):
    return sorted(set(x + y for x, y in combinations(numbers, 2)))

def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        for j in range(i + 1, len(numbers)):
            answer.append(numbers[i] + numbers[j])
    return sorted(list(set(answer)))
