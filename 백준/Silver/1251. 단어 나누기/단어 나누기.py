x = input()
test = []
for i in range(1, len(x) -1):
  for j in range(i+1, len(x)):
    first = x[:i][::-1]
    second = x[i:j][::-1]
    third = x[j:][::-1]
    test.append(first+second+third)
print(sorted(test)[0])