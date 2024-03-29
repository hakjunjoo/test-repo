def solution(name, yearning, photo):
    answer = []
    score = 0
    
    for picture in photo :
        for i, person in enumerate(picture) :
            if person in name :
                score += yearning[name.index(person)]
    
        answer.append(score)
        score = 0

    return answer