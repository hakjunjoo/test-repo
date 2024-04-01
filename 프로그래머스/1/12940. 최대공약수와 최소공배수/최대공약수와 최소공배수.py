def solution(n, m):
    # 최대공약수
    gcd = 1
    for num in range(min(n,m)) :
        num = num + 1
        if (n % num == 0) & (m % num == 0) :
            gcd = num
    
    # 최소공배수
    lcm = (n * m) // gcd
    
    answer = [gcd, lcm]
    return answer