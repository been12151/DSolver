def solution(answers):
    answer = []
    patterns = [
    [1,2,3,4,5],
    [2,1,2,3,2,4,2,5],
    [3,3,1,1,2,2,4,4,5,5]
    ]
    counts = [0, 0, 0]

    for i in range(len(answers)):
        for j in range(3):
            if answers[i] == patterns[j][i % len(patterns[j])]:
                counts[j] += 1
    
    max_count = max(counts)
    answer = [i+1 for i in range(3) if counts[i] == max_count]
    
    return answer