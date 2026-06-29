def solution(n, words):
    answer = []
    for i in range(len(words)):
            if answer == []:
                answer.append(words[i])
            elif answer != [] and words[i-1][-1] == words[i][0] and words[i] not in answer:
                answer.append(words[i])
            else:
                return [i % n + 1, i // n + 1]
    
    
    return [0,0]