def solution(a, b):
    length = abs(b-a) + 1
    answer = 0
    
    for i in range(length) :
        answer += min(a,b) + i
    
    return answer