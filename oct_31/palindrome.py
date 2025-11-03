string = input("Enter a string: ")
str_len = len(string)

is_palindrome = False

for i in range(int(str_len / 2)):
    if string[i] == string[str_len - 1 - i]:
        is_palindrome = True

if is_palindrome:
  print("The provided string is palindrome.")
else:
  print("The provided string is not palindrome.")
