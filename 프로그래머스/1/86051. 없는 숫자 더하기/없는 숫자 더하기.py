def solution(numbers):
    zero_to_nine = {0:0,1:1,2:2,3:3,4:4,5:5,6:6,7:7,8:8,9:9}
    
    # 번호 제거
    for i in numbers :
        zero_to_nine.pop(i)
        
    # 남은 값 더하기
    answer = 0
    for i in zero_to_nine :
        answer += i
        
    return answer