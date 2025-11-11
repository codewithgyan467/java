def fibonacci(n):
    if n == 1:
        print("1")
        return

    if n == 2:
        print("1 2")
        return

    first, second = 0, 1
    print(f"{first} {second}", end = "-")
    
    for i in range(2, n):
        fibo = first + second  
        print(fibo, end = "-")
        first = second
        second = fibo
    print()

n = 5
print(f"fibonacci series up to the element {n}:")
fibonacci(n)