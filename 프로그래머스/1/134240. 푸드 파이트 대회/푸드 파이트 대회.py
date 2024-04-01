def solution(food):
    answer = ''
    
    for i, food_num in enumerate(food) :
        if (food_num // 2) >= 1 :
            number = food_num // 2
            for num in range(number) :
                answer += str(i)
                
    reverse_answer = ''
    for c in answer :
        reverse_answer = c + reverse_answer
    
    answer += '0'
    
    answer = answer + reverse_answer
    
    return answer