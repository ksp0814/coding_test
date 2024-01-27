n = int(input())
text = []
for i in range(n):
  text.append(input())

list_text = list(set(text))
list_text.sort()
list_text.sort(key=len)
for i in list_text:
  print(i)