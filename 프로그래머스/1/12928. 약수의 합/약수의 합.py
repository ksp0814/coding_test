def solution(n):
    list_A = []
    for i in range(1,n+1):
        if n % i == 0:
            list_A.append(i)
    answer = sum(list_A)
    return answer
    