def solution(arr, divisor):
    answer = []
    
    # 나누어 떨어지는 element 찾기
    for num in arr:
        if num % divisor == 0:
            answer.append(num)
    
    # 오름차순 배열
    answer.sort()
    
    # 나누어 떨어지는 element가 하나도 없을 때
    if len(answer) == 0:
        answer.append(-1)
    
    return answer