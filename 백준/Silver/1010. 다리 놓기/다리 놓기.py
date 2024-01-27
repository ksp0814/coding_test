# 메모이제이션을 위한 딕셔너리
memo_dict = {}

def bridge(n, r):
    # 기존에 계산한 값이 있다면 그 값을 반환
    if (n, r) in memo_dict:
        return memo_dict[(n, r)]
    
    # 이항 계수 계산
    if r == 0 or n == r:
        result = 1
    else:
        result = bridge(n-1, r-1) + bridge(n-1, r)
    
    # 계산한 값을 메모이제이션
    memo_dict[(n, r)] = result
    return result

def count(w, e):
    # 다리를 지을 수 있는 경우의 수 계산
    return bridge(e, w)

test_case = int(input())

count_list = []

for i in range(test_case):
    w, e = map(int, input().split())  
    result = count(w, e)
    count_list.append(result)

for x in count_list:
    print(x, end="\n")
