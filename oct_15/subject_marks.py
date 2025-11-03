marks1 = float(input("Enter marks in subject 1: "))
marks2 = float(input("Enter marks in subject 2: "))
marks3 = float(input("Enter marks in subject 3: "))
marks4 = float(input("Enter marks in subject 4: "))
marks5 = float(input("Enter marks in subject 5: "))

total_marks = marks1 + marks2 + marks3 + marks4 + marks5
average = total_marks / 5
percentage = (total_marks / 500) * 100

print(f"Total Marks: {total_marks}")
print(f"Average Marks: {average}")
print(f"Percentage: {percentage}%")
