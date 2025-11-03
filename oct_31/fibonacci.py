max_term = int(input("Enter the N terms to print fibonacci series: "))

first = 0
second = 1

for i in range(2, max_term + 1):
  next_term = first + second
  print(first)
  first = second
  second = next_term
