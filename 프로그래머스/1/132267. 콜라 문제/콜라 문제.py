def solution(a, b, n):
    answer = 0
    bottle = n
    
    while bottle // a != 0 :
        return_bottle = b * (bottle // a)
        remain_bottle = bottle % a
        
        answer += return_bottle
        
        bottle = return_bottle + remain_bottle
        
    return answer