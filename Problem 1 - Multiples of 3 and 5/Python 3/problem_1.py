def multiples_of(number_1: int, number_2: int, below_range: int):
    sum = 0
    multiplier = 1

    while (multiplier <= below_range):
        if (number_1 * multiplier) < below_range:
            sum += number_1 * multiplier
        if (number_2 * multiplier) < below_range:
            sum += number_2 * multiplier
        multiplier += 1
    print(sum)

if __name__ == '__main__':
    multiples_of(3, 5, 1000)
