def solution(sizes):
    width = []
    hight = []
    for size in sizes :
        if size[0] > size[1] :
            width.append(size[0])
            hight.append(size[1])
        else :
            width.append(size[1])
            hight.append(size[0])
            
    answer = max(width) * max(hight)
    return answer