def solution(s):
    word_to_num = {
        "zero": "0", "one": "1", "two": "2", "three": "3", "four": "4",
        "five": "5", "six": "6", "seven": "7", "eight": "8", "nine": "9"
    }
    answer = ''
    i = 0
    while i < len(s):
        if s[i].isdigit():
            answer += s[i]
            i += 1
        else:
            for k,v in word_to_num.items():
                if s[i: i+len(k)] == k:
                    answer += v
                    i += len(k)
            pass
    
    return int(answer)