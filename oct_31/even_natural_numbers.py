maxTerm = int(input("Enter the N terms of natural numbers: "))

print(f"All even nos. from first {maxTerm} natural numbers:")
for i in range(1, maxTerm + 1):
  if (i % 2 == 0):
    print(i)
