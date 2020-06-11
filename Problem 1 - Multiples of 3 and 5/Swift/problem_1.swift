#!/usr/bin/swift

func multilplesOf(number1: Int, number2: Int, belowRange: Int) -> Int {
  var sum = 0
  var multiplier = 1

  while multiplier <= belowRange {
    if (number1 * multiplier) < belowRange {
      sum += number1 * multiplier
    }
    if (number2 * multiplier) < belowRange {
      sum += number2 * multiplier
    }
    multiplier += 1
  }
  return sum
}


print(multilplesOf(number1: 3, number2: 5, belowRange: 1000))
