year = int(input("Enter year: "))

if year % 400 == 0 or year % 100 == 0 or year % 4 == 0:
    print(f"{year} is a leap year")
else:
    print(f"{year} is a non-leap year")
