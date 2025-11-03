char = input("Enter a char: ")[0]

if char.isupper():
    print(f"{char} is uppercase char")
elif char.islower():
    print(f"{char} is lowercase char")
else:
    print(f"{char} is non-alphabet")
