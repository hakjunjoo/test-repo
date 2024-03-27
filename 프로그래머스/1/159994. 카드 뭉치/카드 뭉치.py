def solution(cards1, cards2, goal):
    answer = 'Yes'
    
    for word in goal :
        if word in cards1 :
            if word == cards1[0] :
                cards1.remove(word)
            else : 
                answer = 'No'
                break
        elif word in cards2 :
            if word == cards2[0] :
                cards2.remove(word)
            else : 
                answer = 'No'
                break
                
    return answer