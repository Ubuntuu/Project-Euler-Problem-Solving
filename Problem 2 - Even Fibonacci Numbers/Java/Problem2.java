import java.util.ArrayList;
import java.util.List;

class Problem2 {

  static List<Integer> sequence = new ArrayList<Integer>();

  static void fibonacciSequence(int below) {
    sequence.add(0);
    sequence.add(1);
    int nextNumber = 0;
    while (nextNumber < below) {
      nextNumber = sequence.get(sequence.size() -1) + sequence.get(sequence.size() - 2);
      if (nextNumber < below) {
        sequence.add(nextNumber);
      }
    }
  }

  static int sumEvenFibonacciNumbers() {
    int sum = 0;
    for (int number : sequence) {
      if (number % 2 == 0) {
        sum += number;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    fibonacciSequence(4000000);
    System.out.println(sumEvenFibonacciNumbers());
  }

}
