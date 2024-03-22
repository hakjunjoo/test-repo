def solution(t, p):
    num_arr = []
    for i in range(len(t)-len(p)+1) :      
        num_arr.append(t[i:i+len(p)])
    
    answer = 0
    
    for num in num_arr :
        if p >= num :
            answer += 1
    
    return answer