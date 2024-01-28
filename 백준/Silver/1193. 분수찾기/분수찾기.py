n = int(input())
line = 0
m = 1
s = 1

while (n>line):
    n = n - line
    line = line + 1  

if line % 2 == 0:
  m = n
  s = line-n +1
else:
  m = line-n+1
  s = n

print(str(m) + "/" + str(s))