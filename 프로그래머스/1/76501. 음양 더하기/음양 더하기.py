def solution(absolutes, signs):
    for i, sign in enumerate(signs) :
        if sign == False :
            absolutes[i] = absolutes[i] * -1
            
    answer = sum(absolutes)
    return answer