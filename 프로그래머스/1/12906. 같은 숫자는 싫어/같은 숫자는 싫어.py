def solution(arr):
    #최초 원소 넣고 시작
    answer = [arr[0]]
    
    for num in arr: 
        if answer[-1] != num:
            answer.append(num)
    
    return answer