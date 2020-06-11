sequence = [0, 1]

# find all fibonacci sequence below a number
def fibonacci_sequence(below: int):
    next_number = 0
    while next_number < below:
        next_number = sequence[-1] + sequence[-2]
        if next_number < below:
            sequence.append(next_number)

# Sum all the even numbers in the sequence
def sum_even_numbers():
    sum = 0
    for number in sequence:
        if number % 2 == 0:
            sum += number
    return sum

if __name__ == '__main__':
    fibonacci_sequence(4000000)
    print(sum_even_numbers())
