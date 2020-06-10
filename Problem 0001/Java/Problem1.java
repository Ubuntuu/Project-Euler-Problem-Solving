class Problem1 {

  static int multiplesOf(int number1, int number2, int belowRange) {
    int sum = 0;
    int multiplier = 1;

    while (multiplier <= belowRange) {
      if ((number1 * multiplier) < belowRange) {
        sum += number1 * multiplier;
      }
      if ((number2 * multiplier) < belowRange) {
        sum += number2 * multiplier;
      }
      multiplier += 1;
    }
    return sum;
  }

  public static void main(String[] args) {
    var test1 = multiplesOf(3, 5, 10);
    var test2 = multiplesOf(3, 5, 1000);
    System.out.println(test1);
    System.out.println(test2);
  }
}
