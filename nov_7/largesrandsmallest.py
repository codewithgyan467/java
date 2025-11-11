def largest_and_smallest(numbers):
    # Handle the edge case of an empty list.
    if not numbers:
        return None, None

    # Use Python's built-in min() and max() functions for simplicity and efficiency.
    return max(numbers), min(numbers)

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
largest, smallest = largest_and_smallest(numbers)
if largest is not None:
    print(f"Largest: {largest}, Smallest: {smallest}")
else:
    print("The list is empty.")
