def solution(num):
    answer = 0
    num_temp = num
    
    while num_temp != 1 :
        if num_temp % 2 == 0 :
            num_temp = num_temp/2
            answer += 1
        else :
            num_temp = num_temp*3 + 1
            answer += 1
        
        if answer > 500 :
            answer = -1
            break
            
    return answer