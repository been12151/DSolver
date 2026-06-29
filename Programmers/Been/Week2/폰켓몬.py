from collections import Counter
def solution(nums):
    answer = Counter(nums)
    return min(len(Counter(nums)), len(nums) // 2)