def solution(d, budget):
    d.sort()
    answer = 0
    spend = budget
    
    for i in d :
        if (spend - i) >= 0 :
            spend = spend - i
            answer += 1
        else :
            break
    
    return answer