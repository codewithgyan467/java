maxTerm = int(input("Enter the N terms to find sum of natural numbers: "))
sum = 0;

for i in range(1, maxTerm + 1):
  sum += i;

print(f"Sum of {maxTerm} natural numbers is {sum}.")
